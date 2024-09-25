package cn.codefit.quju.gateway.filter;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.nimbusds.jose.JWSObject;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URLEncoder;
import java.nio.charset.Charset;

/**
 * 自定义全局过滤器AuthGlobalFilter
 * 在自定义鉴权管理器鉴权后处理比如:
 * 1、黑名单拦截
 * 2、解析jwt令牌用户信息,直接存放到header中等,方便后续服务使用
 * 2、将JWT令牌中的用户信息解析出来，然后存入请求的Header中，这样后续服务就不需要解析JWT令牌了，可以直接从请求的Header中获取到用户信息
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class GatewaySecurityFilter implements GlobalFilter, Ordered {

    private final RedisTemplate redisTemplate;

    @Value("${spring.profiles.active}")
    private String env;

    @SneakyThrows
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();

        // 解析JWT获取jti，以jti为key判断redis的黑名单列表是否存在，存在则拦截访问
        String token = request.getHeaders().getFirst(Constant.AUTHORIZATION_KEY);
        String platform = request.getHeaders().getFirst("platform");
        if (StrUtil.isBlank(token) || !StrUtil.startWithIgnoreCase(token, Constant.JWT_PREFIX)) {
            return chain.filter(exchange);
        }
        token = StrUtil.replaceIgnoreCase(token, Constant.JWT_PREFIX, Strings.EMPTY);

        /**获取有效载荷-即jwt的主体部分
         * 默认有一下七个字段，其中jti用于标识jwt
         * iss：发行人
         * exp：到期时间
         * sub：主题
         * aud：用户
         * nbf：在此之前不可用
         * iat：发布时间
         * jti：JWT ID用于标识该JWT
         */
        String payload = StrUtil.toString(JWSObject.parse(token).getPayload());
        JSONObject jsonObject = JSONUtil.parseObj(payload);
        String jti = jsonObject.getStr(Constant.JWT_JTI);

        Boolean isBlack = redisTemplate.hasKey(Constant.TOKEN_BLACKLIST_PREFIX + jti);
        if (isBlack) {
            response.setStatusCode(HttpStatus.FORBIDDEN);
            response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
            response.getHeaders().setAccessControlAllowOrigin("*");
            response.getHeaders().setCacheControl("no-cache");
            DataBufferFactory dataBufferFactory = response.bufferFactory();
            String body = JSONUtil.toJsonStr(CommonResponse.error(ResponseCode.TOKEN_ACCESS_FORBIDDEN));
            DataBuffer buffer = dataBufferFactory.wrap(body.getBytes(Charset.defaultCharset()));
            return response.writeWith(Mono.just(buffer)).doOnError((error) -> DataBufferUtils.release(buffer));
        }

        // token有效不在黑名单中，request写入JWT的载体信息传递给其他服务
        request = exchange.getRequest().mutate()
                .header(Constant.JWT_PAYLOAD_KEY, URLEncoder.encode(payload, "UTF-8"))
                .header("platform", platform)
                .build();
        exchange = exchange.mutate().request(request).build();
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

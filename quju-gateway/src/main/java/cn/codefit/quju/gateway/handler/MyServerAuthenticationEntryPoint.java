package cn.codefit.quju.gateway.handler;

import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.hutool.json.JSONUtil;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.server.ServerAuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;

/**
 * 自定义token无效或者已过期自定义响应
 */
@Component
public class MyServerAuthenticationEntryPoint implements ServerAuthenticationEntryPoint {

    /**
     * 自定义token无效或者已过期自定义响应
     * @param exchange
     * @param ex
     * @return
     */
    @Override
    public Mono<Void> commence(ServerWebExchange exchange, AuthenticationException ex) {
        return Mono.defer(() -> Mono.just(exchange.getResponse())).flatMap((response) -> {
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
            response.getHeaders().setAccessControlAllowOrigin("*");
            response.getHeaders().setCacheControl( "no-cache");
            DataBufferFactory dataBufferFactory = response.bufferFactory();

            String body = JSONUtil.toJsonStr(CommonResponse.error(ResponseCode.TOKEN_INVALID_OR_EXPIRED));
            DataBuffer buffer = dataBufferFactory.wrap(body.getBytes(Charset.defaultCharset()));

            return response.writeWith(Mono.just(buffer)).doOnError((error) -> DataBufferUtils.release(buffer));
        });
    }
}

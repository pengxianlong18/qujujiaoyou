package cn.codefit.quju.gateway.handler;

import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.hutool.json.JSONUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.server.authorization.ServerAccessDeniedHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;

/**
 * 自定义未授权响应
 */
@Component
public class MyServerAccessDeniedHandler implements ServerAccessDeniedHandler {

    /**
     * 自定义未授权响应
     * @param exchange
     * @param denied
     * @return
     */
    @Override
    public Mono<Void> handle(ServerWebExchange exchange, AccessDeniedException denied) {
        return Mono.defer(() -> Mono.just(exchange.getResponse())).flatMap((response) -> {
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
            response.getHeaders().setAccessControlAllowOrigin("*");
            response.getHeaders().setCacheControl( "no-cache");
            DataBufferFactory dataBufferFactory = response.bufferFactory();

            String body = JSONUtil.toJsonStr(CommonResponse.error(ResponseCode.ACCESS_UNAUTHORIZED));
            DataBuffer buffer = dataBufferFactory.wrap(body.getBytes(Charset.defaultCharset()));

            return response.writeWith(Mono.just(buffer)).doOnError((error) -> DataBufferUtils.release(buffer));
        });
    }

}

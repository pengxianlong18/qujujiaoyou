package cn.codefit.quju.gateway.security;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.gateway.handler.MyServerAccessDeniedHandler;
import cn.codefit.quju.gateway.handler.MyServerAuthenticationEntryPoint;
import cn.hutool.core.codec.Base64;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.io.IoUtil;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtReactiveAuthenticationManager;
import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;
import org.springframework.security.web.server.SecurityWebFilterChain;
import reactor.core.publisher.Mono;

import java.io.InputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;

/**
 * 资源服务器配置
 * 主要是配置:自定义鉴权管理器、
 * 无需鉴权的url白名单、
 * 无权访问或无效token的自定义异常响应。
 */
@ConfigurationProperties(prefix = "security.ignore")
@RequiredArgsConstructor
@Configuration
@EnableWebFluxSecurity
@Slf4j
@RefreshScope
public class ResourceServerConfig {

    /**
     * 自定义鉴权管理器
     */
    private final AuthorizationManager resourceServerManager;
    /**
     * 自定义未授权响应
     */
    private final MyServerAccessDeniedHandler myServerAccessDeniedHandler;
    /**
     * 自定义token无效或者已过期自定义响应
     */
    private final MyServerAuthenticationEntryPoint myServerAuthenticationEntryPoint;
    /**
     * 无需鉴权的url白名单
     */
    @Setter
    private List<String> urls;

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        ServerHttpSecurity.OAuth2ResourceServerSpec.JwtSpec jwtSpec = http.oauth2ResourceServer().jwt();
        /**
         * 公钥加载方式
         *      1、.publicKey(rsaPublicKey());   // 本地加载公钥
         *      2、.jwkSetUri()  // 远程获取公钥，默认读取的key是spring.security.oauth2.resourceserver.jwt.jwk-set-uri;
         */
        jwtSpec.publicKey(rsaPublicKey());
        //todo 方式一、解决-OAuth2ResourceServer(oauth2资源服务配置中)-ServerHttpSecurity-hasRole()无效问题
        jwtSpec.jwtAuthenticationConverter(jwtAuthenticationConverter());
        //todo 方式二、自定义ReactiveAuthenticationManager
//        jwtSpec.authenticationManager(getAuthenticationManager());

        //自定义处理JWT请求头过期或签名错误的结果
//        http.oauth2ResourceServer().authenticationEntryPoint(myServerAuthenticationEntryPoint);

        http.authorizeExchange()
                //放行所有白名单接口
                .pathMatchers(Convert.toStrArray(urls)).permitAll()
                //鉴权管理器配置
                .anyExchange().access(resourceServerManager)
                .and().exceptionHandling()
                // 处理未授权
                .accessDeniedHandler(myServerAccessDeniedHandler)
                //处理未认证
                .authenticationEntryPoint(myServerAuthenticationEntryPoint)
                .and().csrf().disable();
        return http.build();
    }


    /**
     * 方案一、重新定义权限管理器-默认转换器JwtGrantedAuthoritiesConverter
     */
    @Bean
    public Converter<Jwt, ? extends Mono<? extends AbstractAuthenticationToken>> jwtAuthenticationConverter() {
        JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();
        jwtGrantedAuthoritiesConverter.setAuthorityPrefix(Constant.AUTHORITY_PREFIX);
        jwtGrantedAuthoritiesConverter.setAuthoritiesClaimName(Constant.JWT_AUTHORITIES_KEY);

        JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(jwtGrantedAuthoritiesConverter);
        return new ReactiveJwtAuthenticationConverterAdapter(jwtAuthenticationConverter);
    }

    /**
     * 方案二、自定义ReactiveAuthenticationManager
     */
    ReactiveAuthenticationManager getAuthenticationManager() {
        //远程或本地加载公钥
        NimbusReactiveJwtDecoder nimbusReactiveJwtDecoder = new NimbusReactiveJwtDecoder(rsaPublicKey());

        JwtReactiveAuthenticationManager jwtReactiveAuthenticationManager = new JwtReactiveAuthenticationManager(nimbusReactiveJwtDecoder);

        JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();
        jwtGrantedAuthoritiesConverter.setAuthorityPrefix(Constant.AUTHORITY_PREFIX);
        jwtGrantedAuthoritiesConverter.setAuthoritiesClaimName(Constant.JWT_AUTHORITIES_KEY);

        JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(jwtGrantedAuthoritiesConverter);

        ReactiveJwtAuthenticationConverterAdapter reactiveJwtAuthenticationConverterAdapter = new ReactiveJwtAuthenticationConverterAdapter(jwtAuthenticationConverter);

        jwtReactiveAuthenticationManager.setJwtAuthenticationConverter(reactiveJwtAuthenticationConverterAdapter);
        return jwtReactiveAuthenticationManager;
    }

    /**
     * 本地获取JWT验签公钥
     */
    @SneakyThrows
    @Bean
    public RSAPublicKey rsaPublicKey() {
        Resource resource = new ClassPathResource("public.key");
        InputStream is = resource.getInputStream();
        String publicKeyData = IoUtil.read(is).toString();
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec((Base64.decode(publicKeyData)));

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        RSAPublicKey rsaPublicKey = (RSAPublicKey) keyFactory.generatePublic(keySpec);
        return rsaPublicKey;
    }
}

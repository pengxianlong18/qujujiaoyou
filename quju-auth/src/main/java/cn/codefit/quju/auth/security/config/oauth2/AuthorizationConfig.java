package cn.codefit.quju.auth.security.config.oauth2;

import cn.codefit.quju.auth.security.provider.wechat.WechatTokenGranter;
import cn.codefit.quju.auth.security.token.QujuJwtAccessTokenConverter;
import cn.codefit.quju.auth.security.userdetails.client.ClientDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.CompositeTokenGranter;
import org.springframework.security.oauth2.provider.TokenGranter;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 适配者模式
 * oauth2核心配置类
 * TokenEndpoint的注入---@EnableAuthorizationServer【开启授权服务】---
 * 开启授权时，会在 AuthorizationServerEndpointsConfiguration 中找到TokenEndpoint的初始化。
 */
@EnableAuthorizationServer
@Configuration
@RequiredArgsConstructor
public class AuthorizationConfig extends AuthorizationServerConfigurerAdapter {

    private final ClientDetailsServiceImpl clientDetailsService;
    private final AuthenticationManager authenticationManager;

    private final UserDetailsService systemUserDetailsService;

    /**
     * 用来配置令牌端点(Token Endpoint)的安全约束
     *
     * @param security
     * @throws Exception
     */

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        super.configure(security);
    }

    /**
     * 用来配置OAuth2客户端详情服务
     *
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(clientDetailsService);
    }

    /**
     * 用来配置授权（authorization）以及令牌（token）的访问端点和令牌服务(token services)
     *
     * @param endpoints
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        // Token增强---令牌增强器链
        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
        List<TokenEnhancer> tokenEnhancers = new ArrayList<>();
        tokenEnhancers.add(jwtAccessTokenConverter());
        tokenEnhancerChain.setTokenEnhancers(tokenEnhancers);

        // 获取系统中原有默认授权模式(授权码模式、密码模式、客户端模式、简化模式)的授权者
        List<TokenGranter> granterList = new ArrayList<>(Arrays.asList(endpoints.getTokenGranter()));
        // 添加微信授权模式的授权者
        granterList.add(new WechatTokenGranter(endpoints.getTokenServices(), endpoints.getClientDetailsService(),
                endpoints.getOAuth2RequestFactory(), authenticationManager));

        //todo 这是一个组合模式,实现了TokenGranter接口,循环调用List中的TokenGranter组件进行校验处理，直到返回验证成功信息或者是异常信息
        CompositeTokenGranter compositeTokenGranter = new CompositeTokenGranter(granterList);
        endpoints.tokenGranter(compositeTokenGranter);

        endpoints
                .authenticationManager(authenticationManager)
                .accessTokenConverter(jwtAccessTokenConverter())
                .tokenEnhancer(tokenEnhancerChain)
                //该字段用于设置refresh_token是否允许重复使用
                .reuseRefreshTokens(true)
                //刷新令牌是包含对用户详细信息的检查，以确保账号正常，因此这里需要配置userDetailsService
                .userDetailsService(systemUserDetailsService);

    }


    /**
     * 使用非对称加密算法来对Token进行签名
     *
     * @return
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        //使用自定义JwtAccessToken转换器
        final JwtAccessTokenConverter converter = new QujuJwtAccessTokenConverter();
        // 导入证书
        KeyStoreKeyFactory keyStoreKeyFactory =
                new KeyStoreKeyFactory(new ClassPathResource("jwt.jks"), "123456".toCharArray());
        //todo 解析拿到公钥和私钥
        KeyPair keyPair = keyStoreKeyFactory.getKeyPair("jwt", "123456".toCharArray());
        converter.setKeyPair(keyPair);
        return converter;
    }


}

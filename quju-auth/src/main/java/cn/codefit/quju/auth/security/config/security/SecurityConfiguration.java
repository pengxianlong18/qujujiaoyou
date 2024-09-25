package cn.codefit.quju.auth.security.config.security;


import cn.codefit.quju.app.api.service.AppletUserService;
import cn.codefit.quju.auth.security.provider.wechat.WechatAuthenticationProvider;
import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.rpc.CommonResponse;
import com.alibaba.fastjson.JSONObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * spring security 核心配置类
 * WebSecurityConfigurerAdapter
 * 管理着Spring Security的整个配置体系，主要包括用户身份认证的管理、全局安全过滤管理和URL访问权限控制的管理。
 */
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@Slf4j
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final UserDetailsService systemUserDetailsService;
    private final UserDetailsService wechatUserDetailsService;

    @DubboReference(version = Constant.VERSION, timeout = 30000)
    private AppletUserService appletUserService;

    @Value("${spring.profiles.active}")
    private String env;

    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        //指定加密、校验密码方式为不加密
//        passwordEncoder=NoOpPasswordEncoder.getInstance();
        String result = passwordEncoder.encode("123456");
        log.info("result=" + result);
        System.out.println("result = " + result);
        boolean b = passwordEncoder.matches("12345", result);
        System.out.println("b = " + b);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.debug(true);
        super.configure(web);
    }

    /**
     * 自定义URL访问权限的逻辑
     * 安全过滤器链配置方法
     * 通过重载该方法，可配置如何通过拦截器保护请求。
     * HttpSecurity 用于构建一个安全过滤器链 SecurityFilterChain .SecurityFilterChain 最终被注入核心过滤器
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                //过滤请求
                .authorizeRequests()
                .antMatchers("/oauth/**", "/oauth/token").permitAll()
                .and().formLogin().loginProcessingUrl("/login").successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
                        response.getWriter().write(JSONObject.toJSONString(CommonResponse.success(authentication.getPrincipal())));
                    }
                }).permitAll()
                // 由于使用的是JWT，我们这里不需要csrf
                .and().csrf().disable();
    }

    /**
     * 配置认证管理器
     * 配置认证管理器 AuthenticationManager
     * AuthenticationManager的辅助构造方法
     *
     * @param auth 身份验证管理生成器
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                //认证提供者 - 微信认证
                .authenticationProvider(wechatAuthenticationProvider())
                //认证提供者 - 用户名密码认证
                .authenticationProvider(daoAuthenticationProvider())
        ;
    }

    /**
     * 身份认证管理器  AuthenticationManager
     * 其是各种类型登录方式、或者Authentication（*AuthenticationToken）辅助认证Provider的管理对象。
     * AuthenticationManager--认证相关的核心接口--同时也是发起认证的出发点，
     * 如果不配置SpringBoot会自动配置一个AuthenticationManager,但由于我们新增了身份认证逻辑，需要需要在此处声明出来，以暴露给oauth2使用
     *
     * @return
     * @throws Exception
     */
    @Override
    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 微信认证授权提供者
     *
     * @return
     */
    @Bean
    public WechatAuthenticationProvider wechatAuthenticationProvider() {
        WechatAuthenticationProvider provider = new WechatAuthenticationProvider();
        provider.setUserDetailsService(wechatUserDetailsService);
        provider.setAppletUserService(appletUserService);
        provider.setPasswordEncoder(passwordEncoder());
        provider.setEnv(env);
        return provider;
    }

    /**
     * 用户名密码认证授权提供者
     *
     * @return
     */
    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(systemUserDetailsService);
        //设置密码编码器
        provider.setPasswordEncoder(passwordEncoder());
        //禁止隐藏用户未找到异常
        provider.setHideUserNotFoundExceptions(false); // 是否隐藏用户不存在异常，默认:true-隐藏；false-抛出异常；
        return provider;
    }

    /**
     * 密码编码器
     * 委托方式，根据密码的前缀选择对应的encoder，
     * 例如：{bcypt}前缀->标识BCYPT算法加密；{noop}->标识不使用任何加密即明文的方式
     * 密码判读 DaoAuthenticationProvider#additionalAuthenticationChecks
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}

package cn.codefit.quju.gateway.security;

import cn.codefit.base.redis.util.RedisUtil;
import cn.codefit.quju.base.constant.Constant;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpMethod;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.ReactiveAuthorizationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.server.authorization.AuthorizationContext;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * 自定义鉴权管理器-用于判断是否有资源的访问权限
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class AuthorizationManager implements ReactiveAuthorizationManager<AuthorizationContext> {

    private final RedisUtil redisUtil;

    /**
     * 基于路径匹配器授权
     *  这种方法主要是基于用户拥有的资源路径进行考量。
     * @param mono
     * @param authorizationContext
     * @return
     */
    @Override
    public Mono<AuthorizationDecision> check(Mono<Authentication> mono, AuthorizationContext authorizationContext) {
        ServerHttpRequest request = authorizationContext.getExchange().getRequest();
        //直接放行预检请求
        if (request.getMethod() == HttpMethod.OPTIONS) {
            return Mono.just(new AuthorizationDecision(true));
        }
        //请求资源
        String path = request.getURI().getPath();
        String method = request.getMethodValue().toLowerCase();

        String urlPerm = method + ":" + path;

        //系统仅处理以bearer为前缀的，有效的jwt token
        String token = request.getHeaders().getFirst(Constant.AUTHORIZATION_KEY);
        if(StringUtils.isBlank(token)){
            return Mono.just(new AuthorizationDecision(false));
        }
        if(!StrUtil.startWithIgnoreCase(token, Constant.JWT_PREFIX)){
            return Mono.just(new AuthorizationDecision(false));
        }
        if(StrUtil.startWithIgnoreCase(path,"/quju-app/")){
            return Mono.just(new AuthorizationDecision(true));
        }
        // 判断JWT中携带的用户角色是否有权限访问
        Mono<AuthorizationDecision> authorizationDecisionMono = mono
                .filter(Authentication::isAuthenticated)
                .flatMapIterable(Authentication::getAuthorities)
                .map(GrantedAuthority::getAuthority)
                .any(authority -> {
//                    return checkToken(authority,urlPerm);
                    return true;
                })
                .map(AuthorizationDecision::new)
                .defaultIfEmpty(new AuthorizationDecision(false));
        return authorizationDecisionMono;
    }

    /**
     * 权限校验
     * @param authority 已授权角色信息
     * @param path 请求地址
     * @return
     */
    private boolean checkToken(String authority,String path) {
        //移除前缀ROLE_得到用户的角色编码
        String roleCode = StrUtil.removePrefix(authority,Constant.AUTHORITY_PREFIX);
        // 如果是超级管理员则放行
        if (Constant.ROOT_ROLE_CODE.equals(roleCode)||Constant.WECHAT_ROLE_CODE.equals(roleCode)) {
            return true;
        }
        //否则校验当前角色-是否拥有此接口访问权限
        Object object=redisUtil.hGet(Constant.REDIS_HASH_ROLE_MENU_KEY,roleCode);
        if(object==null){
            return false;
        }
        List<String> menus= Arrays.asList(object.toString().split(","));
        boolean hasAuthorized = CollectionUtil.isNotEmpty(menus) && menus.contains(path);
        return hasAuthorized;
    }

}

package cn.codefit.quju.auth.security.provider.wechat;

import lombok.Getter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.Assert;

import java.util.Collection;

/**
 * https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/deprecatedGetPhoneNumber.html
 */
public class WechatAuthenticationToken extends AbstractAuthenticationToken {
    private static final long serialVersionUID = 550L;
    /**
     * 小程序登录  动态令牌 loginCode
     */
    private final Object principal;
    /**
     * 包括敏感数据在内的完整用户信息的加密数据
     */
    @Getter
    private String encryptedData;
    /**
     * 加密算法的初始向量
     */
    @Getter
    private String iv;
    /**
     * 获取手机号 动态令牌
     */
    private String phoneCode;


    /**
     * 账号校验之前的token构建
     *
     * @param principal
     */
    public WechatAuthenticationToken(Object principal, String phoneCode) {
        super(null);
        this.principal = principal;
        this.phoneCode = phoneCode;
    }

    /**
     * 账号校验成功之后的token构建
     *
     * @param principal
     * @param authorities
     */
    public WechatAuthenticationToken(Object principal, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        this.principal = principal;
        super.setAuthenticated(true);
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return this.principal;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        Assert.isTrue(!isAuthenticated, "Cannot set this token to trusted - use constructor which takes a GrantedAuthority list instead");
        super.setAuthenticated(false);
    }

    @Override
    public void eraseCredentials() {
        super.eraseCredentials();
    }
}

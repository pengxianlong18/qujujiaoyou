package cn.codefit.quju.auth.security.provider.wechat;

import cn.codefit.quju.base.enums.GrantTypeEnum;
import cn.codefit.quju.base.exception.WechatLoginException;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.rpc.RpcException;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.exceptions.InvalidGrantException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.CompositeTokenGranter;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.OAuth2RequestFactory;
import org.springframework.security.oauth2.provider.TokenRequest;
import org.springframework.security.oauth2.provider.token.AbstractTokenGranter;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
public class WechatTokenGranter extends AbstractTokenGranter {

    /**
     * 声明授权者 CaptchaTokenGranter 支持授权模式 wechat
     * 根据接口传值 grant_type = wechat 的值匹配到此授权者
     * 匹配逻辑详见下面的两个方法
     *
     * @see CompositeTokenGranter#grant(String, TokenRequest)
     * @see AbstractTokenGranter#grant(String, TokenRequest)
     */
    private static final String GRANT_TYPE = GrantTypeEnum.GRANT_TYPE_WEEK_WECHAT.getCode();
    private final AuthenticationManager authenticationManager;

    public WechatTokenGranter(AuthorizationServerTokenServices tokenServices, ClientDetailsService clientDetailsService, OAuth2RequestFactory requestFactory, AuthenticationManager authenticationManager) {
        super(tokenServices, clientDetailsService, requestFactory, GRANT_TYPE);
        this.authenticationManager = authenticationManager;
    }

    @Override
    protected OAuth2Authentication getOAuth2Authentication(ClientDetails client, TokenRequest tokenRequest) {

        Map<String, String> parameters = new LinkedHashMap(tokenRequest.getRequestParameters());
        String loginCode = parameters.get("code");
        String encryptedData = parameters.get("encryptedData");
        String iv = parameters.get("iv");
        String phoneCode = parameters.get("phoneCode");

        //   Protect from downstream leaks of password(防止下游密码泄露)
        parameters.remove("code");
        parameters.remove("encryptedData");
        parameters.remove("iv");

        // 未认证状态--- 同时拥有 登录授权code 和手机号令牌code
        Authentication userAuth = new WechatAuthenticationToken(loginCode, phoneCode);
        ((AbstractAuthenticationToken) userAuth).setDetails(parameters);

        try {
            // 认证中
            userAuth = this.authenticationManager.authenticate(userAuth);
        } catch (WechatLoginException e) {
            throw e;
        } catch (RpcException e) {
            throw e;
        } catch (Exception e) {
            throw new InvalidGrantException(e.getMessage());
        }

        if (userAuth != null && userAuth.isAuthenticated()) {
            // 认证成功
            OAuth2Request oAuth2Request = this.getRequestFactory().createOAuth2Request(client, tokenRequest);
            log.info("oAuth2Request:{}", JSONObject.toJSON(oAuth2Request));
            OAuth2Authentication oAuth2Authentication = new OAuth2Authentication(oAuth2Request, userAuth);
            log.info("oAuth2Authentication:{}", JSONObject.toJSON(oAuth2Authentication));
            return oAuth2Authentication;
        } else {
            // 认证失败
            throw new InvalidGrantException("Could not authenticate code: " + loginCode);
        }
    }
}

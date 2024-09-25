package cn.codefit.quju.auth.service;

import cn.codefit.quju.base.rpc.CommonResponse;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.Map;

/**
 * Some description here.
 *
 * @author CodeFit.cn
 * @version 1.0, 2024/07/14
 */
public interface AuthService {

    /**
     * 统一认证接口
     * @param principal
     * @param parameters
     * @return
     * @throws HttpRequestMethodNotSupportedException
     */
    CommonResponse<OAuth2AccessToken> postAccessToken(Principal principal, @RequestParam Map<String, String> parameters) throws HttpRequestMethodNotSupportedException;


}

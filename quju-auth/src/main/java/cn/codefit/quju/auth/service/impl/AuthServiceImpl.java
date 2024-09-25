package cn.codefit.quju.auth.service.impl;

import cn.codefit.quju.auth.service.AuthService;
import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.GrantTypeEnum;
import cn.codefit.quju.base.request.RequestUtils;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.hutool.json.JSONUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

/**
 * Some description here.
 *
 * @author CodeFit.cn
 * @version 1.0, 2024/07/14
 */
@DubboService(version = Constant.VERSION, interfaceClass = AuthService.class)
@RestController
@RequestMapping("/oauth")
@Slf4j
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private TokenEndpoint tokenEndpoint;

    /**
     * 统一认证接口
     * @param principal
     * @param parameters
     * @return
     * @throws HttpRequestMethodNotSupportedException
     */
    @PostMapping(value = "/token")
    @Override
    public CommonResponse<OAuth2AccessToken> postAccessToken(
            Principal principal,
            @RequestParam Map<String, String> parameters
    ) throws HttpRequestMethodNotSupportedException {
        log.info("Received token request with parameters: {}", parameters);

        /**
         * 获取登录认证的客户端ID
         *
         * 兼容两种方式获取Oauth2客户端信息（client_id、client_secret）
         * 方式一：client_id、client_secret放在请求路径中(注：当前版本已废弃)
         * 方式二：放在请求头（Request Headers）中的Authorization字段，且经过加密，例如 Basic Y2xpZW50OnNlY3JldA== 明文等于 client:secret
         */
        String clientId = RequestUtils.getOAuth2ClientId();
        log.info("本地调用OAuth认证授权的客户端ID:{},趣聚请求参数:{},登录模式为:{}", clientId, JSONUtil.toJsonStr(parameters), GrantTypeEnum.getByCode(parameters.get("grant_type")).getDesc());

        OAuth2AccessToken accessToken = tokenEndpoint.postAccessToken(principal, parameters).getBody();
        return CommonResponse.success(accessToken);
    }
}


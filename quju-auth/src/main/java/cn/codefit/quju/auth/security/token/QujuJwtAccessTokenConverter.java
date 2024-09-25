package cn.codefit.quju.auth.security.token;

import cn.codefit.quju.auth.security.userdetails.web.quju.SysUserDetails;
import cn.codefit.quju.auth.security.userdetails.wechat.WechatUserDetails;
import cn.codefit.quju.base.constant.Constant;
import cn.hutool.core.map.MapUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import java.util.Map;

/**
 * 自定义JwtAccessToken转换器
 */
@Slf4j
public class QujuJwtAccessTokenConverter extends JwtAccessTokenConverter {

    /**
     * 生成token--并增强信息
     * @param accessToken
     * @param authentication
     * @return
     */
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        DefaultOAuth2AccessToken defaultOAuth2AccessToken = new DefaultOAuth2AccessToken(accessToken);

        Map<String, Object> additionalInfo = MapUtil.newHashMap();
        Object principal = authentication.getUserAuthentication().getPrincipal();

        // 系统管理用户认证信息
        if (principal instanceof SysUserDetails) {
            SysUserDetails sysUserDetails = (SysUserDetails) principal;
            //系统用户的userId和昵称和部门id
            additionalInfo.put("userId", sysUserDetails.getUserId());
            additionalInfo.put("username", sysUserDetails.getUsername());
            additionalInfo.put("deptId", sysUserDetails.getDeptId());

        } else if (principal instanceof WechatUserDetails) {
            // 微信用户认证信息
            WechatUserDetails wechatUserDetails = (WechatUserDetails) principal;
            //微信用户的userId和昵称
            additionalInfo.put(Constant.WECHAT_USER_ID_KEY, wechatUserDetails.getUserId());
            additionalInfo.put(Constant.WECHAT_USER_NAME_KEY, wechatUserDetails.getUsername());
        }
        // 将用户信息添加到token额外信息中
        defaultOAuth2AccessToken.setAdditionalInformation(additionalInfo);

        OAuth2AccessToken oAuth2AccessToken=super.enhance(defaultOAuth2AccessToken, authentication);
        log.info("本次生成token信息:{}", JSONObject.toJSON(oAuth2AccessToken));
        return oAuth2AccessToken;
    }
}

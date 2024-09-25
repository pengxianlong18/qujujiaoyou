package cn.codefit.quju.auth.security.provider.wechat;

import cn.codefit.quju.app.api.dto.WxLogin2Dto;
import cn.codefit.quju.app.api.service.AppletUserService;
import cn.codefit.quju.app.api.vo.WeiXinLgoinVo;
import cn.codefit.quju.auth.security.userdetails.wechat.WechatUserDetailsServiceImpl;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.exception.WechatLoginException;
import cn.codefit.quju.base.rpc.CommonResponse;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 微信认证提供者
 */
@Data
@Slf4j
public class WechatAuthenticationProvider implements AuthenticationProvider {

    private UserDetailsService userDetailsService;
    private AppletUserService appletUserService;
    private PasswordEncoder passwordEncoder;
    private String env;

    /**
     * 微信认证
     *
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @SneakyThrows
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        WechatAuthenticationToken authenticationToken = (WechatAuthenticationToken) authentication;
        String loginCode = (String) authenticationToken.getPrincipal();
        String phoneCode = (String) authenticationToken.getPhoneCode();
        String env = "test";
        String openid = "";
        if (env.equals("test")) {
            openid = "o3AXt4qYQKYe7YGBO_R2qH8YN708";
        } else {
            WeiXinLgoinVo weiXinLgoinVo = new WeiXinLgoinVo(loginCode, phoneCode);
            CommonResponse<WxLogin2Dto> responseDto = appletUserService.weixinLogin(weiXinLgoinVo);
            if (!responseDto.getCode().equals(ResponseCode.SUCCESS.getCode())) {
                throw new WechatLoginException(responseDto.getCode(), responseDto.getMsg());
            }
            WxLogin2Dto wxLogin2Dto = responseDto.getData();
            openid = wxLogin2Dto.getOpenid();
        }
        UserDetails userDetails = ((WechatUserDetailsServiceImpl) userDetailsService).loadUserByOpenId(openid);
        WechatAuthenticationToken result = new WechatAuthenticationToken(userDetails, userDetails.getAuthorities());
        result.setDetails(authentication.getDetails());
        log.info("Authentication:{}", JSONObject.toJSON(result));
        return result;
    }


    /**
     * 支持处理的请求令牌类型
     *
     * @param authentication
     * @return
     */
    @Override
    public boolean supports(Class<?> authentication) {
        return WechatAuthenticationToken.class.isAssignableFrom(authentication);
    }
}

package cn.codefit.quju.auth.security.userdetails.wechat;

import cn.codefit.quju.app.api.dto.AppletUserDto;
import cn.codefit.quju.app.api.service.AppletUserService;
import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.rpc.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * UserDetailsService只负责从特定的地方加载用户信息，可以是数据库、redis缓存、接口等
 */
@Service("wechatUserDetailsService")
@RequiredArgsConstructor
public class    WechatUserDetailsServiceImpl implements UserDetailsService {

    @DubboReference(version = Constant.VERSION)
    private AppletUserService appletUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    /**
     * openid 认证方式
     * @param openId
     * @return
     */
    public UserDetails loadUserByOpenId(String openId) {
        WechatUserDetails wechatUserDetails=null;
        CommonResponse<AppletUserDto> CommonResponse=appletUserService.getAppletUserByOpenId(openId);

        if (CommonResponse.getCode().equals(ResponseCode.SUCCESS.getCode())) {
            AppletUserDto appletUserDto = CommonResponse.getData();
            if (null != appletUserDto) {
                wechatUserDetails = new WechatUserDetails(appletUserDto);
            }
        }
        if (wechatUserDetails == null) {
            throw new UsernameNotFoundException(ResponseCode.USER_NOT_EXIST.getMessage());
        } else if (!wechatUserDetails.isEnabled()) {
            throw new DisabledException(ResponseCode.ERR_USER_LOGIN_NO_STATUS.getMessage());
        } else if (!wechatUserDetails.isAccountNonLocked()) {
            throw new LockedException(ResponseCode.ERR_USER_LOGIN_LOCK.getMessage());
        } else if (!wechatUserDetails.isAccountNonExpired()) {
            throw new AccountExpiredException(ResponseCode.ERR_USER_LOGIN_EXPIRE.getMessage());
        }
        return wechatUserDetails;
    }
}

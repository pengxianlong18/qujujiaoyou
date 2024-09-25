package cn.codefit.quju.auth.security.userdetails.web.quju;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysUserDto;
import cn.codefit.quju.system.api.service.SysUserService;
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
 * 后台管理系统-用户认证服务
 */
@Service("systemUserDetailsService")
@RequiredArgsConstructor
public class SystemUserDetailsServiceImpl implements UserDetailsService {


    @DubboReference(version =  Constant.VERSION)
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) {
        SysUserDetails sysUserDetails = null;

        CommonResponse<SysUserDto> result=sysUserService.selectSysUserByUserName(username);
        if(CommonResponse.isSuccess(result)){
            SysUserDto sysUserDto=result.getData();
            if(sysUserDto!=null){
                sysUserDetails = new SysUserDetails(sysUserDto);
            }
        }
        if (sysUserDetails == null) {
            throw new UsernameNotFoundException(ResponseCode.USER_NOT_EXIST.getMessage());
        } else if (!sysUserDetails.isEnabled()) {
            throw new DisabledException(ResponseCode.ERR_USER_LOGIN_NO_STATUS.getMessage());
        } else if (!sysUserDetails.isAccountNonLocked()) {
            throw new LockedException(ResponseCode.ERR_USER_LOGIN_LOCK.getMessage());
        } else if (!sysUserDetails.isAccountNonExpired()) {
            throw new AccountExpiredException(ResponseCode.ERR_USER_LOGIN_EXPIRE.getMessage());
        }
        return sysUserDetails;
    }

}

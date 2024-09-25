package cn.codefit.quju.auth.security.userdetails.web.quju;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.constant.PasswordEncoderTypeEnum;
import cn.codefit.quju.system.api.dto.SysUserDto;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;


/**
 * 系统管理用户认证信息
 */
@Data
public class SysUserDetails implements UserDetails {

    /**
     * userId
     */
    private Long userId;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 是否可用
     */
    private Boolean enabled;
    /**
     * 部门ID
     */
    private Long deptId;
    /**
     * 认证类型
     */
    private String authenticationIdentity;
    /**
     * 授权范围内容-用户拥有的角色信息
     */
    private Collection<SimpleGrantedAuthority> authorities;


    /**
     * 系统-web端用户-转UserDetails
     */
    public SysUserDetails(SysUserDto sysUserDto) {
        this.setUserId(sysUserDto.getId());
        this.setUsername(sysUserDto.getUserName());
        this.setDeptId(sysUserDto.getDeptId());
        this.setPassword(PasswordEncoderTypeEnum.BCRYPT.getPrefix() + sysUserDto.getPassword());
        this.setEnabled(Constant.STATUS_ENABLE .equals(sysUserDto.getStatus()));
        if(StringUtils.isNotBlank(sysUserDto.getRoleCode())){
            authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(sysUserDto.getRoleCode()));
        }
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }
    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    /**
     * 账号已过有效期(当前项目未配置,默认返回true)
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 账号是否已被锁定(当前项目未配置,默认返回true)
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    /**
     * 账户是否可用(根据用户的status判断)
     * @return
     */
    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
}

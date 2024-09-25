package cn.codefit.quju.auth.security.userdetails.wechat;

import cn.codefit.quju.app.api.dto.AppletUserDto;
import cn.codefit.quju.base.constant.Constant;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;


/**
 * 用户认证信息
 */
@Data
public class WechatUserDetails implements UserDetails {

    /**
     * 默认字段
     */
    private String username;
    private Boolean enabled;
    private Long userId;

    /**
     * 授权范围内容-用户拥有的角色信息
     */
    private Collection<SimpleGrantedAuthority> authorities;

    public WechatUserDetails(AppletUserDto appletUserDto) {
        this.username = appletUserDto.getUserName();
        this.enabled = true;
        this.userId = appletUserDto.getId();
        this.setEnabled(true);
        authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(Constant.WECHAT_ROLE_CODE));
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }


    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    /**
     * 账户是否可用
     * @return
     */
    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}

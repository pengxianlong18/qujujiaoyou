package cn.codefit.quju.base.constant;

import lombok.Getter;

/**
 * 认证身份标识枚举
 */
public enum AuthenticationIdentityEnum {

    USERNAME("username", "用户名"),
    MOBILE("mobile", "手机号"),
    OPENID("openId", "开放式认证系统唯一身份标识");

    @Getter
    private String value;

    @Getter
    private String label;

    AuthenticationIdentityEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }
}

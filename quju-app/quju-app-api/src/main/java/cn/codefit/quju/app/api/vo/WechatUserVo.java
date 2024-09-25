package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

import java.time.LocalDate;

/**
 * 微信用户-vo
 */
@Data
public class WechatUserVo extends BaseBean {

    private Integer gender;

    private String nickName;

    private String mobile;

    private LocalDate birthday;

    private String avatarUrl;

    private String openid;

    private String sessionKey;

    private String city;

    private String country;

    private String language;

    private String province;

}

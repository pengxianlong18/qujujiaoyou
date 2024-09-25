package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

@Data
public class WxLogin2Dto extends BaseDtoBean {

    private String sessionKey;
    private String openid;
    private String unionid;
    /**
     * 0、不存在 1、存在
     */
    private Integer exist;
}

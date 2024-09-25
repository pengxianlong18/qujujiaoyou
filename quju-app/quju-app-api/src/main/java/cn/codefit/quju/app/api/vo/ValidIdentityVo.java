package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

/**
 * 校验身份请求
 */
@Data
public class ValidIdentityVo extends BaseBean {

        /**
     * 用户在业务方下的openid
     */
    private String openid;
    /**
     * 姓名
     */
    private String real_name;
    /**
     *证件号
     */
    private String cred_id;
    /**
     *默认为1，即身份证
     */
    private String cred_type;
    /**
     *回调获取的code
     */
    private String code;

}

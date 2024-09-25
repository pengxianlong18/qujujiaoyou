package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;


/**
 *微信登录
 */
@Data
public class WeiXinLgoinVo extends BaseBean {

    /**
     * 小程序登录  动态令牌
     */
    private String loginCode;

    /**
     * 获取手机号 动态令牌
     */
    private String phoneCode;



    /**
     *userName
     */
    private String userName;
    /**
     *headUrl
     */
    private String headUrl;
    /**
     * province
     */
    private String province;
    /**
     *city
     */
    private String city;
    /**
     * gender 0:未知 1、男性 2、女性
     */
    private Integer gender;
    /**
     *encryptedData 废弃
     */
    private String encryptedData;
    /**
     *iv  废弃
     */
    private String iv;


    public WeiXinLgoinVo(String loginCode, String phoneCode) {
        this.loginCode = loginCode;
        this.phoneCode = phoneCode;
    }

    public WeiXinLgoinVo(String loginCode, String encryptedData, String iv) {
        this.loginCode = loginCode;
        this.encryptedData = encryptedData;
        this.iv = iv;
    }
}

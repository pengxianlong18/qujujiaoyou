package cn.codefit.quju.app.api.vo;
import lombok.Data;

/*
 * 小程序推送所需数据
 * */
@Data
public class WxMssVo {
    private String touser;//用户openid
    private String template_id;//模版id
    private String page = "pages/index/index";//默认跳到小程序首页
//    private String miniprogram_state ;//跳转小程序类型：developer为开发版；trial为体验版；formal为正式版；默认为正式版

    //    private String emphasis_keyword = "keyword1.DATA";//放大那个推送字段
    private Object data;//推送文字
    private String url;//推送文字
    private String topcolor="#FF0000";//


}



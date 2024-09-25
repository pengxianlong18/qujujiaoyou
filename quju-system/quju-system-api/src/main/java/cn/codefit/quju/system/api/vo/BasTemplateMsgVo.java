package cn.codefit.quju.system.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

import java.util.Date;

@Data
public class BasTemplateMsgVo extends BaseBean {
    /**
     *
     */
    private Long id;

    /**
     * 接收者openid
     */
    private String touser;

    /**
     * 模板ID
     */
    private String templateId;

    /**
     * 消息类型
     */
    private Integer messgeType;

    /**
     * 跳转类型:0、小程序 1、url 2、不跳转
     */
    private Integer jumpType;

    /**
     * 消息id
     */
    private String msgId;

    /**
     * 状态：0、已发送 1、接收成功 2、发送失败
     */
    private Integer status;

    /**
     * 平台
     */
    private Integer platform;

    /**
     * 逻辑删除标识：0-未删除；1-已删除
     */
    private Integer isDeleted;

    /**
     * 创建人工号
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人昵称
     */
    private String createUserName;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 修改人工号
     */
    private String modifyUser;

    /**
     * 修改人昵称
     */
    private String modifyUserName;

    /**
     * 消息报文
     */
    private String json;

    /**
     * 微信返回错误编码
     */
    private Integer errcode;

    /**
     * 微信返回错误内容
     */
    private String errmsg;

}

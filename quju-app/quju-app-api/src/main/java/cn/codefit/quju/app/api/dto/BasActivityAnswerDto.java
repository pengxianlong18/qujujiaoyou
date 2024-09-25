package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

import java.util.Date;

@Data
public class BasActivityAnswerDto   extends BaseDtoBean {
    /**
     * 答案id
     */
    private Long id;

    /**
     * 小程序用户唯一id
     */
    private Long userId;

    /**
     * 活动id
     */
    private Long dynamicId;

    /**
     * 问题id
     */
    private Long questionId;

    /**
     * 答案
     */
    private String answer;

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
     * 问题
     */
    private String question;


}

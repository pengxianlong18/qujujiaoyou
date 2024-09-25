package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * 活动报名表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityMembersDto  extends BaseDtoBean {

    /**
     *
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
     * 手机
     */
    private String mobile;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 1-有退款 0-无退款
     */
    private Integer refundFlag;

    /**
     * 是否有效 1-有效 0-无效
     */
    private Integer valid;

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
    *头像
    */
    private String head;
   /**
    *性别
    */
    private int gender;
   /**
    *城市
    */
    private String city;
   /**
    *是否是组织者
    */
    private boolean isLeader;
   /**
    *昵称
    */
    private String nickname;

   /**
    *问题和答案
    */
    private List<BasActivityAnswerDto> questions;

}

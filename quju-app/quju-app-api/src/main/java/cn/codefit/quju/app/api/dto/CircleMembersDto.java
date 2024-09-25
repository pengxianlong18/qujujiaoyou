package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 圈子用户
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CircleMembersDto  extends BaseDtoBean {



    /**
     *
     */
    private Long id;

    /**
     * 成员id
     */
    private Long userId;

    /**
     * 圈子id
     */
    private Long circleId;

    /**
     * 权限 1 所有者  2 管理员  0 普通成员
     */
    private Integer power;

    /**
     * 0-审核通过 1-待审核 2-拒绝
     */
    private Integer checkStatus;

    /**
     * 申请理由
     */
    private String reason;

    /**
     * 新活动通知 0-不通知 1-通知
     */
    private Integer newActionNotice;

    /**
     * 未加入活动开始前通知 0-不通知 1-通知
     */
    private Integer unjoinStartNotice;

    /**
     * 新成员加入通知 0-不通知 1-通知
     */
    private Integer newMemberNotice;

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


    /*用户信息*/

   /**
    *头像
    */
    private String head;
   /**
    *性别
    */
    private int gender;
   /**
    *昵称
    */
    private String nickname;
   /**
    *家乡
    */
    private String homeCity;
   /**
    *当前城市
    */
    private String currentCity;
   /**
    *学历
    */
    private String recordOfSchool;



}

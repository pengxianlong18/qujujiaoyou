package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

import java.util.Date;


/**
 * 圈子
 */
@Data

public class CircleDto  extends BaseDtoBean {

    /**
     *
     */
    private Long id;

    /**
     * 小程序用户唯一id 圈子所有人
     */
    private Long userId;

    /**
     * 允许加入类型 1.都允许 2-需要验证消息 3-需要验证申请理由
     */
    private Integer joinType;

    /**
     * 圈子名称
     */
    private String circleName;

    /**
     * 圈子头像
     */
    private String circleHead;

    /**
     * 圈子介绍
     */
    private String circleIntroduction;

    /**
     * 圈子类型id activity_primary id
     */
    private Integer circleTypeId;

    /**
     * 圈子类型
     */
    private String circleType;

    /**
     * 圈子地址
     */
    private String circleAddr;

    /**
     * 活动数量
     */
    private Integer activityNum;

    /**
     * 成员数量
     */
    private Integer membersNum;

    /**
     * 加入问题
     */
    private String joinProblem;

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


    /*查询详情时冗余字段*/
    /**
     *管理员标识 -1 啥也不是 1-拥有者 2-管理员 0-普通成员
     */
    private int power;
    /**
     *是否是成员 1-是 0-否
     */
    private int isMember;
    /**
     *新活动通知  0-不通知 1-通知
     */
    private int newActionNotice;
    /**
     *未参加活动开始前通知  0-不通知 1-通知
     */
    private int unjoinStartNotice;
    /**
     *新成员加入通知  0-不通知 1-通知
     */
    private int newMemberNotice;

    /**
     *圈主资料
     */
    private AppletUserDto user;




}

package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 活动报名表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CircleFindDto  extends BaseDtoBean {


    /**
     * 圈子id
     */
    private Long id;

    /**
     * 小程序用户唯一id 圈子所有人
     */
    private Long userId;

    /**
     * 允许加入类型 1.都允许
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
     * 创建时间
     */
    private LocalDateTime createDate;

   /**
    * 活动数量
    */
   private int activityNum;

   /**
    * 成员数量
    */
   private int membersNum;


   /**
    * 是否是圈子成员
    */
   private int isMember;


}

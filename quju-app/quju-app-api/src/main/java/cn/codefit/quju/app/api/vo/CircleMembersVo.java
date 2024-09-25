package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 圈子用户
 */
@Data
public class CircleMembersVo extends BaseBean {


    /**
     * 小程序用户唯一id
     */
    private Long userId;
   /**
    *头像
    */
    private String head;
   /**
    *加入理由
    */
    private String reason;
   /**
    *性别
    */
    private int gender;
   /**
    *管理员标识 1-拥有者 2-管理员 0-普通成员
    */
    private int power;
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


    /**
     * 圈子id
     */
    @JsonProperty("circleId")
    private Long id;


}

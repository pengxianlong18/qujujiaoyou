package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

/**
 * 圈子动态
 */
@Data

public class CircleDynamicDto  extends BaseDtoBean {

    /**
     * 小程序用户唯一id
     */
    private Long userId;
    /**
     *用户名称
     */
    private String userName;
    /**
     *用户头像
     */
    private String userHead;
    /**
     *文字内容
     */
    private String content;
    /**
     *图片内容多个逗号隔开
     */
    private String pics;
    /**
     *动态类型 1圈子 2个人 3评价
     */
    private String dynamicType;
    /**
     *动态发布动作类型 1 动态 2 活动 3 评价 4圈子创建
     */
    private int cardType;

    /**
     *位置
     */
    private String addr;
    /**
     *评分
     */
    private String grade;

    /**
     *动态关联id 如果dynamicType=1 dyId(circleType) dynamicType=3 dyUnId(dynamicIde) 4圈子id
     */
    private Long dyUnId;


}

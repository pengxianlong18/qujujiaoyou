package cn.codefit.quju.system.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * 圈子活动信息
 */
@Data
public class BasActivityVo extends BaseBean {


    /**
     * 勾选导出
     */
    private List<Long> activityIds;


    /**
     * 城市代码
     */
    private String cityCode;

    /**
     * 活动编号
     */
    private String activityNo;


    /**
     * 日期代码
     */
    private Integer dateCode;
    /**
     * 距离代码
     */
    private Integer distanceCode;
    /**
     * 类型代码
     */
    private Integer typeCode;
    /**
     * normal代码
     */
    private Integer normalCode;
    /**
     * 经度
     */
    private String longitude;
    /**
     * 纬度
     */
    private String latitude;


    /**
     * 活动id
     */
    private Long id;
    /**
     * 用户唯一id
     */
    private String userId;
    /**
     * 海报列表(多张海报用,隔开)
     */
    private String postersList;
    /**
     * 活动主题
     */
    private String activityTheme;
    /**
     * 活动地址(待定-因为要选择地图上的地址，实际开发确认下)
     */
    private String activityAddress;
    /**
     * 活动开始时间
     */
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String startTime;
    /**
     * 活动开始时间描述
     */
    private String timeDesc;
    /**
     * 活动结束时间
     */
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String endTime;
    /**
     * 0、免费 1、在线支付 2、现场支付
     */
    private Integer costType;
    /**
     * 活动单人应支付金额(type为0的时候值为0.00)
     */
    private BigDecimal activityAmount;
    /**
     * 活动负责人联系方式
     */
    private String contact;
    /**
     * 活动一级分类
     */
    private String primaryClassification;
    /**
     * 活动二级分类
     */
    private String secondaryClassification;
    /**
     * 活动一级分类id
     */
    private String primaryId;
    /**
     * 活动二级分类id
     */
    private String secondaryId;
    /**
     * 活动内容
     */
    private String activityContent;
    /**
     * 活动内容附带图片列表(多张用, 隔开)
     */
    private String activityContentPicture;
    /**
     * 活动期望报名人数
     */
    private Integer expectNumber;

    /**
     * 活动期望报名人数
     */
    private Integer alreadyJoin;

    /**
     * 活动报名截止时间
     */
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String registrationDeadline;

    /**
     * 活动报名所需问题(多个问题需要用,隔开)
     */
    private String registrationReqQuestions;


    /**
     * 活动报名所需问题
     */
    private List<String> questions;

    /**
     * 距离
     */
    private String distance;

    /**
     * 区
     */
    private String district;


    /**
     * 支付类型的活动结束标志 支付类型的  0-默认 1-待结算 2-结算完成
     */
    private Integer isPayEnd;


    /**
     * 1、公开 0、不公开
     */
    private Integer whetherPublic;

    /**
     * 0 不热门 1-热门
     */
    private Integer isHot;


    /**
     * 活动所在城市
     */
    private String activityCity;

    /**
     * 群二维码
     */
    private String erCodeUrl;

    /**
     * 圈子id
     */
    private Long circleId;

    /**
     * 圈子名称
     */
    private String circleName;

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


}

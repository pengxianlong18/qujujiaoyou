package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 小程序动态表
 * </p>
 */
@Data
public class DynamicTemplateDto    extends BaseDtoBean {


    private Long id;

    /**
     * 海报列表(多张海报用,隔开)
     */
    private String postersList;

    /**
     * 活动主题
     */
    private String activityTheme;


    /**
     * 0、免费 1、在线支付 2、现场支付
     */
    private Integer costType;

    /**
     * 活动内容
     */
    private String activityContent;

    /**
     * 活动内容附带图片列表(多张用,隔开)
     */
    private String activityContentPicture;
    /**
     * 活动期望报名人数
     */
    private Integer expectNumber;

    /**
     * 活动报名截止时间
     */
    private LocalDateTime registrationDeadline;


    /**
     * 0、公开 1、不公开
     */
    private Boolean whetherPublic;


    /**
     * 活动发布时间
     */
    private LocalDateTime createTime;

}

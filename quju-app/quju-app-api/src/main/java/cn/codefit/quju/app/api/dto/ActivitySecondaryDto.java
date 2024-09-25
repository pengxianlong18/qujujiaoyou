package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

/**
 * <p>
 * 活动二级分类表
 * </p>
 */
@Data
public class ActivitySecondaryDto extends BaseDtoBean {


    /**
     * 主键
     */
    private Integer id;


    /**
     * 活动二级分类名称
     */
    private String name;

    /**
     * 活动一级分类编码
     */
    private Integer primaryid;


}

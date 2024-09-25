package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

/**
 * <p>
 * 活动一级分类表
 * </p>
 */
@Data
public class ActivityPrimaryDto  extends BaseDtoBean {


    private Integer id;
    /**
     * 活动一级分类的名称
     */
    private String name;


}

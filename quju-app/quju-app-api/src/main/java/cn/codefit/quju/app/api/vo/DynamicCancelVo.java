package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;


/**
 *活动取消原因
 */
@Data
public class DynamicCancelVo extends BaseBean {

    /**
     * */
    private Long dynamicId;
    /**
     *原因
     * */
    private String reason;


}

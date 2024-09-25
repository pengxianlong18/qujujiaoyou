package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

/**
 *报名
 */
@Data
public class JoinActivitySuccessVo extends BaseBean {


    /**
     * dynamic ID
     * */
    private Long dynamicId;
    /**
     *userId
     * */
    private Long userId;


}

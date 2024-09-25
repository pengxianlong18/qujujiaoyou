package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

/**
 *动态列表
 */
@Data
public class CircleDynamicListVo extends BaseBean {

    /**
     * 0-活动列表  1-动态列表   2-动态图片列表  3-评价
     */
    private Integer type;

    /**
     * 圈子id
     */
    private Long circleId;

}

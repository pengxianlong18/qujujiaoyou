package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;


/**
 *发现圈子列表
 */
@Data
public class CircleFindListVo extends BaseBean {

    /**
     * 圈子类型id
     * */
    private int circleTypeId;
    /**
     *圈子类型 circleType 1-推荐  2-热门 3-新鲜
     * */
    private int circleType;

    /**
     *城市
     * */
    private String circleAddr;

}

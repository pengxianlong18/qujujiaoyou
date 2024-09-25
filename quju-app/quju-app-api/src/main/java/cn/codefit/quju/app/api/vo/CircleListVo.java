package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;


/**
 *圈子列表
 */
@Data
public class CircleListVo extends BaseBean {

    /**
     * 圈子type 1.加入的 2.管理的 3.创建的
     * */
    private int type;

}

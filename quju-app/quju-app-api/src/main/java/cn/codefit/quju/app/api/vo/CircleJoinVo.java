package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

/**
 * 加入圈子
 */
@Data
public class CircleJoinVo extends BaseBean {

    /**
     * 圈子 id
     * */
    private Long id;
    /**
     *userid
     * */
    private Long userId;
    /**
     *1-加入 2-退出
     * */
    private Integer type;
    /**
     *加入时有该字段 1-加入申请 2-加入确认（即管理员审核通过或者不需要审核）3-加入拒绝
     * */
    private Integer joinFlag;
    /**
     *加入申请时有该字段  加入申请理由
     * */
    private String reason;

}

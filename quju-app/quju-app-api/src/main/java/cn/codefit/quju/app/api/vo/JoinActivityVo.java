package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

import java.util.List;


/**
 *报名
 */
@Data
public class JoinActivityVo extends BaseBean {

    /**
     * dynamic ID
     * */
    private Long dynamicId;
    /**
     *userId
     * */
    private Long userId;
    /**
     *手机
     * */
    private String mobile;
    /**
     *微信
     * */
    private String wechat;
    /**
     *问题答案
     * */
    private List<AnswerVo> answers;

}

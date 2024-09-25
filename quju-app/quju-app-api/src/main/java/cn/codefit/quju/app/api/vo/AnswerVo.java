package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

@Data
public class AnswerVo  extends BaseBean {

    /**
     *问题ID
     * */
    private Long qid;
    /**
     *答案
     * */
    private String answer;

}

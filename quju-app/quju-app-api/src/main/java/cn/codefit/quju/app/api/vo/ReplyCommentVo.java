package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;


@Data
public class ReplyCommentVo extends BaseBean {

    /**
     * 小程序用户唯一id
     */
    private Long userId;
    /**
     *回复人id
     */
    private Long replyUserId;
    /**
     *回复用户名称
     */
    private String replyUserName;
    /**
     *回复用户头像
     */
    private String replyUserHead;
    /**
     *文字内容
     */
    private String content;
    /**
     *图片内容多个逗号隔开
     */
    private String pics;
    /**
     *id
     */
    private Long replyId;
    /**
     *点赞数量
     */
    private Integer parseCount;
    /**
     *1 圈子 2个人
     */
    private Integer dynamicType;


}

package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;


@Data
public class CommentVo extends BaseBean {

    /**
     * 小程序用户唯一id
     */
    private Long fromUserId;
    /**
     *小程序用户唯一id
     */
    private Long toUserId;
    /**
     *用户名称
     */
    private String fromUserName;
    /**
     *用户名称
     */
    private String toUserName;
   /**
    *文字内容
    */
    private String content;
   /**
    *个人 圈子
    */
    private String dynamicType;
   /**
    *评论的动态id
    */
    private Long cdId;



}

package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

/**
 * 活动通知
 */
@Data
public class CircleNoticeVo extends BaseBean {


    /**
     * 圈子id
     */
    private Long circleId;
    /**
     *新活动通知  0-不通知 1-通知
     */
    private Integer newActionNotice;
    /**
     *未参加活动开始前通知  0-不通知 1-通知
     */
    private Integer unjoinStartNotice;
    /**
     *新成员加入通知  0-不通知 1-通知
     */
    private Integer newMemberNotice;



}

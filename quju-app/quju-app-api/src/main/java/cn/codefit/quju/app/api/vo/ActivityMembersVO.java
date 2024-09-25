package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

import java.util.List;


/**
 * <p>
 * 活动报名表
 * </p>
 */
@Data
public class ActivityMembersVO extends BaseBean {

    /**
     * 小程序用户唯一id
     */
    private Long userId;
    /**
     * 活动id
     */
    private Long dynamicId;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 微信
     */
    private String wechat;
    /**
     * 头像
     */
    private String head;
    /**
     * 性别
     */
    private int gender;
    /**
     * 城市
     */
    private String city;
    /**
     * 是否是组织者
     */
    private boolean isLeader;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 退款标识 1-有退款 0-无退款
     */
    private int refundFlag;
    /**
     * 问题
     */
    private List<Question> questions;

    @Data
    public static class Question {
        /**
         * 问题id
         */
        private String qid;
        /**
         * 问题
         */
        private String question;
        /**
         * 答案
         */
        private String answer;
    }
}

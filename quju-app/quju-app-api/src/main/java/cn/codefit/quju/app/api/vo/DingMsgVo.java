package cn.codefit.quju.app.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class DingMsgVo {

    private String conversationId;
    private List<AtUsersDTO> atUsers;
    private String chatbotCorpId;
    private String chatbotUserId;
    private String msgId;
    private String senderNick;
    private Boolean isAdmin;
    private String senderStaffId;
    private Long sessionWebhookExpiredTime;
    private Long createAt;
    private String senderCorpId;
    private String conversationType;
    private String senderId;
    private String conversationTitle;
    private Boolean isInAtList;
    private String sessionWebhook;
    private TextDTO text;
    private String msgtype;

    @NoArgsConstructor
    @Data
    public static class TextDTO {
        private String content;
    }

    @NoArgsConstructor
    @Data
    public static class AtUsersDTO {
        private String dingtalkId;
        private String staffId;
    }
}

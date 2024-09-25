package cn.codefit.quju.app.api.vo.notice.wechat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 微信模板消息通知-通知活动发起人-某用户取消参加您发起的xxx活动
 */
@Data
public class ActivityQuitNotify {
    private first first;
    private keyword1 keyword1;
    private keyword2 keyword2;
    private remark remark;
    @Data
    @Builder
@AllArgsConstructor
@NoArgsConstructor
    public static class first {
        private String value;
        private String color;
    }

    @Data
    @Builder
@AllArgsConstructor
@NoArgsConstructor
    public static class keyword1 {
        private String value;
        private String color;
    }

    @Data
    @Builder
@AllArgsConstructor
@NoArgsConstructor
    public static class keyword2 {
        private String value;
        private String color;
    }

    @Data
    @Builder
@AllArgsConstructor
@NoArgsConstructor
    public static class remark {
        private String value;
        private String color;
    }
}

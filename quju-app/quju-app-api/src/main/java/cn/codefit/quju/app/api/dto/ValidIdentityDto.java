package cn.codefit.quju.app.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

/**
 * 校验身份请求
 */
@Data
public class ValidIdentityDto extends BaseDtoBean {


    /**
     * 1-通过 2-不通过 0-待定
     */
    private int status;
    /**
     *任务id
     */
    private String taskId;
    /**
     *失败原因类型
     */
    private int reasonType;
    /**
     *失败原因
     */
    private String reason;

}

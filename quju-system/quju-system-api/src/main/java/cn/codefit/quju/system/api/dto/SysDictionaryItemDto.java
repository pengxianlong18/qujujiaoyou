package cn.codefit.quju.system.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

import java.util.Date;

@Data
public class SysDictionaryItemDto extends BaseDtoBean {
    /**
     * 主键
     */
    private Long id;

    /**
     * 字典编码
     */
    private String dictCode;

    /**
     * 字典子项编码
     */
    private String itemCode;

    /**
     * 字典子项名称
     */
    private String itemName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态-0、正常(true) 1、禁用(否)
     */
    private Integer status;

    /**
     * 是否默认（0否 1是）
     */
    private Integer isDefault;

    /**
     * 备注
     */
    private String remark;

    /**
     * 平台
     */
    private Integer platform;

    /**
     * 逻辑删除标识：0-未删除；1-已删除
     */
    private Integer isDeleted;

    /**
     * 创建人工号
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人昵称
     */
    private String createUserName;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 修改人工号
     */
    private String modifyUser;

    /**
     * 修改人昵称
     */
    private String modifyUserName;
}

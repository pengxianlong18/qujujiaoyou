package cn.codefit.quju.system.model.po;

import java.io.Serializable;
import java.util.Date;

public class SysDictionaryItem implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public String getModifyUserName() {
        return modifyUserName;
    }

    public void setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName == null ? null : modifyUserName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dictCode=").append(dictCode);
        sb.append(", itemCode=").append(itemCode);
        sb.append(", itemName=").append(itemName);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", remark=").append(remark);
        sb.append(", platform=").append(platform);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", modifyUser=").append(modifyUser);
        sb.append(", modifyUserName=").append(modifyUserName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}

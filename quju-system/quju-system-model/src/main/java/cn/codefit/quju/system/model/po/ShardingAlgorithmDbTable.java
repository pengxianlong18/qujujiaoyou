package cn.codefit.quju.system.model.po;

import java.io.Serializable;
import java.util.Date;

public class ShardingAlgorithmDbTable implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 逻辑表名
     */
    private String logicTableName;

    /**
     * 分库列中文名称
     */
    private String shardingColumnName;

    /**
     * 分库列名称
     */
    private String shardingColumn;

    /**
     * 分库列字段值
     */
    private String shardingColumnValue;

    /**
     * 实际分库名
     */
    private String actualDataNode;

    /**
     * 实际分表名
     */
    private String actualTableNode;

    /**
     * 创建人
     */
    private String createName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String updateName;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogicTableName() {
        return logicTableName;
    }

    public void setLogicTableName(String logicTableName) {
        this.logicTableName = logicTableName == null ? null : logicTableName.trim();
    }

    public String getShardingColumnName() {
        return shardingColumnName;
    }

    public void setShardingColumnName(String shardingColumnName) {
        this.shardingColumnName = shardingColumnName == null ? null : shardingColumnName.trim();
    }

    public String getShardingColumn() {
        return shardingColumn;
    }

    public void setShardingColumn(String shardingColumn) {
        this.shardingColumn = shardingColumn == null ? null : shardingColumn.trim();
    }

    public String getShardingColumnValue() {
        return shardingColumnValue;
    }

    public void setShardingColumnValue(String shardingColumnValue) {
        this.shardingColumnValue = shardingColumnValue == null ? null : shardingColumnValue.trim();
    }

    public String getActualDataNode() {
        return actualDataNode;
    }

    public void setActualDataNode(String actualDataNode) {
        this.actualDataNode = actualDataNode == null ? null : actualDataNode.trim();
    }

    public String getActualTableNode() {
        return actualTableNode;
    }

    public void setActualTableNode(String actualTableNode) {
        this.actualTableNode = actualTableNode == null ? null : actualTableNode.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", logicTableName=").append(logicTableName);
        sb.append(", shardingColumnName=").append(shardingColumnName);
        sb.append(", shardingColumn=").append(shardingColumn);
        sb.append(", shardingColumnValue=").append(shardingColumnValue);
        sb.append(", actualDataNode=").append(actualDataNode);
        sb.append(", actualTableNode=").append(actualTableNode);
        sb.append(", createName=").append(createName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateName=").append(updateName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}

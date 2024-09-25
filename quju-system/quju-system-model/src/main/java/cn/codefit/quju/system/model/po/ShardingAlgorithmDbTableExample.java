package cn.codefit.quju.system.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShardingAlgorithmDbTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShardingAlgorithmDbTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameIsNull() {
            addCriterion("logic_table_name is null");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameIsNotNull() {
            addCriterion("logic_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameEqualTo(String value) {
            addCriterion("logic_table_name =", value, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameNotEqualTo(String value) {
            addCriterion("logic_table_name <>", value, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameGreaterThan(String value) {
            addCriterion("logic_table_name >", value, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("logic_table_name >=", value, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameLessThan(String value) {
            addCriterion("logic_table_name <", value, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameLessThanOrEqualTo(String value) {
            addCriterion("logic_table_name <=", value, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameLike(String value) {
            addCriterion("logic_table_name like", value, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameNotLike(String value) {
            addCriterion("logic_table_name not like", value, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameIn(List<String> values) {
            addCriterion("logic_table_name in", values, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameNotIn(List<String> values) {
            addCriterion("logic_table_name not in", values, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameBetween(String value1, String value2) {
            addCriterion("logic_table_name between", value1, value2, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andLogicTableNameNotBetween(String value1, String value2) {
            addCriterion("logic_table_name not between", value1, value2, "logicTableName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameIsNull() {
            addCriterion("sharding_column_name is null");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameIsNotNull() {
            addCriterion("sharding_column_name is not null");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameEqualTo(String value) {
            addCriterion("sharding_column_name =", value, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameNotEqualTo(String value) {
            addCriterion("sharding_column_name <>", value, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameGreaterThan(String value) {
            addCriterion("sharding_column_name >", value, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("sharding_column_name >=", value, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameLessThan(String value) {
            addCriterion("sharding_column_name <", value, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameLessThanOrEqualTo(String value) {
            addCriterion("sharding_column_name <=", value, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameLike(String value) {
            addCriterion("sharding_column_name like", value, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameNotLike(String value) {
            addCriterion("sharding_column_name not like", value, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameIn(List<String> values) {
            addCriterion("sharding_column_name in", values, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameNotIn(List<String> values) {
            addCriterion("sharding_column_name not in", values, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameBetween(String value1, String value2) {
            addCriterion("sharding_column_name between", value1, value2, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNameNotBetween(String value1, String value2) {
            addCriterion("sharding_column_name not between", value1, value2, "shardingColumnName");
            return (Criteria) this;
        }

        public Criteria andShardingColumnIsNull() {
            addCriterion("sharding_column is null");
            return (Criteria) this;
        }

        public Criteria andShardingColumnIsNotNull() {
            addCriterion("sharding_column is not null");
            return (Criteria) this;
        }

        public Criteria andShardingColumnEqualTo(String value) {
            addCriterion("sharding_column =", value, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNotEqualTo(String value) {
            addCriterion("sharding_column <>", value, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnGreaterThan(String value) {
            addCriterion("sharding_column >", value, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnGreaterThanOrEqualTo(String value) {
            addCriterion("sharding_column >=", value, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnLessThan(String value) {
            addCriterion("sharding_column <", value, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnLessThanOrEqualTo(String value) {
            addCriterion("sharding_column <=", value, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnLike(String value) {
            addCriterion("sharding_column like", value, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNotLike(String value) {
            addCriterion("sharding_column not like", value, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnIn(List<String> values) {
            addCriterion("sharding_column in", values, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNotIn(List<String> values) {
            addCriterion("sharding_column not in", values, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnBetween(String value1, String value2) {
            addCriterion("sharding_column between", value1, value2, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnNotBetween(String value1, String value2) {
            addCriterion("sharding_column not between", value1, value2, "shardingColumn");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueIsNull() {
            addCriterion("sharding_column_value is null");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueIsNotNull() {
            addCriterion("sharding_column_value is not null");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueEqualTo(String value) {
            addCriterion("sharding_column_value =", value, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueNotEqualTo(String value) {
            addCriterion("sharding_column_value <>", value, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueGreaterThan(String value) {
            addCriterion("sharding_column_value >", value, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueGreaterThanOrEqualTo(String value) {
            addCriterion("sharding_column_value >=", value, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueLessThan(String value) {
            addCriterion("sharding_column_value <", value, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueLessThanOrEqualTo(String value) {
            addCriterion("sharding_column_value <=", value, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueLike(String value) {
            addCriterion("sharding_column_value like", value, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueNotLike(String value) {
            addCriterion("sharding_column_value not like", value, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueIn(List<String> values) {
            addCriterion("sharding_column_value in", values, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueNotIn(List<String> values) {
            addCriterion("sharding_column_value not in", values, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueBetween(String value1, String value2) {
            addCriterion("sharding_column_value between", value1, value2, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andShardingColumnValueNotBetween(String value1, String value2) {
            addCriterion("sharding_column_value not between", value1, value2, "shardingColumnValue");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeIsNull() {
            addCriterion("actual_data_node is null");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeIsNotNull() {
            addCriterion("actual_data_node is not null");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeEqualTo(String value) {
            addCriterion("actual_data_node =", value, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeNotEqualTo(String value) {
            addCriterion("actual_data_node <>", value, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeGreaterThan(String value) {
            addCriterion("actual_data_node >", value, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeGreaterThanOrEqualTo(String value) {
            addCriterion("actual_data_node >=", value, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeLessThan(String value) {
            addCriterion("actual_data_node <", value, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeLessThanOrEqualTo(String value) {
            addCriterion("actual_data_node <=", value, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeLike(String value) {
            addCriterion("actual_data_node like", value, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeNotLike(String value) {
            addCriterion("actual_data_node not like", value, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeIn(List<String> values) {
            addCriterion("actual_data_node in", values, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeNotIn(List<String> values) {
            addCriterion("actual_data_node not in", values, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeBetween(String value1, String value2) {
            addCriterion("actual_data_node between", value1, value2, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualDataNodeNotBetween(String value1, String value2) {
            addCriterion("actual_data_node not between", value1, value2, "actualDataNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeIsNull() {
            addCriterion("actual_table_node is null");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeIsNotNull() {
            addCriterion("actual_table_node is not null");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeEqualTo(String value) {
            addCriterion("actual_table_node =", value, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeNotEqualTo(String value) {
            addCriterion("actual_table_node <>", value, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeGreaterThan(String value) {
            addCriterion("actual_table_node >", value, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeGreaterThanOrEqualTo(String value) {
            addCriterion("actual_table_node >=", value, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeLessThan(String value) {
            addCriterion("actual_table_node <", value, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeLessThanOrEqualTo(String value) {
            addCriterion("actual_table_node <=", value, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeLike(String value) {
            addCriterion("actual_table_node like", value, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeNotLike(String value) {
            addCriterion("actual_table_node not like", value, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeIn(List<String> values) {
            addCriterion("actual_table_node in", values, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeNotIn(List<String> values) {
            addCriterion("actual_table_node not in", values, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeBetween(String value1, String value2) {
            addCriterion("actual_table_node between", value1, value2, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andActualTableNodeNotBetween(String value1, String value2) {
            addCriterion("actual_table_node not between", value1, value2, "actualTableNode");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNull() {
            addCriterion("update_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIsNotNull() {
            addCriterion("update_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateNameEqualTo(String value) {
            addCriterion("update_name =", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotEqualTo(String value) {
            addCriterion("update_name <>", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThan(String value) {
            addCriterion("update_name >", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_name >=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThan(String value) {
            addCriterion("update_name <", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLessThanOrEqualTo(String value) {
            addCriterion("update_name <=", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameLike(String value) {
            addCriterion("update_name like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotLike(String value) {
            addCriterion("update_name not like", value, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameIn(List<String> values) {
            addCriterion("update_name in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotIn(List<String> values) {
            addCriterion("update_name not in", values, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameBetween(String value1, String value2) {
            addCriterion("update_name between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateNameNotBetween(String value1, String value2) {
            addCriterion("update_name not between", value1, value2, "updateName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}

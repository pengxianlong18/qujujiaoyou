package cn.codefit.quju.system.model.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasActivityExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPostersListIsNull() {
            addCriterion("posters_list is null");
            return (Criteria) this;
        }

        public Criteria andPostersListIsNotNull() {
            addCriterion("posters_list is not null");
            return (Criteria) this;
        }

        public Criteria andPostersListEqualTo(String value) {
            addCriterion("posters_list =", value, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListNotEqualTo(String value) {
            addCriterion("posters_list <>", value, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListGreaterThan(String value) {
            addCriterion("posters_list >", value, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListGreaterThanOrEqualTo(String value) {
            addCriterion("posters_list >=", value, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListLessThan(String value) {
            addCriterion("posters_list <", value, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListLessThanOrEqualTo(String value) {
            addCriterion("posters_list <=", value, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListLike(String value) {
            addCriterion("posters_list like", value, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListNotLike(String value) {
            addCriterion("posters_list not like", value, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListIn(List<String> values) {
            addCriterion("posters_list in", values, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListNotIn(List<String> values) {
            addCriterion("posters_list not in", values, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListBetween(String value1, String value2) {
            addCriterion("posters_list between", value1, value2, "postersList");
            return (Criteria) this;
        }

        public Criteria andPostersListNotBetween(String value1, String value2) {
            addCriterion("posters_list not between", value1, value2, "postersList");
            return (Criteria) this;
        }

        public Criteria andActivityThemeIsNull() {
            addCriterion("activity_theme is null");
            return (Criteria) this;
        }

        public Criteria andActivityThemeIsNotNull() {
            addCriterion("activity_theme is not null");
            return (Criteria) this;
        }

        public Criteria andActivityThemeEqualTo(String value) {
            addCriterion("activity_theme =", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeNotEqualTo(String value) {
            addCriterion("activity_theme <>", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeGreaterThan(String value) {
            addCriterion("activity_theme >", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_theme >=", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeLessThan(String value) {
            addCriterion("activity_theme <", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeLessThanOrEqualTo(String value) {
            addCriterion("activity_theme <=", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeLike(String value) {
            addCriterion("activity_theme like", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeNotLike(String value) {
            addCriterion("activity_theme not like", value, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeIn(List<String> values) {
            addCriterion("activity_theme in", values, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeNotIn(List<String> values) {
            addCriterion("activity_theme not in", values, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeBetween(String value1, String value2) {
            addCriterion("activity_theme between", value1, value2, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityThemeNotBetween(String value1, String value2) {
            addCriterion("activity_theme not between", value1, value2, "activityTheme");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIsNull() {
            addCriterion("activity_address is null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIsNotNull() {
            addCriterion("activity_address is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressEqualTo(String value) {
            addCriterion("activity_address =", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotEqualTo(String value) {
            addCriterion("activity_address <>", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThan(String value) {
            addCriterion("activity_address >", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("activity_address >=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThan(String value) {
            addCriterion("activity_address <", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThanOrEqualTo(String value) {
            addCriterion("activity_address <=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLike(String value) {
            addCriterion("activity_address like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotLike(String value) {
            addCriterion("activity_address not like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIn(List<String> values) {
            addCriterion("activity_address in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotIn(List<String> values) {
            addCriterion("activity_address not in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressBetween(String value1, String value2) {
            addCriterion("activity_address between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotBetween(String value1, String value2) {
            addCriterion("activity_address not between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andIsPayEndIsNull() {
            addCriterion("is_pay_end is null");
            return (Criteria) this;
        }

        public Criteria andIsPayEndIsNotNull() {
            addCriterion("is_pay_end is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEndEqualTo(Integer value) {
            addCriterion("is_pay_end =", value, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andIsPayEndNotEqualTo(Integer value) {
            addCriterion("is_pay_end <>", value, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andIsPayEndGreaterThan(Integer value) {
            addCriterion("is_pay_end >", value, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andIsPayEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pay_end >=", value, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andIsPayEndLessThan(Integer value) {
            addCriterion("is_pay_end <", value, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andIsPayEndLessThanOrEqualTo(Integer value) {
            addCriterion("is_pay_end <=", value, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andIsPayEndIn(List<Integer> values) {
            addCriterion("is_pay_end in", values, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andIsPayEndNotIn(List<Integer> values) {
            addCriterion("is_pay_end not in", values, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andIsPayEndBetween(Integer value1, Integer value2) {
            addCriterion("is_pay_end between", value1, value2, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andIsPayEndNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pay_end not between", value1, value2, "isPayEnd");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNull() {
            addCriterion("cost_type is null");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNotNull() {
            addCriterion("cost_type is not null");
            return (Criteria) this;
        }

        public Criteria andCostTypeEqualTo(Integer value) {
            addCriterion("cost_type =", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotEqualTo(Integer value) {
            addCriterion("cost_type <>", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThan(Integer value) {
            addCriterion("cost_type >", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_type >=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThan(Integer value) {
            addCriterion("cost_type <", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cost_type <=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeIn(List<Integer> values) {
            addCriterion("cost_type in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotIn(List<Integer> values) {
            addCriterion("cost_type not in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeBetween(Integer value1, Integer value2) {
            addCriterion("cost_type between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_type not between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andActivityAmountIsNull() {
            addCriterion("activity_amount is null");
            return (Criteria) this;
        }

        public Criteria andActivityAmountIsNotNull() {
            addCriterion("activity_amount is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAmountEqualTo(BigDecimal value) {
            addCriterion("activity_amount =", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotEqualTo(BigDecimal value) {
            addCriterion("activity_amount <>", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountGreaterThan(BigDecimal value) {
            addCriterion("activity_amount >", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_amount >=", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountLessThan(BigDecimal value) {
            addCriterion("activity_amount <", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_amount <=", value, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountIn(List<BigDecimal> values) {
            addCriterion("activity_amount in", values, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotIn(List<BigDecimal> values) {
            addCriterion("activity_amount not in", values, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_amount between", value1, value2, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andActivityAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_amount not between", value1, value2, "activityAmount");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationIsNull() {
            addCriterion("primary_classification is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationIsNotNull() {
            addCriterion("primary_classification is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationEqualTo(String value) {
            addCriterion("primary_classification =", value, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationNotEqualTo(String value) {
            addCriterion("primary_classification <>", value, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationGreaterThan(String value) {
            addCriterion("primary_classification >", value, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("primary_classification >=", value, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationLessThan(String value) {
            addCriterion("primary_classification <", value, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationLessThanOrEqualTo(String value) {
            addCriterion("primary_classification <=", value, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationLike(String value) {
            addCriterion("primary_classification like", value, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationNotLike(String value) {
            addCriterion("primary_classification not like", value, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationIn(List<String> values) {
            addCriterion("primary_classification in", values, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationNotIn(List<String> values) {
            addCriterion("primary_classification not in", values, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationBetween(String value1, String value2) {
            addCriterion("primary_classification between", value1, value2, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andPrimaryClassificationNotBetween(String value1, String value2) {
            addCriterion("primary_classification not between", value1, value2, "primaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationIsNull() {
            addCriterion("secondary_classification is null");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationIsNotNull() {
            addCriterion("secondary_classification is not null");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationEqualTo(String value) {
            addCriterion("secondary_classification =", value, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationNotEqualTo(String value) {
            addCriterion("secondary_classification <>", value, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationGreaterThan(String value) {
            addCriterion("secondary_classification >", value, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("secondary_classification >=", value, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationLessThan(String value) {
            addCriterion("secondary_classification <", value, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationLessThanOrEqualTo(String value) {
            addCriterion("secondary_classification <=", value, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationLike(String value) {
            addCriterion("secondary_classification like", value, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationNotLike(String value) {
            addCriterion("secondary_classification not like", value, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationIn(List<String> values) {
            addCriterion("secondary_classification in", values, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationNotIn(List<String> values) {
            addCriterion("secondary_classification not in", values, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationBetween(String value1, String value2) {
            addCriterion("secondary_classification between", value1, value2, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andSecondaryClassificationNotBetween(String value1, String value2) {
            addCriterion("secondary_classification not between", value1, value2, "secondaryClassification");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNull() {
            addCriterion("activity_content is null");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNotNull() {
            addCriterion("activity_content is not null");
            return (Criteria) this;
        }

        public Criteria andActivityContentEqualTo(String value) {
            addCriterion("activity_content =", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotEqualTo(String value) {
            addCriterion("activity_content <>", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThan(String value) {
            addCriterion("activity_content >", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThanOrEqualTo(String value) {
            addCriterion("activity_content >=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThan(String value) {
            addCriterion("activity_content <", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThanOrEqualTo(String value) {
            addCriterion("activity_content <=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLike(String value) {
            addCriterion("activity_content like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotLike(String value) {
            addCriterion("activity_content not like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentIn(List<String> values) {
            addCriterion("activity_content in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotIn(List<String> values) {
            addCriterion("activity_content not in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentBetween(String value1, String value2) {
            addCriterion("activity_content between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotBetween(String value1, String value2) {
            addCriterion("activity_content not between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureIsNull() {
            addCriterion("activity_content_picture is null");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureIsNotNull() {
            addCriterion("activity_content_picture is not null");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureEqualTo(String value) {
            addCriterion("activity_content_picture =", value, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureNotEqualTo(String value) {
            addCriterion("activity_content_picture <>", value, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureGreaterThan(String value) {
            addCriterion("activity_content_picture >", value, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureGreaterThanOrEqualTo(String value) {
            addCriterion("activity_content_picture >=", value, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureLessThan(String value) {
            addCriterion("activity_content_picture <", value, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureLessThanOrEqualTo(String value) {
            addCriterion("activity_content_picture <=", value, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureLike(String value) {
            addCriterion("activity_content_picture like", value, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureNotLike(String value) {
            addCriterion("activity_content_picture not like", value, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureIn(List<String> values) {
            addCriterion("activity_content_picture in", values, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureNotIn(List<String> values) {
            addCriterion("activity_content_picture not in", values, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureBetween(String value1, String value2) {
            addCriterion("activity_content_picture between", value1, value2, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andActivityContentPictureNotBetween(String value1, String value2) {
            addCriterion("activity_content_picture not between", value1, value2, "activityContentPicture");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinIsNull() {
            addCriterion("already_join is null");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinIsNotNull() {
            addCriterion("already_join is not null");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinEqualTo(Integer value) {
            addCriterion("already_join =", value, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinNotEqualTo(Integer value) {
            addCriterion("already_join <>", value, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinGreaterThan(Integer value) {
            addCriterion("already_join >", value, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("already_join >=", value, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinLessThan(Integer value) {
            addCriterion("already_join <", value, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinLessThanOrEqualTo(Integer value) {
            addCriterion("already_join <=", value, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinIn(List<Integer> values) {
            addCriterion("already_join in", values, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinNotIn(List<Integer> values) {
            addCriterion("already_join not in", values, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinBetween(Integer value1, Integer value2) {
            addCriterion("already_join between", value1, value2, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andAlreadyJoinNotBetween(Integer value1, Integer value2) {
            addCriterion("already_join not between", value1, value2, "alreadyJoin");
            return (Criteria) this;
        }

        public Criteria andExpectNumberIsNull() {
            addCriterion("expect_number is null");
            return (Criteria) this;
        }

        public Criteria andExpectNumberIsNotNull() {
            addCriterion("expect_number is not null");
            return (Criteria) this;
        }

        public Criteria andExpectNumberEqualTo(Integer value) {
            addCriterion("expect_number =", value, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andExpectNumberNotEqualTo(Integer value) {
            addCriterion("expect_number <>", value, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andExpectNumberGreaterThan(Integer value) {
            addCriterion("expect_number >", value, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andExpectNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("expect_number >=", value, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andExpectNumberLessThan(Integer value) {
            addCriterion("expect_number <", value, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andExpectNumberLessThanOrEqualTo(Integer value) {
            addCriterion("expect_number <=", value, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andExpectNumberIn(List<Integer> values) {
            addCriterion("expect_number in", values, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andExpectNumberNotIn(List<Integer> values) {
            addCriterion("expect_number not in", values, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andExpectNumberBetween(Integer value1, Integer value2) {
            addCriterion("expect_number between", value1, value2, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andExpectNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("expect_number not between", value1, value2, "expectNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineIsNull() {
            addCriterion("registration_deadline is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineIsNotNull() {
            addCriterion("registration_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineEqualTo(Date value) {
            addCriterion("registration_deadline =", value, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineNotEqualTo(Date value) {
            addCriterion("registration_deadline <>", value, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineGreaterThan(Date value) {
            addCriterion("registration_deadline >", value, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("registration_deadline >=", value, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineLessThan(Date value) {
            addCriterion("registration_deadline <", value, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("registration_deadline <=", value, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineIn(List<Date> values) {
            addCriterion("registration_deadline in", values, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineNotIn(List<Date> values) {
            addCriterion("registration_deadline not in", values, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineBetween(Date value1, Date value2) {
            addCriterion("registration_deadline between", value1, value2, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("registration_deadline not between", value1, value2, "registrationDeadline");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsIsNull() {
            addCriterion("registration_req_questions is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsIsNotNull() {
            addCriterion("registration_req_questions is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsEqualTo(String value) {
            addCriterion("registration_req_questions =", value, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsNotEqualTo(String value) {
            addCriterion("registration_req_questions <>", value, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsGreaterThan(String value) {
            addCriterion("registration_req_questions >", value, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsGreaterThanOrEqualTo(String value) {
            addCriterion("registration_req_questions >=", value, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsLessThan(String value) {
            addCriterion("registration_req_questions <", value, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsLessThanOrEqualTo(String value) {
            addCriterion("registration_req_questions <=", value, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsLike(String value) {
            addCriterion("registration_req_questions like", value, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsNotLike(String value) {
            addCriterion("registration_req_questions not like", value, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsIn(List<String> values) {
            addCriterion("registration_req_questions in", values, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsNotIn(List<String> values) {
            addCriterion("registration_req_questions not in", values, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsBetween(String value1, String value2) {
            addCriterion("registration_req_questions between", value1, value2, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andRegistrationReqQuestionsNotBetween(String value1, String value2) {
            addCriterion("registration_req_questions not between", value1, value2, "registrationReqQuestions");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicIsNull() {
            addCriterion("whether_public is null");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicIsNotNull() {
            addCriterion("whether_public is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicEqualTo(Integer value) {
            addCriterion("whether_public =", value, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicNotEqualTo(Integer value) {
            addCriterion("whether_public <>", value, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicGreaterThan(Integer value) {
            addCriterion("whether_public >", value, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicGreaterThanOrEqualTo(Integer value) {
            addCriterion("whether_public >=", value, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicLessThan(Integer value) {
            addCriterion("whether_public <", value, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicLessThanOrEqualTo(Integer value) {
            addCriterion("whether_public <=", value, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicIn(List<Integer> values) {
            addCriterion("whether_public in", values, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicNotIn(List<Integer> values) {
            addCriterion("whether_public not in", values, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicBetween(Integer value1, Integer value2) {
            addCriterion("whether_public between", value1, value2, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andWhetherPublicNotBetween(Integer value1, Integer value2) {
            addCriterion("whether_public not between", value1, value2, "whetherPublic");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Integer value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Integer value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Integer value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Integer value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Integer value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Integer> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Integer> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdIsNull() {
            addCriterion("primary_id is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdIsNotNull() {
            addCriterion("primary_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdEqualTo(Integer value) {
            addCriterion("primary_id =", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdNotEqualTo(Integer value) {
            addCriterion("primary_id <>", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdGreaterThan(Integer value) {
            addCriterion("primary_id >", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("primary_id >=", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdLessThan(Integer value) {
            addCriterion("primary_id <", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("primary_id <=", value, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdIn(List<Integer> values) {
            addCriterion("primary_id in", values, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdNotIn(List<Integer> values) {
            addCriterion("primary_id not in", values, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdBetween(Integer value1, Integer value2) {
            addCriterion("primary_id between", value1, value2, "primaryId");
            return (Criteria) this;
        }

        public Criteria andPrimaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("primary_id not between", value1, value2, "primaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdIsNull() {
            addCriterion("secondary_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdIsNotNull() {
            addCriterion("secondary_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdEqualTo(Integer value) {
            addCriterion("secondary_id =", value, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdNotEqualTo(Integer value) {
            addCriterion("secondary_id <>", value, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdGreaterThan(Integer value) {
            addCriterion("secondary_id >", value, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondary_id >=", value, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdLessThan(Integer value) {
            addCriterion("secondary_id <", value, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("secondary_id <=", value, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdIn(List<Integer> values) {
            addCriterion("secondary_id in", values, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdNotIn(List<Integer> values) {
            addCriterion("secondary_id not in", values, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdBetween(Integer value1, Integer value2) {
            addCriterion("secondary_id between", value1, value2, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andSecondaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("secondary_id not between", value1, value2, "secondaryId");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andActivityCityIsNull() {
            addCriterion("activity_city is null");
            return (Criteria) this;
        }

        public Criteria andActivityCityIsNotNull() {
            addCriterion("activity_city is not null");
            return (Criteria) this;
        }

        public Criteria andActivityCityEqualTo(String value) {
            addCriterion("activity_city =", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityNotEqualTo(String value) {
            addCriterion("activity_city <>", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityGreaterThan(String value) {
            addCriterion("activity_city >", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityGreaterThanOrEqualTo(String value) {
            addCriterion("activity_city >=", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityLessThan(String value) {
            addCriterion("activity_city <", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityLessThanOrEqualTo(String value) {
            addCriterion("activity_city <=", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityLike(String value) {
            addCriterion("activity_city like", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityNotLike(String value) {
            addCriterion("activity_city not like", value, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityIn(List<String> values) {
            addCriterion("activity_city in", values, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityNotIn(List<String> values) {
            addCriterion("activity_city not in", values, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityBetween(String value1, String value2) {
            addCriterion("activity_city between", value1, value2, "activityCity");
            return (Criteria) this;
        }

        public Criteria andActivityCityNotBetween(String value1, String value2) {
            addCriterion("activity_city not between", value1, value2, "activityCity");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlIsNull() {
            addCriterion("er_code_url is null");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlIsNotNull() {
            addCriterion("er_code_url is not null");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlEqualTo(String value) {
            addCriterion("er_code_url =", value, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlNotEqualTo(String value) {
            addCriterion("er_code_url <>", value, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlGreaterThan(String value) {
            addCriterion("er_code_url >", value, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("er_code_url >=", value, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlLessThan(String value) {
            addCriterion("er_code_url <", value, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("er_code_url <=", value, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlLike(String value) {
            addCriterion("er_code_url like", value, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlNotLike(String value) {
            addCriterion("er_code_url not like", value, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlIn(List<String> values) {
            addCriterion("er_code_url in", values, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlNotIn(List<String> values) {
            addCriterion("er_code_url not in", values, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlBetween(String value1, String value2) {
            addCriterion("er_code_url between", value1, value2, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andErCodeUrlNotBetween(String value1, String value2) {
            addCriterion("er_code_url not between", value1, value2, "erCodeUrl");
            return (Criteria) this;
        }

        public Criteria andCircleIdIsNull() {
            addCriterion("circle_id is null");
            return (Criteria) this;
        }

        public Criteria andCircleIdIsNotNull() {
            addCriterion("circle_id is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIdEqualTo(Long value) {
            addCriterion("circle_id =", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotEqualTo(Long value) {
            addCriterion("circle_id <>", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdGreaterThan(Long value) {
            addCriterion("circle_id >", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("circle_id >=", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdLessThan(Long value) {
            addCriterion("circle_id <", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdLessThanOrEqualTo(Long value) {
            addCriterion("circle_id <=", value, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdIn(List<Long> values) {
            addCriterion("circle_id in", values, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotIn(List<Long> values) {
            addCriterion("circle_id not in", values, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdBetween(Long value1, Long value2) {
            addCriterion("circle_id between", value1, value2, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleIdNotBetween(Long value1, Long value2) {
            addCriterion("circle_id not between", value1, value2, "circleId");
            return (Criteria) this;
        }

        public Criteria andCircleNameIsNull() {
            addCriterion("circle_name is null");
            return (Criteria) this;
        }

        public Criteria andCircleNameIsNotNull() {
            addCriterion("circle_name is not null");
            return (Criteria) this;
        }

        public Criteria andCircleNameEqualTo(String value) {
            addCriterion("circle_name =", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotEqualTo(String value) {
            addCriterion("circle_name <>", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameGreaterThan(String value) {
            addCriterion("circle_name >", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameGreaterThanOrEqualTo(String value) {
            addCriterion("circle_name >=", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLessThan(String value) {
            addCriterion("circle_name <", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLessThanOrEqualTo(String value) {
            addCriterion("circle_name <=", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLike(String value) {
            addCriterion("circle_name like", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotLike(String value) {
            addCriterion("circle_name not like", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameIn(List<String> values) {
            addCriterion("circle_name in", values, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotIn(List<String> values) {
            addCriterion("circle_name not in", values, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameBetween(String value1, String value2) {
            addCriterion("circle_name between", value1, value2, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotBetween(String value1, String value2) {
            addCriterion("circle_name not between", value1, value2, "circleName");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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

        public Criteria andCreateUserNameIsNull() {
            addCriterion("create_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("create_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("create_user_name =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("create_user_name <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("create_user_name >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_name >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("create_user_name <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("create_user_name <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("create_user_name like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("create_user_name not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("create_user_name in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("create_user_name not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("create_user_name between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("create_user_name not between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("modify_user is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("modify_user =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("modify_user <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("modify_user >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("modify_user <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("modify_user <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("modify_user like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("modify_user not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("modify_user in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("modify_user not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("modify_user between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("modify_user not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameIsNull() {
            addCriterion("modify_user_name is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameIsNotNull() {
            addCriterion("modify_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameEqualTo(String value) {
            addCriterion("modify_user_name =", value, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameNotEqualTo(String value) {
            addCriterion("modify_user_name <>", value, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameGreaterThan(String value) {
            addCriterion("modify_user_name >", value, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user_name >=", value, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameLessThan(String value) {
            addCriterion("modify_user_name <", value, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameLessThanOrEqualTo(String value) {
            addCriterion("modify_user_name <=", value, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameLike(String value) {
            addCriterion("modify_user_name like", value, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameNotLike(String value) {
            addCriterion("modify_user_name not like", value, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameIn(List<String> values) {
            addCriterion("modify_user_name in", values, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameNotIn(List<String> values) {
            addCriterion("modify_user_name not in", values, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameBetween(String value1, String value2) {
            addCriterion("modify_user_name between", value1, value2, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andModifyUserNameNotBetween(String value1, String value2) {
            addCriterion("modify_user_name not between", value1, value2, "modifyUserName");
            return (Criteria) this;
        }

        public Criteria andActivityNoIsNull() {
            addCriterion("activity_no is null");
            return (Criteria) this;
        }

        public Criteria andActivityNoIsNotNull() {
            addCriterion("activity_no is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNoEqualTo(String value) {
            addCriterion("activity_no =", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoNotEqualTo(String value) {
            addCriterion("activity_no <>", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoGreaterThan(String value) {
            addCriterion("activity_no >", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoGreaterThanOrEqualTo(String value) {
            addCriterion("activity_no >=", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoLessThan(String value) {
            addCriterion("activity_no <", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoLessThanOrEqualTo(String value) {
            addCriterion("activity_no <=", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoLike(String value) {
            addCriterion("activity_no like", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoNotLike(String value) {
            addCriterion("activity_no not like", value, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoIn(List<String> values) {
            addCriterion("activity_no in", values, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoNotIn(List<String> values) {
            addCriterion("activity_no not in", values, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoBetween(String value1, String value2) {
            addCriterion("activity_no between", value1, value2, "activityNo");
            return (Criteria) this;
        }

        public Criteria andActivityNoNotBetween(String value1, String value2) {
            addCriterion("activity_no not between", value1, value2, "activityNo");
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

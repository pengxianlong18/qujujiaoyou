package cn.codefit.quju.system.model.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppletUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppletUserExample() {
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

        public Criteria andWxnicknameIsNull() {
            addCriterion("wxnickname is null");
            return (Criteria) this;
        }

        public Criteria andWxnicknameIsNotNull() {
            addCriterion("wxnickname is not null");
            return (Criteria) this;
        }

        public Criteria andWxnicknameEqualTo(String value) {
            addCriterion("wxnickname =", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameNotEqualTo(String value) {
            addCriterion("wxnickname <>", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameGreaterThan(String value) {
            addCriterion("wxnickname >", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameGreaterThanOrEqualTo(String value) {
            addCriterion("wxnickname >=", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameLessThan(String value) {
            addCriterion("wxnickname <", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameLessThanOrEqualTo(String value) {
            addCriterion("wxnickname <=", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameLike(String value) {
            addCriterion("wxnickname like", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameNotLike(String value) {
            addCriterion("wxnickname not like", value, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameIn(List<String> values) {
            addCriterion("wxnickname in", values, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameNotIn(List<String> values) {
            addCriterion("wxnickname not in", values, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameBetween(String value1, String value2) {
            addCriterion("wxnickname between", value1, value2, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andWxnicknameNotBetween(String value1, String value2) {
            addCriterion("wxnickname not between", value1, value2, "wxnickname");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("`language` is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("`language` is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(Integer value) {
            addCriterion("`language` =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(Integer value) {
            addCriterion("`language` <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(Integer value) {
            addCriterion("`language` >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(Integer value) {
            addCriterion("`language` >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(Integer value) {
            addCriterion("`language` <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(Integer value) {
            addCriterion("`language` <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<Integer> values) {
            addCriterion("`language` in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<Integer> values) {
            addCriterion("`language` not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(Integer value1, Integer value2) {
            addCriterion("`language` between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(Integer value1, Integer value2) {
            addCriterion("`language` not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoIsNull() {
            addCriterion("cover_photo is null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoIsNotNull() {
            addCriterion("cover_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoEqualTo(String value) {
            addCriterion("cover_photo =", value, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoNotEqualTo(String value) {
            addCriterion("cover_photo <>", value, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoGreaterThan(String value) {
            addCriterion("cover_photo >", value, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("cover_photo >=", value, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoLessThan(String value) {
            addCriterion("cover_photo <", value, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoLessThanOrEqualTo(String value) {
            addCriterion("cover_photo <=", value, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoLike(String value) {
            addCriterion("cover_photo like", value, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoNotLike(String value) {
            addCriterion("cover_photo not like", value, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoIn(List<String> values) {
            addCriterion("cover_photo in", values, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoNotIn(List<String> values) {
            addCriterion("cover_photo not in", values, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoBetween(String value1, String value2) {
            addCriterion("cover_photo between", value1, value2, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andCoverPhotoNotBetween(String value1, String value2) {
            addCriterion("cover_photo not between", value1, value2, "coverPhoto");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("union_id is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("union_id =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("union_id <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("union_id >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("union_id >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("union_id <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("union_id <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("union_id like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("union_id not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("union_id in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("union_id not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("union_id between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("union_id not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionIsNull() {
            addCriterion("self_introduction is null");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionIsNotNull() {
            addCriterion("self_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionEqualTo(String value) {
            addCriterion("self_introduction =", value, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionNotEqualTo(String value) {
            addCriterion("self_introduction <>", value, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionGreaterThan(String value) {
            addCriterion("self_introduction >", value, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("self_introduction >=", value, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionLessThan(String value) {
            addCriterion("self_introduction <", value, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionLessThanOrEqualTo(String value) {
            addCriterion("self_introduction <=", value, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionLike(String value) {
            addCriterion("self_introduction like", value, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionNotLike(String value) {
            addCriterion("self_introduction not like", value, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionIn(List<String> values) {
            addCriterion("self_introduction in", values, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionNotIn(List<String> values) {
            addCriterion("self_introduction not in", values, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionBetween(String value1, String value2) {
            addCriterion("self_introduction between", value1, value2, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andSelfIntroductionNotBetween(String value1, String value2) {
            addCriterion("self_introduction not between", value1, value2, "selfIntroduction");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andUserIndustryIsNull() {
            addCriterion("user_industry is null");
            return (Criteria) this;
        }

        public Criteria andUserIndustryIsNotNull() {
            addCriterion("user_industry is not null");
            return (Criteria) this;
        }

        public Criteria andUserIndustryEqualTo(String value) {
            addCriterion("user_industry =", value, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryNotEqualTo(String value) {
            addCriterion("user_industry <>", value, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryGreaterThan(String value) {
            addCriterion("user_industry >", value, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("user_industry >=", value, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryLessThan(String value) {
            addCriterion("user_industry <", value, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryLessThanOrEqualTo(String value) {
            addCriterion("user_industry <=", value, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryLike(String value) {
            addCriterion("user_industry like", value, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryNotLike(String value) {
            addCriterion("user_industry not like", value, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryIn(List<String> values) {
            addCriterion("user_industry in", values, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryNotIn(List<String> values) {
            addCriterion("user_industry not in", values, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryBetween(String value1, String value2) {
            addCriterion("user_industry between", value1, value2, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserIndustryNotBetween(String value1, String value2) {
            addCriterion("user_industry not between", value1, value2, "userIndustry");
            return (Criteria) this;
        }

        public Criteria andUserPositionIsNull() {
            addCriterion("user_position is null");
            return (Criteria) this;
        }

        public Criteria andUserPositionIsNotNull() {
            addCriterion("user_position is not null");
            return (Criteria) this;
        }

        public Criteria andUserPositionEqualTo(String value) {
            addCriterion("user_position =", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotEqualTo(String value) {
            addCriterion("user_position <>", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionGreaterThan(String value) {
            addCriterion("user_position >", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionGreaterThanOrEqualTo(String value) {
            addCriterion("user_position >=", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionLessThan(String value) {
            addCriterion("user_position <", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionLessThanOrEqualTo(String value) {
            addCriterion("user_position <=", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionLike(String value) {
            addCriterion("user_position like", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotLike(String value) {
            addCriterion("user_position not like", value, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionIn(List<String> values) {
            addCriterion("user_position in", values, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotIn(List<String> values) {
            addCriterion("user_position not in", values, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionBetween(String value1, String value2) {
            addCriterion("user_position between", value1, value2, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserPositionNotBetween(String value1, String value2) {
            addCriterion("user_position not between", value1, value2, "userPosition");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyIsNull() {
            addCriterion("user_work_company is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyIsNotNull() {
            addCriterion("user_work_company is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyEqualTo(String value) {
            addCriterion("user_work_company =", value, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyNotEqualTo(String value) {
            addCriterion("user_work_company <>", value, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyGreaterThan(String value) {
            addCriterion("user_work_company >", value, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("user_work_company >=", value, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyLessThan(String value) {
            addCriterion("user_work_company <", value, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyLessThanOrEqualTo(String value) {
            addCriterion("user_work_company <=", value, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyLike(String value) {
            addCriterion("user_work_company like", value, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyNotLike(String value) {
            addCriterion("user_work_company not like", value, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyIn(List<String> values) {
            addCriterion("user_work_company in", values, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyNotIn(List<String> values) {
            addCriterion("user_work_company not in", values, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyBetween(String value1, String value2) {
            addCriterion("user_work_company between", value1, value2, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andUserWorkCompanyNotBetween(String value1, String value2) {
            addCriterion("user_work_company not between", value1, value2, "userWorkCompany");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNull() {
            addCriterion("graduate_school is null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNotNull() {
            addCriterion("graduate_school is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolEqualTo(String value) {
            addCriterion("graduate_school =", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotEqualTo(String value) {
            addCriterion("graduate_school <>", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThan(String value) {
            addCriterion("graduate_school >", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduate_school >=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThan(String value) {
            addCriterion("graduate_school <", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduate_school <=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLike(String value) {
            addCriterion("graduate_school like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotLike(String value) {
            addCriterion("graduate_school not like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIn(List<String> values) {
            addCriterion("graduate_school in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotIn(List<String> values) {
            addCriterion("graduate_school not in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolBetween(String value1, String value2) {
            addCriterion("graduate_school between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("graduate_school not between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolIsNull() {
            addCriterion("record_of_school is null");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolIsNotNull() {
            addCriterion("record_of_school is not null");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolEqualTo(String value) {
            addCriterion("record_of_school =", value, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolNotEqualTo(String value) {
            addCriterion("record_of_school <>", value, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolGreaterThan(String value) {
            addCriterion("record_of_school >", value, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("record_of_school >=", value, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolLessThan(String value) {
            addCriterion("record_of_school <", value, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolLessThanOrEqualTo(String value) {
            addCriterion("record_of_school <=", value, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolLike(String value) {
            addCriterion("record_of_school like", value, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolNotLike(String value) {
            addCriterion("record_of_school not like", value, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolIn(List<String> values) {
            addCriterion("record_of_school in", values, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolNotIn(List<String> values) {
            addCriterion("record_of_school not in", values, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolBetween(String value1, String value2) {
            addCriterion("record_of_school between", value1, value2, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andRecordOfSchoolNotBetween(String value1, String value2) {
            addCriterion("record_of_school not between", value1, value2, "recordOfSchool");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceIsNull() {
            addCriterion("current_province is null");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceIsNotNull() {
            addCriterion("current_province is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceEqualTo(String value) {
            addCriterion("current_province =", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotEqualTo(String value) {
            addCriterion("current_province <>", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceGreaterThan(String value) {
            addCriterion("current_province >", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("current_province >=", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceLessThan(String value) {
            addCriterion("current_province <", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceLessThanOrEqualTo(String value) {
            addCriterion("current_province <=", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceLike(String value) {
            addCriterion("current_province like", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotLike(String value) {
            addCriterion("current_province not like", value, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceIn(List<String> values) {
            addCriterion("current_province in", values, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotIn(List<String> values) {
            addCriterion("current_province not in", values, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceBetween(String value1, String value2) {
            addCriterion("current_province between", value1, value2, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentProvinceNotBetween(String value1, String value2) {
            addCriterion("current_province not between", value1, value2, "currentProvince");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIsNull() {
            addCriterion("current_city is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIsNotNull() {
            addCriterion("current_city is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCityEqualTo(String value) {
            addCriterion("current_city =", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotEqualTo(String value) {
            addCriterion("current_city <>", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityGreaterThan(String value) {
            addCriterion("current_city >", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityGreaterThanOrEqualTo(String value) {
            addCriterion("current_city >=", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLessThan(String value) {
            addCriterion("current_city <", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLessThanOrEqualTo(String value) {
            addCriterion("current_city <=", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityLike(String value) {
            addCriterion("current_city like", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotLike(String value) {
            addCriterion("current_city not like", value, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityIn(List<String> values) {
            addCriterion("current_city in", values, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotIn(List<String> values) {
            addCriterion("current_city not in", values, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityBetween(String value1, String value2) {
            addCriterion("current_city between", value1, value2, "currentCity");
            return (Criteria) this;
        }

        public Criteria andCurrentCityNotBetween(String value1, String value2) {
            addCriterion("current_city not between", value1, value2, "currentCity");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceIsNull() {
            addCriterion("home_province is null");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceIsNotNull() {
            addCriterion("home_province is not null");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceEqualTo(String value) {
            addCriterion("home_province =", value, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceNotEqualTo(String value) {
            addCriterion("home_province <>", value, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceGreaterThan(String value) {
            addCriterion("home_province >", value, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("home_province >=", value, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceLessThan(String value) {
            addCriterion("home_province <", value, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceLessThanOrEqualTo(String value) {
            addCriterion("home_province <=", value, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceLike(String value) {
            addCriterion("home_province like", value, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceNotLike(String value) {
            addCriterion("home_province not like", value, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceIn(List<String> values) {
            addCriterion("home_province in", values, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceNotIn(List<String> values) {
            addCriterion("home_province not in", values, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceBetween(String value1, String value2) {
            addCriterion("home_province between", value1, value2, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeProvinceNotBetween(String value1, String value2) {
            addCriterion("home_province not between", value1, value2, "homeProvince");
            return (Criteria) this;
        }

        public Criteria andHomeCityIsNull() {
            addCriterion("home_city is null");
            return (Criteria) this;
        }

        public Criteria andHomeCityIsNotNull() {
            addCriterion("home_city is not null");
            return (Criteria) this;
        }

        public Criteria andHomeCityEqualTo(String value) {
            addCriterion("home_city =", value, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityNotEqualTo(String value) {
            addCriterion("home_city <>", value, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityGreaterThan(String value) {
            addCriterion("home_city >", value, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityGreaterThanOrEqualTo(String value) {
            addCriterion("home_city >=", value, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityLessThan(String value) {
            addCriterion("home_city <", value, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityLessThanOrEqualTo(String value) {
            addCriterion("home_city <=", value, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityLike(String value) {
            addCriterion("home_city like", value, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityNotLike(String value) {
            addCriterion("home_city not like", value, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityIn(List<String> values) {
            addCriterion("home_city in", values, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityNotIn(List<String> values) {
            addCriterion("home_city not in", values, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityBetween(String value1, String value2) {
            addCriterion("home_city between", value1, value2, "homeCity");
            return (Criteria) this;
        }

        public Criteria andHomeCityNotBetween(String value1, String value2) {
            addCriterion("home_city not between", value1, value2, "homeCity");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateIsNull() {
            addCriterion("emotional_state is null");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateIsNotNull() {
            addCriterion("emotional_state is not null");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateEqualTo(Integer value) {
            addCriterion("emotional_state =", value, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateNotEqualTo(Integer value) {
            addCriterion("emotional_state <>", value, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateGreaterThan(Integer value) {
            addCriterion("emotional_state >", value, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("emotional_state >=", value, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateLessThan(Integer value) {
            addCriterion("emotional_state <", value, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateLessThanOrEqualTo(Integer value) {
            addCriterion("emotional_state <=", value, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateIn(List<Integer> values) {
            addCriterion("emotional_state in", values, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateNotIn(List<Integer> values) {
            addCriterion("emotional_state not in", values, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateBetween(Integer value1, Integer value2) {
            addCriterion("emotional_state between", value1, value2, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andEmotionalStateNotBetween(Integer value1, Integer value2) {
            addCriterion("emotional_state not between", value1, value2, "emotionalState");
            return (Criteria) this;
        }

        public Criteria andUserConstellationIsNull() {
            addCriterion("user_constellation is null");
            return (Criteria) this;
        }

        public Criteria andUserConstellationIsNotNull() {
            addCriterion("user_constellation is not null");
            return (Criteria) this;
        }

        public Criteria andUserConstellationEqualTo(String value) {
            addCriterion("user_constellation =", value, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationNotEqualTo(String value) {
            addCriterion("user_constellation <>", value, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationGreaterThan(String value) {
            addCriterion("user_constellation >", value, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("user_constellation >=", value, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationLessThan(String value) {
            addCriterion("user_constellation <", value, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationLessThanOrEqualTo(String value) {
            addCriterion("user_constellation <=", value, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationLike(String value) {
            addCriterion("user_constellation like", value, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationNotLike(String value) {
            addCriterion("user_constellation not like", value, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationIn(List<String> values) {
            addCriterion("user_constellation in", values, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationNotIn(List<String> values) {
            addCriterion("user_constellation not in", values, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationBetween(String value1, String value2) {
            addCriterion("user_constellation between", value1, value2, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andUserConstellationNotBetween(String value1, String value2) {
            addCriterion("user_constellation not between", value1, value2, "userConstellation");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNull() {
            addCriterion("date_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNotNull() {
            addCriterion("date_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthEqualTo(String value) {
            addCriterion("date_of_birth =", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotEqualTo(String value) {
            addCriterion("date_of_birth <>", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThan(String value) {
            addCriterion("date_of_birth >", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThanOrEqualTo(String value) {
            addCriterion("date_of_birth >=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThan(String value) {
            addCriterion("date_of_birth <", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThanOrEqualTo(String value) {
            addCriterion("date_of_birth <=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLike(String value) {
            addCriterion("date_of_birth like", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotLike(String value) {
            addCriterion("date_of_birth not like", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIn(List<String> values) {
            addCriterion("date_of_birth in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotIn(List<String> values) {
            addCriterion("date_of_birth not in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthBetween(String value1, String value2) {
            addCriterion("date_of_birth between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotBetween(String value1, String value2) {
            addCriterion("date_of_birth not between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andNationalIsNull() {
            addCriterion("`national` is null");
            return (Criteria) this;
        }

        public Criteria andNationalIsNotNull() {
            addCriterion("`national` is not null");
            return (Criteria) this;
        }

        public Criteria andNationalEqualTo(String value) {
            addCriterion("`national` =", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotEqualTo(String value) {
            addCriterion("`national` <>", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThan(String value) {
            addCriterion("`national` >", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThanOrEqualTo(String value) {
            addCriterion("`national` >=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThan(String value) {
            addCriterion("`national` <", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThanOrEqualTo(String value) {
            addCriterion("`national` <=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLike(String value) {
            addCriterion("`national` like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotLike(String value) {
            addCriterion("`national` not like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalIn(List<String> values) {
            addCriterion("`national` in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotIn(List<String> values) {
            addCriterion("`national` not in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalBetween(String value1, String value2) {
            addCriterion("`national` between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotBetween(String value1, String value2) {
            addCriterion("`national` not between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andFaithIsNull() {
            addCriterion("faith is null");
            return (Criteria) this;
        }

        public Criteria andFaithIsNotNull() {
            addCriterion("faith is not null");
            return (Criteria) this;
        }

        public Criteria andFaithEqualTo(String value) {
            addCriterion("faith =", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithNotEqualTo(String value) {
            addCriterion("faith <>", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithGreaterThan(String value) {
            addCriterion("faith >", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithGreaterThanOrEqualTo(String value) {
            addCriterion("faith >=", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithLessThan(String value) {
            addCriterion("faith <", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithLessThanOrEqualTo(String value) {
            addCriterion("faith <=", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithLike(String value) {
            addCriterion("faith like", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithNotLike(String value) {
            addCriterion("faith not like", value, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithIn(List<String> values) {
            addCriterion("faith in", values, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithNotIn(List<String> values) {
            addCriterion("faith not in", values, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithBetween(String value1, String value2) {
            addCriterion("faith between", value1, value2, "faith");
            return (Criteria) this;
        }

        public Criteria andFaithNotBetween(String value1, String value2) {
            addCriterion("faith not between", value1, value2, "faith");
            return (Criteria) this;
        }

        public Criteria andAnimalSignIsNull() {
            addCriterion("animal_sign is null");
            return (Criteria) this;
        }

        public Criteria andAnimalSignIsNotNull() {
            addCriterion("animal_sign is not null");
            return (Criteria) this;
        }

        public Criteria andAnimalSignEqualTo(String value) {
            addCriterion("animal_sign =", value, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignNotEqualTo(String value) {
            addCriterion("animal_sign <>", value, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignGreaterThan(String value) {
            addCriterion("animal_sign >", value, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignGreaterThanOrEqualTo(String value) {
            addCriterion("animal_sign >=", value, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignLessThan(String value) {
            addCriterion("animal_sign <", value, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignLessThanOrEqualTo(String value) {
            addCriterion("animal_sign <=", value, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignLike(String value) {
            addCriterion("animal_sign like", value, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignNotLike(String value) {
            addCriterion("animal_sign not like", value, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignIn(List<String> values) {
            addCriterion("animal_sign in", values, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignNotIn(List<String> values) {
            addCriterion("animal_sign not in", values, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignBetween(String value1, String value2) {
            addCriterion("animal_sign between", value1, value2, "animalSign");
            return (Criteria) this;
        }

        public Criteria andAnimalSignNotBetween(String value1, String value2) {
            addCriterion("animal_sign not between", value1, value2, "animalSign");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Short value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Short value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Short value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Short value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Short value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Short value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Short> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Short> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Short value1, Short value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Short value1, Short value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Short value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Short value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Short value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Short value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Short value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Short value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Short> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Short> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Short value1, Short value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Short value1, Short value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNull() {
            addCriterion("blood_type is null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNotNull() {
            addCriterion("blood_type is not null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeEqualTo(Integer value) {
            addCriterion("blood_type =", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotEqualTo(Integer value) {
            addCriterion("blood_type <>", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThan(Integer value) {
            addCriterion("blood_type >", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("blood_type >=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThan(Integer value) {
            addCriterion("blood_type <", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThanOrEqualTo(Integer value) {
            addCriterion("blood_type <=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIn(List<Integer> values) {
            addCriterion("blood_type in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotIn(List<Integer> values) {
            addCriterion("blood_type not in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeBetween(Integer value1, Integer value2) {
            addCriterion("blood_type between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("blood_type not between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andInfointegrityIsNull() {
            addCriterion("infoIntegrity is null");
            return (Criteria) this;
        }

        public Criteria andInfointegrityIsNotNull() {
            addCriterion("infoIntegrity is not null");
            return (Criteria) this;
        }

        public Criteria andInfointegrityEqualTo(BigDecimal value) {
            addCriterion("infoIntegrity =", value, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInfointegrityNotEqualTo(BigDecimal value) {
            addCriterion("infoIntegrity <>", value, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInfointegrityGreaterThan(BigDecimal value) {
            addCriterion("infoIntegrity >", value, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInfointegrityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("infoIntegrity >=", value, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInfointegrityLessThan(BigDecimal value) {
            addCriterion("infoIntegrity <", value, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInfointegrityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("infoIntegrity <=", value, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInfointegrityIn(List<BigDecimal> values) {
            addCriterion("infoIntegrity in", values, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInfointegrityNotIn(List<BigDecimal> values) {
            addCriterion("infoIntegrity not in", values, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInfointegrityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoIntegrity between", value1, value2, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInfointegrityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("infoIntegrity not between", value1, value2, "infointegrity");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNull() {
            addCriterion("invite_code is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("invite_code =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("invite_code <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("invite_code >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invite_code >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("invite_code <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("invite_code <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("invite_code like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("invite_code not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("invite_code in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("invite_code not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("invite_code between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("invite_code not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIsNull() {
            addCriterion("register_type is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIsNotNull() {
            addCriterion("register_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeEqualTo(String value) {
            addCriterion("register_type =", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotEqualTo(String value) {
            addCriterion("register_type <>", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeGreaterThan(String value) {
            addCriterion("register_type >", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("register_type >=", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLessThan(String value) {
            addCriterion("register_type <", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLessThanOrEqualTo(String value) {
            addCriterion("register_type <=", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeLike(String value) {
            addCriterion("register_type like", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotLike(String value) {
            addCriterion("register_type not like", value, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeIn(List<String> values) {
            addCriterion("register_type in", values, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotIn(List<String> values) {
            addCriterion("register_type not in", values, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeBetween(String value1, String value2) {
            addCriterion("register_type between", value1, value2, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegisterTypeNotBetween(String value1, String value2) {
            addCriterion("register_type not between", value1, value2, "registerType");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeIsNull() {
            addCriterion("registration_code is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeIsNotNull() {
            addCriterion("registration_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeEqualTo(String value) {
            addCriterion("registration_code =", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotEqualTo(String value) {
            addCriterion("registration_code <>", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeGreaterThan(String value) {
            addCriterion("registration_code >", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("registration_code >=", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeLessThan(String value) {
            addCriterion("registration_code <", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeLessThanOrEqualTo(String value) {
            addCriterion("registration_code <=", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeLike(String value) {
            addCriterion("registration_code like", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotLike(String value) {
            addCriterion("registration_code not like", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeIn(List<String> values) {
            addCriterion("registration_code in", values, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotIn(List<String> values) {
            addCriterion("registration_code not in", values, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeBetween(String value1, String value2) {
            addCriterion("registration_code between", value1, value2, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotBetween(String value1, String value2) {
            addCriterion("registration_code not between", value1, value2, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("pass like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("pass not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNull() {
            addCriterion("dev_type is null");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNotNull() {
            addCriterion("dev_type is not null");
            return (Criteria) this;
        }

        public Criteria andDevTypeEqualTo(String value) {
            addCriterion("dev_type =", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotEqualTo(String value) {
            addCriterion("dev_type <>", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThan(String value) {
            addCriterion("dev_type >", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dev_type >=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThan(String value) {
            addCriterion("dev_type <", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThanOrEqualTo(String value) {
            addCriterion("dev_type <=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLike(String value) {
            addCriterion("dev_type like", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotLike(String value) {
            addCriterion("dev_type not like", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeIn(List<String> values) {
            addCriterion("dev_type in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotIn(List<String> values) {
            addCriterion("dev_type not in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeBetween(String value1, String value2) {
            addCriterion("dev_type between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotBetween(String value1, String value2) {
            addCriterion("dev_type not between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIsNull() {
            addCriterion("register_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIsNotNull() {
            addCriterion("register_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIpEqualTo(String value) {
            addCriterion("register_ip =", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotEqualTo(String value) {
            addCriterion("register_ip <>", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpGreaterThan(String value) {
            addCriterion("register_ip >", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpGreaterThanOrEqualTo(String value) {
            addCriterion("register_ip >=", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLessThan(String value) {
            addCriterion("register_ip <", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLessThanOrEqualTo(String value) {
            addCriterion("register_ip <=", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpLike(String value) {
            addCriterion("register_ip like", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotLike(String value) {
            addCriterion("register_ip not like", value, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpIn(List<String> values) {
            addCriterion("register_ip in", values, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotIn(List<String> values) {
            addCriterion("register_ip not in", values, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpBetween(String value1, String value2) {
            addCriterion("register_ip between", value1, value2, "registerIp");
            return (Criteria) this;
        }

        public Criteria andRegisterIpNotBetween(String value1, String value2) {
            addCriterion("register_ip not between", value1, value2, "registerIp");
            return (Criteria) this;
        }

        public Criteria andInviterIdIsNull() {
            addCriterion("inviter_id is null");
            return (Criteria) this;
        }

        public Criteria andInviterIdIsNotNull() {
            addCriterion("inviter_id is not null");
            return (Criteria) this;
        }

        public Criteria andInviterIdEqualTo(Integer value) {
            addCriterion("inviter_id =", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdNotEqualTo(Integer value) {
            addCriterion("inviter_id <>", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdGreaterThan(Integer value) {
            addCriterion("inviter_id >", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inviter_id >=", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdLessThan(Integer value) {
            addCriterion("inviter_id <", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdLessThanOrEqualTo(Integer value) {
            addCriterion("inviter_id <=", value, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdIn(List<Integer> values) {
            addCriterion("inviter_id in", values, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdNotIn(List<Integer> values) {
            addCriterion("inviter_id not in", values, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdBetween(Integer value1, Integer value2) {
            addCriterion("inviter_id between", value1, value2, "inviterId");
            return (Criteria) this;
        }

        public Criteria andInviterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inviter_id not between", value1, value2, "inviterId");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andUserPowerIsNull() {
            addCriterion("user_power is null");
            return (Criteria) this;
        }

        public Criteria andUserPowerIsNotNull() {
            addCriterion("user_power is not null");
            return (Criteria) this;
        }

        public Criteria andUserPowerEqualTo(Integer value) {
            addCriterion("user_power =", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerNotEqualTo(Integer value) {
            addCriterion("user_power <>", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerGreaterThan(Integer value) {
            addCriterion("user_power >", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_power >=", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerLessThan(Integer value) {
            addCriterion("user_power <", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerLessThanOrEqualTo(Integer value) {
            addCriterion("user_power <=", value, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerIn(List<Integer> values) {
            addCriterion("user_power in", values, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerNotIn(List<Integer> values) {
            addCriterion("user_power not in", values, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerBetween(Integer value1, Integer value2) {
            addCriterion("user_power between", value1, value2, "userPower");
            return (Criteria) this;
        }

        public Criteria andUserPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("user_power not between", value1, value2, "userPower");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdIsNull() {
            addCriterion("gzh_open_id is null");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdIsNotNull() {
            addCriterion("gzh_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdEqualTo(String value) {
            addCriterion("gzh_open_id =", value, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdNotEqualTo(String value) {
            addCriterion("gzh_open_id <>", value, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdGreaterThan(String value) {
            addCriterion("gzh_open_id >", value, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("gzh_open_id >=", value, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdLessThan(String value) {
            addCriterion("gzh_open_id <", value, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdLessThanOrEqualTo(String value) {
            addCriterion("gzh_open_id <=", value, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdLike(String value) {
            addCriterion("gzh_open_id like", value, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdNotLike(String value) {
            addCriterion("gzh_open_id not like", value, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdIn(List<String> values) {
            addCriterion("gzh_open_id in", values, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdNotIn(List<String> values) {
            addCriterion("gzh_open_id not in", values, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdBetween(String value1, String value2) {
            addCriterion("gzh_open_id between", value1, value2, "gzhOpenId");
            return (Criteria) this;
        }

        public Criteria andGzhOpenIdNotBetween(String value1, String value2) {
            addCriterion("gzh_open_id not between", value1, value2, "gzhOpenId");
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

        public Criteria andIsFocusWechatServiceIsNull() {
            addCriterion("is_focus_wechat_service is null");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceIsNotNull() {
            addCriterion("is_focus_wechat_service is not null");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceEqualTo(Integer value) {
            addCriterion("is_focus_wechat_service =", value, "isFocusWechatService");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceNotEqualTo(Integer value) {
            addCriterion("is_focus_wechat_service <>", value, "isFocusWechatService");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceGreaterThan(Integer value) {
            addCriterion("is_focus_wechat_service >", value, "isFocusWechatService");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_focus_wechat_service >=", value, "isFocusWechatService");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceLessThan(Integer value) {
            addCriterion("is_focus_wechat_service <", value, "isFocusWechatService");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceLessThanOrEqualTo(Integer value) {
            addCriterion("is_focus_wechat_service <=", value, "isFocusWechatService");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceIn(List<Integer> values) {
            addCriterion("is_focus_wechat_service in", values, "isFocusWechatService");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceNotIn(List<Integer> values) {
            addCriterion("is_focus_wechat_service not in", values, "isFocusWechatService");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceBetween(Integer value1, Integer value2) {
            addCriterion("is_focus_wechat_service between", value1, value2, "isFocusWechatService");
            return (Criteria) this;
        }

        public Criteria andIsFocusWechatServiceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_focus_wechat_service not between", value1, value2, "isFocusWechatService");
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

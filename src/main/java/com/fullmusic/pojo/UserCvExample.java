package com.fullmusic.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserCvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCvExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVcUserIdIsNull() {
            addCriterion("vc_user_id is null");
            return (Criteria) this;
        }

        public Criteria andVcUserIdIsNotNull() {
            addCriterion("vc_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andVcUserIdEqualTo(String value) {
            addCriterion("vc_user_id =", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotEqualTo(String value) {
            addCriterion("vc_user_id <>", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdGreaterThan(String value) {
            addCriterion("vc_user_id >", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("vc_user_id >=", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdLessThan(String value) {
            addCriterion("vc_user_id <", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdLessThanOrEqualTo(String value) {
            addCriterion("vc_user_id <=", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdLike(String value) {
            addCriterion("vc_user_id like", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotLike(String value) {
            addCriterion("vc_user_id not like", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdIn(List<String> values) {
            addCriterion("vc_user_id in", values, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotIn(List<String> values) {
            addCriterion("vc_user_id not in", values, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdBetween(String value1, String value2) {
            addCriterion("vc_user_id between", value1, value2, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotBetween(String value1, String value2) {
            addCriterion("vc_user_id not between", value1, value2, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameIsNull() {
            addCriterion("vc_student_name is null");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameIsNotNull() {
            addCriterion("vc_student_name is not null");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameEqualTo(String value) {
            addCriterion("vc_student_name =", value, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameNotEqualTo(String value) {
            addCriterion("vc_student_name <>", value, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameGreaterThan(String value) {
            addCriterion("vc_student_name >", value, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_student_name >=", value, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameLessThan(String value) {
            addCriterion("vc_student_name <", value, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameLessThanOrEqualTo(String value) {
            addCriterion("vc_student_name <=", value, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameLike(String value) {
            addCriterion("vc_student_name like", value, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameNotLike(String value) {
            addCriterion("vc_student_name not like", value, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameIn(List<String> values) {
            addCriterion("vc_student_name in", values, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameNotIn(List<String> values) {
            addCriterion("vc_student_name not in", values, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameBetween(String value1, String value2) {
            addCriterion("vc_student_name between", value1, value2, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentNameNotBetween(String value1, String value2) {
            addCriterion("vc_student_name not between", value1, value2, "vcStudentName");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeIsNull() {
            addCriterion("vc_student_age is null");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeIsNotNull() {
            addCriterion("vc_student_age is not null");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeEqualTo(Integer value) {
            addCriterion("vc_student_age =", value, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeNotEqualTo(Integer value) {
            addCriterion("vc_student_age <>", value, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeGreaterThan(Integer value) {
            addCriterion("vc_student_age >", value, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_student_age >=", value, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeLessThan(Integer value) {
            addCriterion("vc_student_age <", value, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeLessThanOrEqualTo(Integer value) {
            addCriterion("vc_student_age <=", value, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeIn(List<Integer> values) {
            addCriterion("vc_student_age in", values, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeNotIn(List<Integer> values) {
            addCriterion("vc_student_age not in", values, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeBetween(Integer value1, Integer value2) {
            addCriterion("vc_student_age between", value1, value2, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_student_age not between", value1, value2, "vcStudentAge");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneIsNull() {
            addCriterion("vc_student_phone is null");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneIsNotNull() {
            addCriterion("vc_student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneEqualTo(String value) {
            addCriterion("vc_student_phone =", value, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneNotEqualTo(String value) {
            addCriterion("vc_student_phone <>", value, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneGreaterThan(String value) {
            addCriterion("vc_student_phone >", value, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("vc_student_phone >=", value, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneLessThan(String value) {
            addCriterion("vc_student_phone <", value, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("vc_student_phone <=", value, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneLike(String value) {
            addCriterion("vc_student_phone like", value, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneNotLike(String value) {
            addCriterion("vc_student_phone not like", value, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneIn(List<String> values) {
            addCriterion("vc_student_phone in", values, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneNotIn(List<String> values) {
            addCriterion("vc_student_phone not in", values, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneBetween(String value1, String value2) {
            addCriterion("vc_student_phone between", value1, value2, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("vc_student_phone not between", value1, value2, "vcStudentPhone");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeIsNull() {
            addCriterion("vc_learing_time is null");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeIsNotNull() {
            addCriterion("vc_learing_time is not null");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeEqualTo(String value) {
            addCriterion("vc_learing_time =", value, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeNotEqualTo(String value) {
            addCriterion("vc_learing_time <>", value, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeGreaterThan(String value) {
            addCriterion("vc_learing_time >", value, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("vc_learing_time >=", value, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeLessThan(String value) {
            addCriterion("vc_learing_time <", value, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeLessThanOrEqualTo(String value) {
            addCriterion("vc_learing_time <=", value, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeLike(String value) {
            addCriterion("vc_learing_time like", value, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeNotLike(String value) {
            addCriterion("vc_learing_time not like", value, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeIn(List<String> values) {
            addCriterion("vc_learing_time in", values, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeNotIn(List<String> values) {
            addCriterion("vc_learing_time not in", values, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeBetween(String value1, String value2) {
            addCriterion("vc_learing_time between", value1, value2, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcLearingTimeNotBetween(String value1, String value2) {
            addCriterion("vc_learing_time not between", value1, value2, "vcLearingTime");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoIsNull() {
            addCriterion("vc_have_piano is null");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoIsNotNull() {
            addCriterion("vc_have_piano is not null");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoEqualTo(String value) {
            addCriterion("vc_have_piano =", value, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoNotEqualTo(String value) {
            addCriterion("vc_have_piano <>", value, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoGreaterThan(String value) {
            addCriterion("vc_have_piano >", value, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoGreaterThanOrEqualTo(String value) {
            addCriterion("vc_have_piano >=", value, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoLessThan(String value) {
            addCriterion("vc_have_piano <", value, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoLessThanOrEqualTo(String value) {
            addCriterion("vc_have_piano <=", value, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoLike(String value) {
            addCriterion("vc_have_piano like", value, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoNotLike(String value) {
            addCriterion("vc_have_piano not like", value, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoIn(List<String> values) {
            addCriterion("vc_have_piano in", values, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoNotIn(List<String> values) {
            addCriterion("vc_have_piano not in", values, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoBetween(String value1, String value2) {
            addCriterion("vc_have_piano between", value1, value2, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcHavePianoNotBetween(String value1, String value2) {
            addCriterion("vc_have_piano not between", value1, value2, "vcHavePiano");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameIsNull() {
            addCriterion("vc_alias_name is null");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameIsNotNull() {
            addCriterion("vc_alias_name is not null");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameEqualTo(String value) {
            addCriterion("vc_alias_name =", value, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameNotEqualTo(String value) {
            addCriterion("vc_alias_name <>", value, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameGreaterThan(String value) {
            addCriterion("vc_alias_name >", value, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_alias_name >=", value, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameLessThan(String value) {
            addCriterion("vc_alias_name <", value, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameLessThanOrEqualTo(String value) {
            addCriterion("vc_alias_name <=", value, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameLike(String value) {
            addCriterion("vc_alias_name like", value, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameNotLike(String value) {
            addCriterion("vc_alias_name not like", value, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameIn(List<String> values) {
            addCriterion("vc_alias_name in", values, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameNotIn(List<String> values) {
            addCriterion("vc_alias_name not in", values, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameBetween(String value1, String value2) {
            addCriterion("vc_alias_name between", value1, value2, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcAliasNameNotBetween(String value1, String value2) {
            addCriterion("vc_alias_name not between", value1, value2, "vcAliasName");
            return (Criteria) this;
        }

        public Criteria andVcRemarkIsNull() {
            addCriterion("vc_remark is null");
            return (Criteria) this;
        }

        public Criteria andVcRemarkIsNotNull() {
            addCriterion("vc_remark is not null");
            return (Criteria) this;
        }

        public Criteria andVcRemarkEqualTo(String value) {
            addCriterion("vc_remark =", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkNotEqualTo(String value) {
            addCriterion("vc_remark <>", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkGreaterThan(String value) {
            addCriterion("vc_remark >", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("vc_remark >=", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkLessThan(String value) {
            addCriterion("vc_remark <", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkLessThanOrEqualTo(String value) {
            addCriterion("vc_remark <=", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkLike(String value) {
            addCriterion("vc_remark like", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkNotLike(String value) {
            addCriterion("vc_remark not like", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkIn(List<String> values) {
            addCriterion("vc_remark in", values, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkNotIn(List<String> values) {
            addCriterion("vc_remark not in", values, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkBetween(String value1, String value2) {
            addCriterion("vc_remark between", value1, value2, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkNotBetween(String value1, String value2) {
            addCriterion("vc_remark not between", value1, value2, "vcRemark");
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
package com.fullmusic.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CurriculaVariableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CurriculaVariableExample() {
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

        public Criteria andVcTeacherIdIsNull() {
            addCriterion("vc_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdIsNotNull() {
            addCriterion("vc_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdEqualTo(String value) {
            addCriterion("vc_teacher_id =", value, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdNotEqualTo(String value) {
            addCriterion("vc_teacher_id <>", value, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdGreaterThan(String value) {
            addCriterion("vc_teacher_id >", value, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("vc_teacher_id >=", value, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdLessThan(String value) {
            addCriterion("vc_teacher_id <", value, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("vc_teacher_id <=", value, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdLike(String value) {
            addCriterion("vc_teacher_id like", value, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdNotLike(String value) {
            addCriterion("vc_teacher_id not like", value, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdIn(List<String> values) {
            addCriterion("vc_teacher_id in", values, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdNotIn(List<String> values) {
            addCriterion("vc_teacher_id not in", values, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdBetween(String value1, String value2) {
            addCriterion("vc_teacher_id between", value1, value2, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcTeacherIdNotBetween(String value1, String value2) {
            addCriterion("vc_teacher_id not between", value1, value2, "vcTeacherId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdIsNull() {
            addCriterion("vc_student_id is null");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdIsNotNull() {
            addCriterion("vc_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdEqualTo(String value) {
            addCriterion("vc_student_id =", value, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdNotEqualTo(String value) {
            addCriterion("vc_student_id <>", value, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdGreaterThan(String value) {
            addCriterion("vc_student_id >", value, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("vc_student_id >=", value, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdLessThan(String value) {
            addCriterion("vc_student_id <", value, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdLessThanOrEqualTo(String value) {
            addCriterion("vc_student_id <=", value, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdLike(String value) {
            addCriterion("vc_student_id like", value, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdNotLike(String value) {
            addCriterion("vc_student_id not like", value, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdIn(List<String> values) {
            addCriterion("vc_student_id in", values, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdNotIn(List<String> values) {
            addCriterion("vc_student_id not in", values, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdBetween(String value1, String value2) {
            addCriterion("vc_student_id between", value1, value2, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcStudentIdNotBetween(String value1, String value2) {
            addCriterion("vc_student_id not between", value1, value2, "vcStudentId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdIsNull() {
            addCriterion("vc_course_id is null");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdIsNotNull() {
            addCriterion("vc_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdEqualTo(String value) {
            addCriterion("vc_course_id =", value, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdNotEqualTo(String value) {
            addCriterion("vc_course_id <>", value, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdGreaterThan(String value) {
            addCriterion("vc_course_id >", value, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("vc_course_id >=", value, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdLessThan(String value) {
            addCriterion("vc_course_id <", value, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdLessThanOrEqualTo(String value) {
            addCriterion("vc_course_id <=", value, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdLike(String value) {
            addCriterion("vc_course_id like", value, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdNotLike(String value) {
            addCriterion("vc_course_id not like", value, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdIn(List<String> values) {
            addCriterion("vc_course_id in", values, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdNotIn(List<String> values) {
            addCriterion("vc_course_id not in", values, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdBetween(String value1, String value2) {
            addCriterion("vc_course_id between", value1, value2, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseIdNotBetween(String value1, String value2) {
            addCriterion("vc_course_id not between", value1, value2, "vcCourseId");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameIsNull() {
            addCriterion("vc_course_name is null");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameIsNotNull() {
            addCriterion("vc_course_name is not null");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameEqualTo(String value) {
            addCriterion("vc_course_name =", value, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameNotEqualTo(String value) {
            addCriterion("vc_course_name <>", value, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameGreaterThan(String value) {
            addCriterion("vc_course_name >", value, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_course_name >=", value, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameLessThan(String value) {
            addCriterion("vc_course_name <", value, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameLessThanOrEqualTo(String value) {
            addCriterion("vc_course_name <=", value, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameLike(String value) {
            addCriterion("vc_course_name like", value, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameNotLike(String value) {
            addCriterion("vc_course_name not like", value, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameIn(List<String> values) {
            addCriterion("vc_course_name in", values, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameNotIn(List<String> values) {
            addCriterion("vc_course_name not in", values, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameBetween(String value1, String value2) {
            addCriterion("vc_course_name between", value1, value2, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcCourseNameNotBetween(String value1, String value2) {
            addCriterion("vc_course_name not between", value1, value2, "vcCourseName");
            return (Criteria) this;
        }

        public Criteria andVcTypeIsNull() {
            addCriterion("vc_type is null");
            return (Criteria) this;
        }

        public Criteria andVcTypeIsNotNull() {
            addCriterion("vc_type is not null");
            return (Criteria) this;
        }

        public Criteria andVcTypeEqualTo(String value) {
            addCriterion("vc_type =", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotEqualTo(String value) {
            addCriterion("vc_type <>", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeGreaterThan(String value) {
            addCriterion("vc_type >", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vc_type >=", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeLessThan(String value) {
            addCriterion("vc_type <", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeLessThanOrEqualTo(String value) {
            addCriterion("vc_type <=", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeLike(String value) {
            addCriterion("vc_type like", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotLike(String value) {
            addCriterion("vc_type not like", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeIn(List<String> values) {
            addCriterion("vc_type in", values, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotIn(List<String> values) {
            addCriterion("vc_type not in", values, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeBetween(String value1, String value2) {
            addCriterion("vc_type between", value1, value2, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotBetween(String value1, String value2) {
            addCriterion("vc_type not between", value1, value2, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcInvalidIsNull() {
            addCriterion("vc_invalid is null");
            return (Criteria) this;
        }

        public Criteria andVcInvalidIsNotNull() {
            addCriterion("vc_invalid is not null");
            return (Criteria) this;
        }

        public Criteria andVcInvalidEqualTo(Integer value) {
            addCriterion("vc_invalid =", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidNotEqualTo(Integer value) {
            addCriterion("vc_invalid <>", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidGreaterThan(Integer value) {
            addCriterion("vc_invalid >", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_invalid >=", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidLessThan(Integer value) {
            addCriterion("vc_invalid <", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidLessThanOrEqualTo(Integer value) {
            addCriterion("vc_invalid <=", value, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidIn(List<Integer> values) {
            addCriterion("vc_invalid in", values, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidNotIn(List<Integer> values) {
            addCriterion("vc_invalid not in", values, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidBetween(Integer value1, Integer value2) {
            addCriterion("vc_invalid between", value1, value2, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcInvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_invalid not between", value1, value2, "vcInvalid");
            return (Criteria) this;
        }

        public Criteria andVcPastdueIsNull() {
            addCriterion("vc_pastDue is null");
            return (Criteria) this;
        }

        public Criteria andVcPastdueIsNotNull() {
            addCriterion("vc_pastDue is not null");
            return (Criteria) this;
        }

        public Criteria andVcPastdueEqualTo(Integer value) {
            addCriterion("vc_pastDue =", value, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcPastdueNotEqualTo(Integer value) {
            addCriterion("vc_pastDue <>", value, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcPastdueGreaterThan(Integer value) {
            addCriterion("vc_pastDue >", value, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcPastdueGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_pastDue >=", value, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcPastdueLessThan(Integer value) {
            addCriterion("vc_pastDue <", value, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcPastdueLessThanOrEqualTo(Integer value) {
            addCriterion("vc_pastDue <=", value, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcPastdueIn(List<Integer> values) {
            addCriterion("vc_pastDue in", values, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcPastdueNotIn(List<Integer> values) {
            addCriterion("vc_pastDue not in", values, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcPastdueBetween(Integer value1, Integer value2) {
            addCriterion("vc_pastDue between", value1, value2, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcPastdueNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_pastDue not between", value1, value2, "vcPastdue");
            return (Criteria) this;
        }

        public Criteria andVcSuccessIsNull() {
            addCriterion("vc_success is null");
            return (Criteria) this;
        }

        public Criteria andVcSuccessIsNotNull() {
            addCriterion("vc_success is not null");
            return (Criteria) this;
        }

        public Criteria andVcSuccessEqualTo(Integer value) {
            addCriterion("vc_success =", value, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcSuccessNotEqualTo(Integer value) {
            addCriterion("vc_success <>", value, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcSuccessGreaterThan(Integer value) {
            addCriterion("vc_success >", value, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_success >=", value, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcSuccessLessThan(Integer value) {
            addCriterion("vc_success <", value, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("vc_success <=", value, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcSuccessIn(List<Integer> values) {
            addCriterion("vc_success in", values, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcSuccessNotIn(List<Integer> values) {
            addCriterion("vc_success not in", values, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcSuccessBetween(Integer value1, Integer value2) {
            addCriterion("vc_success between", value1, value2, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_success not between", value1, value2, "vcSuccess");
            return (Criteria) this;
        }

        public Criteria andVcOrderIsNull() {
            addCriterion("vc_order is null");
            return (Criteria) this;
        }

        public Criteria andVcOrderIsNotNull() {
            addCriterion("vc_order is not null");
            return (Criteria) this;
        }

        public Criteria andVcOrderEqualTo(Integer value) {
            addCriterion("vc_order =", value, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcOrderNotEqualTo(Integer value) {
            addCriterion("vc_order <>", value, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcOrderGreaterThan(Integer value) {
            addCriterion("vc_order >", value, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_order >=", value, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcOrderLessThan(Integer value) {
            addCriterion("vc_order <", value, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcOrderLessThanOrEqualTo(Integer value) {
            addCriterion("vc_order <=", value, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcOrderIn(List<Integer> values) {
            addCriterion("vc_order in", values, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcOrderNotIn(List<Integer> values) {
            addCriterion("vc_order not in", values, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcOrderBetween(Integer value1, Integer value2) {
            addCriterion("vc_order between", value1, value2, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_order not between", value1, value2, "vcOrder");
            return (Criteria) this;
        }

        public Criteria andVcDurationIsNull() {
            addCriterion("vc_duration is null");
            return (Criteria) this;
        }

        public Criteria andVcDurationIsNotNull() {
            addCriterion("vc_duration is not null");
            return (Criteria) this;
        }

        public Criteria andVcDurationEqualTo(Integer value) {
            addCriterion("vc_duration =", value, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcDurationNotEqualTo(Integer value) {
            addCriterion("vc_duration <>", value, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcDurationGreaterThan(Integer value) {
            addCriterion("vc_duration >", value, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("vc_duration >=", value, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcDurationLessThan(Integer value) {
            addCriterion("vc_duration <", value, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcDurationLessThanOrEqualTo(Integer value) {
            addCriterion("vc_duration <=", value, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcDurationIn(List<Integer> values) {
            addCriterion("vc_duration in", values, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcDurationNotIn(List<Integer> values) {
            addCriterion("vc_duration not in", values, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcDurationBetween(Integer value1, Integer value2) {
            addCriterion("vc_duration between", value1, value2, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("vc_duration not between", value1, value2, "vcDuration");
            return (Criteria) this;
        }

        public Criteria andVcBegindateIsNull() {
            addCriterion("vc_beginDate is null");
            return (Criteria) this;
        }

        public Criteria andVcBegindateIsNotNull() {
            addCriterion("vc_beginDate is not null");
            return (Criteria) this;
        }

        public Criteria andVcBegindateEqualTo(Date value) {
            addCriterion("vc_beginDate =", value, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcBegindateNotEqualTo(Date value) {
            addCriterion("vc_beginDate <>", value, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcBegindateGreaterThan(Date value) {
            addCriterion("vc_beginDate >", value, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcBegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("vc_beginDate >=", value, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcBegindateLessThan(Date value) {
            addCriterion("vc_beginDate <", value, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcBegindateLessThanOrEqualTo(Date value) {
            addCriterion("vc_beginDate <=", value, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcBegindateIn(List<Date> values) {
            addCriterion("vc_beginDate in", values, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcBegindateNotIn(List<Date> values) {
            addCriterion("vc_beginDate not in", values, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcBegindateBetween(Date value1, Date value2) {
            addCriterion("vc_beginDate between", value1, value2, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcBegindateNotBetween(Date value1, Date value2) {
            addCriterion("vc_beginDate not between", value1, value2, "vcBegindate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateIsNull() {
            addCriterion("vc_endDate is null");
            return (Criteria) this;
        }

        public Criteria andVcEnddateIsNotNull() {
            addCriterion("vc_endDate is not null");
            return (Criteria) this;
        }

        public Criteria andVcEnddateEqualTo(Date value) {
            addCriterion("vc_endDate =", value, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateNotEqualTo(Date value) {
            addCriterion("vc_endDate <>", value, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateGreaterThan(Date value) {
            addCriterion("vc_endDate >", value, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("vc_endDate >=", value, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateLessThan(Date value) {
            addCriterion("vc_endDate <", value, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateLessThanOrEqualTo(Date value) {
            addCriterion("vc_endDate <=", value, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateIn(List<Date> values) {
            addCriterion("vc_endDate in", values, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateNotIn(List<Date> values) {
            addCriterion("vc_endDate not in", values, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateBetween(Date value1, Date value2) {
            addCriterion("vc_endDate between", value1, value2, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcEnddateNotBetween(Date value1, Date value2) {
            addCriterion("vc_endDate not between", value1, value2, "vcEnddate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateIsNull() {
            addCriterion("vc_createDate is null");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateIsNotNull() {
            addCriterion("vc_createDate is not null");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateEqualTo(Date value) {
            addCriterion("vc_createDate =", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateNotEqualTo(Date value) {
            addCriterion("vc_createDate <>", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateGreaterThan(Date value) {
            addCriterion("vc_createDate >", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("vc_createDate >=", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateLessThan(Date value) {
            addCriterion("vc_createDate <", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("vc_createDate <=", value, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateIn(List<Date> values) {
            addCriterion("vc_createDate in", values, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateNotIn(List<Date> values) {
            addCriterion("vc_createDate not in", values, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateBetween(Date value1, Date value2) {
            addCriterion("vc_createDate between", value1, value2, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("vc_createDate not between", value1, value2, "vcCreatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateIsNull() {
            addCriterion("vc_updateDate is null");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateIsNotNull() {
            addCriterion("vc_updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateEqualTo(Date value) {
            addCriterion("vc_updateDate =", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateNotEqualTo(Date value) {
            addCriterion("vc_updateDate <>", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateGreaterThan(Date value) {
            addCriterion("vc_updateDate >", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("vc_updateDate >=", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateLessThan(Date value) {
            addCriterion("vc_updateDate <", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("vc_updateDate <=", value, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateIn(List<Date> values) {
            addCriterion("vc_updateDate in", values, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateNotIn(List<Date> values) {
            addCriterion("vc_updateDate not in", values, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateBetween(Date value1, Date value2) {
            addCriterion("vc_updateDate between", value1, value2, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("vc_updateDate not between", value1, value2, "vcUpdatedate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateIsNull() {
            addCriterion("vc_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateIsNotNull() {
            addCriterion("vc_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateEqualTo(String value) {
            addCriterion("vc_evaluate =", value, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateNotEqualTo(String value) {
            addCriterion("vc_evaluate <>", value, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateGreaterThan(String value) {
            addCriterion("vc_evaluate >", value, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("vc_evaluate >=", value, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateLessThan(String value) {
            addCriterion("vc_evaluate <", value, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateLessThanOrEqualTo(String value) {
            addCriterion("vc_evaluate <=", value, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateLike(String value) {
            addCriterion("vc_evaluate like", value, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateNotLike(String value) {
            addCriterion("vc_evaluate not like", value, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateIn(List<String> values) {
            addCriterion("vc_evaluate in", values, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateNotIn(List<String> values) {
            addCriterion("vc_evaluate not in", values, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateBetween(String value1, String value2) {
            addCriterion("vc_evaluate between", value1, value2, "vcEvaluate");
            return (Criteria) this;
        }

        public Criteria andVcEvaluateNotBetween(String value1, String value2) {
            addCriterion("vc_evaluate not between", value1, value2, "vcEvaluate");
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
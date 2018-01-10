package com.huatuo.customer.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TwConsultQuestionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TwConsultQuestionCriteria() {
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andCountextIsNull() {
            addCriterion("countext is null");
            return (Criteria) this;
        }

        public Criteria andCountextIsNotNull() {
            addCriterion("countext is not null");
            return (Criteria) this;
        }

        public Criteria andCountextEqualTo(String value) {
            addCriterion("countext =", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextNotEqualTo(String value) {
            addCriterion("countext <>", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextGreaterThan(String value) {
            addCriterion("countext >", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextGreaterThanOrEqualTo(String value) {
            addCriterion("countext >=", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextLessThan(String value) {
            addCriterion("countext <", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextLessThanOrEqualTo(String value) {
            addCriterion("countext <=", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextLike(String value) {
            addCriterion("countext like", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextNotLike(String value) {
            addCriterion("countext not like", value, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextIn(List<String> values) {
            addCriterion("countext in", values, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextNotIn(List<String> values) {
            addCriterion("countext not in", values, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextBetween(String value1, String value2) {
            addCriterion("countext between", value1, value2, "countext");
            return (Criteria) this;
        }

        public Criteria andCountextNotBetween(String value1, String value2) {
            addCriterion("countext not between", value1, value2, "countext");
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

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
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

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDoctorUidIsNull() {
            addCriterion("doctor_uid is null");
            return (Criteria) this;
        }

        public Criteria andDoctorUidIsNotNull() {
            addCriterion("doctor_uid is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorUidEqualTo(Long value) {
            addCriterion("doctor_uid =", value, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorUidNotEqualTo(Long value) {
            addCriterion("doctor_uid <>", value, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorUidGreaterThan(Long value) {
            addCriterion("doctor_uid >", value, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorUidGreaterThanOrEqualTo(Long value) {
            addCriterion("doctor_uid >=", value, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorUidLessThan(Long value) {
            addCriterion("doctor_uid <", value, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorUidLessThanOrEqualTo(Long value) {
            addCriterion("doctor_uid <=", value, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorUidIn(List<Long> values) {
            addCriterion("doctor_uid in", values, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorUidNotIn(List<Long> values) {
            addCriterion("doctor_uid not in", values, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorUidBetween(Long value1, Long value2) {
            addCriterion("doctor_uid between", value1, value2, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorUidNotBetween(Long value1, Long value2) {
            addCriterion("doctor_uid not between", value1, value2, "doctorUid");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Long value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Long value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Long value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Long value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Long value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Long> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Long> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Long value1, Long value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Long value1, Long value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdIsNull() {
            addCriterion("doctor_team_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdIsNotNull() {
            addCriterion("doctor_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdEqualTo(String value) {
            addCriterion("doctor_team_id =", value, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdNotEqualTo(String value) {
            addCriterion("doctor_team_id <>", value, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdGreaterThan(String value) {
            addCriterion("doctor_team_id >", value, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_team_id >=", value, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdLessThan(String value) {
            addCriterion("doctor_team_id <", value, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_team_id <=", value, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdLike(String value) {
            addCriterion("doctor_team_id like", value, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdNotLike(String value) {
            addCriterion("doctor_team_id not like", value, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdIn(List<String> values) {
            addCriterion("doctor_team_id in", values, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdNotIn(List<String> values) {
            addCriterion("doctor_team_id not in", values, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdBetween(String value1, String value2) {
            addCriterion("doctor_team_id between", value1, value2, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdNotBetween(String value1, String value2) {
            addCriterion("doctor_team_id not between", value1, value2, "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDisIdIsNull() {
            addCriterion("dis_id is null");
            return (Criteria) this;
        }

        public Criteria andDisIdIsNotNull() {
            addCriterion("dis_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisIdEqualTo(String value) {
            addCriterion("dis_id =", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotEqualTo(String value) {
            addCriterion("dis_id <>", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdGreaterThan(String value) {
            addCriterion("dis_id >", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdGreaterThanOrEqualTo(String value) {
            addCriterion("dis_id >=", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdLessThan(String value) {
            addCriterion("dis_id <", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdLessThanOrEqualTo(String value) {
            addCriterion("dis_id <=", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdLike(String value) {
            addCriterion("dis_id like", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotLike(String value) {
            addCriterion("dis_id not like", value, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdIn(List<String> values) {
            addCriterion("dis_id in", values, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotIn(List<String> values) {
            addCriterion("dis_id not in", values, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdBetween(String value1, String value2) {
            addCriterion("dis_id between", value1, value2, "disId");
            return (Criteria) this;
        }

        public Criteria andDisIdNotBetween(String value1, String value2) {
            addCriterion("dis_id not between", value1, value2, "disId");
            return (Criteria) this;
        }

        public Criteria andDisNameIsNull() {
            addCriterion("dis_name is null");
            return (Criteria) this;
        }

        public Criteria andDisNameIsNotNull() {
            addCriterion("dis_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisNameEqualTo(String value) {
            addCriterion("dis_name =", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotEqualTo(String value) {
            addCriterion("dis_name <>", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameGreaterThan(String value) {
            addCriterion("dis_name >", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameGreaterThanOrEqualTo(String value) {
            addCriterion("dis_name >=", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLessThan(String value) {
            addCriterion("dis_name <", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLessThanOrEqualTo(String value) {
            addCriterion("dis_name <=", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameLike(String value) {
            addCriterion("dis_name like", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotLike(String value) {
            addCriterion("dis_name not like", value, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameIn(List<String> values) {
            addCriterion("dis_name in", values, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotIn(List<String> values) {
            addCriterion("dis_name not in", values, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameBetween(String value1, String value2) {
            addCriterion("dis_name between", value1, value2, "disName");
            return (Criteria) this;
        }

        public Criteria andDisNameNotBetween(String value1, String value2) {
            addCriterion("dis_name not between", value1, value2, "disName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdIsNull() {
            addCriterion("specialty_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdIsNotNull() {
            addCriterion("specialty_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdEqualTo(String value) {
            addCriterion("specialty_id =", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdNotEqualTo(String value) {
            addCriterion("specialty_id <>", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdGreaterThan(String value) {
            addCriterion("specialty_id >", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdGreaterThanOrEqualTo(String value) {
            addCriterion("specialty_id >=", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdLessThan(String value) {
            addCriterion("specialty_id <", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdLessThanOrEqualTo(String value) {
            addCriterion("specialty_id <=", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdLike(String value) {
            addCriterion("specialty_id like", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdNotLike(String value) {
            addCriterion("specialty_id not like", value, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdIn(List<String> values) {
            addCriterion("specialty_id in", values, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdNotIn(List<String> values) {
            addCriterion("specialty_id not in", values, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdBetween(String value1, String value2) {
            addCriterion("specialty_id between", value1, value2, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdNotBetween(String value1, String value2) {
            addCriterion("specialty_id not between", value1, value2, "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameIsNull() {
            addCriterion("specialty_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameIsNotNull() {
            addCriterion("specialty_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameEqualTo(String value) {
            addCriterion("specialty_name =", value, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameNotEqualTo(String value) {
            addCriterion("specialty_name <>", value, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameGreaterThan(String value) {
            addCriterion("specialty_name >", value, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameGreaterThanOrEqualTo(String value) {
            addCriterion("specialty_name >=", value, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameLessThan(String value) {
            addCriterion("specialty_name <", value, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameLessThanOrEqualTo(String value) {
            addCriterion("specialty_name <=", value, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameLike(String value) {
            addCriterion("specialty_name like", value, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameNotLike(String value) {
            addCriterion("specialty_name not like", value, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameIn(List<String> values) {
            addCriterion("specialty_name in", values, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameNotIn(List<String> values) {
            addCriterion("specialty_name not in", values, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameBetween(String value1, String value2) {
            addCriterion("specialty_name between", value1, value2, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameNotBetween(String value1, String value2) {
            addCriterion("specialty_name not between", value1, value2, "specialtyName");
            return (Criteria) this;
        }

        public Criteria andConsultStateIsNull() {
            addCriterion("consult_state is null");
            return (Criteria) this;
        }

        public Criteria andConsultStateIsNotNull() {
            addCriterion("consult_state is not null");
            return (Criteria) this;
        }

        public Criteria andConsultStateEqualTo(Integer value) {
            addCriterion("consult_state =", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateNotEqualTo(Integer value) {
            addCriterion("consult_state <>", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateGreaterThan(Integer value) {
            addCriterion("consult_state >", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("consult_state >=", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateLessThan(Integer value) {
            addCriterion("consult_state <", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateLessThanOrEqualTo(Integer value) {
            addCriterion("consult_state <=", value, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateIn(List<Integer> values) {
            addCriterion("consult_state in", values, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateNotIn(List<Integer> values) {
            addCriterion("consult_state not in", values, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateBetween(Integer value1, Integer value2) {
            addCriterion("consult_state between", value1, value2, "consultState");
            return (Criteria) this;
        }

        public Criteria andConsultStateNotBetween(Integer value1, Integer value2) {
            addCriterion("consult_state not between", value1, value2, "consultState");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("specialty is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("specialty is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(Integer value) {
            addCriterion("specialty =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(Integer value) {
            addCriterion("specialty <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(Integer value) {
            addCriterion("specialty >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialty >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(Integer value) {
            addCriterion("specialty <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(Integer value) {
            addCriterion("specialty <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<Integer> values) {
            addCriterion("specialty in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<Integer> values) {
            addCriterion("specialty not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(Integer value1, Integer value2) {
            addCriterion("specialty between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(Integer value1, Integer value2) {
            addCriterion("specialty not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNull() {
            addCriterion("is_read is null");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("is_read is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadEqualTo(Integer value) {
            addCriterion("is_read =", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotEqualTo(Integer value) {
            addCriterion("is_read <>", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThan(Integer value) {
            addCriterion("is_read >", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_read >=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThan(Integer value) {
            addCriterion("is_read <", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThanOrEqualTo(Integer value) {
            addCriterion("is_read <=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadIn(List<Integer> values) {
            addCriterion("is_read in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotIn(List<Integer> values) {
            addCriterion("is_read not in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadBetween(Integer value1, Integer value2) {
            addCriterion("is_read between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotBetween(Integer value1, Integer value2) {
            addCriterion("is_read not between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andCountextLikeInsensitive(String value) {
            addCriterion("upper(countext) like", value.toUpperCase(), "countext");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLikeInsensitive(String value) {
            addCriterion("upper(create_time) like", value.toUpperCase(), "createTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLikeInsensitive(String value) {
            addCriterion("upper(start_time) like", value.toUpperCase(), "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLikeInsensitive(String value) {
            addCriterion("upper(end_time) like", value.toUpperCase(), "endTime");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdLikeInsensitive(String value) {
            addCriterion("upper(doctor_team_id) like", value.toUpperCase(), "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andDisIdLikeInsensitive(String value) {
            addCriterion("upper(dis_id) like", value.toUpperCase(), "disId");
            return (Criteria) this;
        }

        public Criteria andDisNameLikeInsensitive(String value) {
            addCriterion("upper(dis_name) like", value.toUpperCase(), "disName");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIdLikeInsensitive(String value) {
            addCriterion("upper(specialty_id) like", value.toUpperCase(), "specialtyId");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNameLikeInsensitive(String value) {
            addCriterion("upper(specialty_name) like", value.toUpperCase(), "specialtyName");
            return (Criteria) this;
        }

        public Criteria andOrderNoLikeInsensitive(String value) {
            addCriterion("upper(order_no) like", value.toUpperCase(), "orderNo");
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
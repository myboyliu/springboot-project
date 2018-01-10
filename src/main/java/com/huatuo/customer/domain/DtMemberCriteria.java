package com.huatuo.customer.domain;

import java.util.ArrayList;
import java.util.List;

public class DtMemberCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtMemberCriteria() {
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

        public Criteria andDtMemberIdIsNull() {
            addCriterion("dt_member_id is null");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdIsNotNull() {
            addCriterion("dt_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdEqualTo(String value) {
            addCriterion("dt_member_id =", value, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdNotEqualTo(String value) {
            addCriterion("dt_member_id <>", value, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdGreaterThan(String value) {
            addCriterion("dt_member_id >", value, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("dt_member_id >=", value, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdLessThan(String value) {
            addCriterion("dt_member_id <", value, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdLessThanOrEqualTo(String value) {
            addCriterion("dt_member_id <=", value, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdLike(String value) {
            addCriterion("dt_member_id like", value, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdNotLike(String value) {
            addCriterion("dt_member_id not like", value, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdIn(List<String> values) {
            addCriterion("dt_member_id in", values, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdNotIn(List<String> values) {
            addCriterion("dt_member_id not in", values, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdBetween(String value1, String value2) {
            addCriterion("dt_member_id between", value1, value2, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdNotBetween(String value1, String value2) {
            addCriterion("dt_member_id not between", value1, value2, "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdIsNull() {
            addCriterion("dt_team_id is null");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdIsNotNull() {
            addCriterion("dt_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdEqualTo(String value) {
            addCriterion("dt_team_id =", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdNotEqualTo(String value) {
            addCriterion("dt_team_id <>", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdGreaterThan(String value) {
            addCriterion("dt_team_id >", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("dt_team_id >=", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdLessThan(String value) {
            addCriterion("dt_team_id <", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdLessThanOrEqualTo(String value) {
            addCriterion("dt_team_id <=", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdLike(String value) {
            addCriterion("dt_team_id like", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdNotLike(String value) {
            addCriterion("dt_team_id not like", value, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdIn(List<String> values) {
            addCriterion("dt_team_id in", values, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdNotIn(List<String> values) {
            addCriterion("dt_team_id not in", values, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdBetween(String value1, String value2) {
            addCriterion("dt_team_id between", value1, value2, "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdNotBetween(String value1, String value2) {
            addCriterion("dt_team_id not between", value1, value2, "dtTeamId");
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

        public Criteria andDoctorIdEqualTo(String value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(String value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(String value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(String value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLike(String value) {
            addCriterion("doctor_id like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotLike(String value) {
            addCriterion("doctor_id not like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<String> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<String> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(String value1, String value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(String value1, String value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNull() {
            addCriterion("del_flg is null");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNotNull() {
            addCriterion("del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlgEqualTo(Integer value) {
            addCriterion("del_flg =", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotEqualTo(Integer value) {
            addCriterion("del_flg <>", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThan(Integer value) {
            addCriterion("del_flg >", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flg >=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThan(Integer value) {
            addCriterion("del_flg <", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThanOrEqualTo(Integer value) {
            addCriterion("del_flg <=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgIn(List<Integer> values) {
            addCriterion("del_flg in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotIn(List<Integer> values) {
            addCriterion("del_flg not in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgBetween(Integer value1, Integer value2) {
            addCriterion("del_flg between", value1, value2, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flg not between", value1, value2, "delFlg");
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

        public Criteria andSyncTimeIsNull() {
            addCriterion("sync_time is null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIsNotNull() {
            addCriterion("sync_time is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTimeEqualTo(String value) {
            addCriterion("sync_time =", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotEqualTo(String value) {
            addCriterion("sync_time <>", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThan(String value) {
            addCriterion("sync_time >", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sync_time >=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThan(String value) {
            addCriterion("sync_time <", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLessThanOrEqualTo(String value) {
            addCriterion("sync_time <=", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLike(String value) {
            addCriterion("sync_time like", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotLike(String value) {
            addCriterion("sync_time not like", value, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeIn(List<String> values) {
            addCriterion("sync_time in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotIn(List<String> values) {
            addCriterion("sync_time not in", values, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeBetween(String value1, String value2) {
            addCriterion("sync_time between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeNotBetween(String value1, String value2) {
            addCriterion("sync_time not between", value1, value2, "syncTime");
            return (Criteria) this;
        }

        public Criteria andDtMemberIdLikeInsensitive(String value) {
            addCriterion("upper(dt_member_id) like", value.toUpperCase(), "dtMemberId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdLikeInsensitive(String value) {
            addCriterion("upper(dt_team_id) like", value.toUpperCase(), "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLikeInsensitive(String value) {
            addCriterion("upper(doctor_id) like", value.toUpperCase(), "doctorId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLikeInsensitive(String value) {
            addCriterion("upper(create_time) like", value.toUpperCase(), "createTime");
            return (Criteria) this;
        }

        public Criteria andSyncTimeLikeInsensitive(String value) {
            addCriterion("upper(sync_time) like", value.toUpperCase(), "syncTime");
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
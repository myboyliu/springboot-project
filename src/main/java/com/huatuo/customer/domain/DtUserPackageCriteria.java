package com.huatuo.customer.domain;

import java.util.ArrayList;
import java.util.List;

public class DtUserPackageCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtUserPackageCriteria() {
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

        public Criteria andUserPackageIdIsNull() {
            addCriterion("user_Package_id is null");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdIsNotNull() {
            addCriterion("user_Package_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdEqualTo(String value) {
            addCriterion("user_Package_id =", value, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdNotEqualTo(String value) {
            addCriterion("user_Package_id <>", value, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdGreaterThan(String value) {
            addCriterion("user_Package_id >", value, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_Package_id >=", value, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdLessThan(String value) {
            addCriterion("user_Package_id <", value, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdLessThanOrEqualTo(String value) {
            addCriterion("user_Package_id <=", value, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdLike(String value) {
            addCriterion("user_Package_id like", value, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdNotLike(String value) {
            addCriterion("user_Package_id not like", value, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdIn(List<String> values) {
            addCriterion("user_Package_id in", values, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdNotIn(List<String> values) {
            addCriterion("user_Package_id not in", values, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdBetween(String value1, String value2) {
            addCriterion("user_Package_id between", value1, value2, "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserPackageIdNotBetween(String value1, String value2) {
            addCriterion("user_Package_id not between", value1, value2, "userPackageId");
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

        public Criteria andTeamPackageIdIsNull() {
            addCriterion("team_package_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdIsNotNull() {
            addCriterion("team_package_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdEqualTo(String value) {
            addCriterion("team_package_id =", value, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdNotEqualTo(String value) {
            addCriterion("team_package_id <>", value, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdGreaterThan(String value) {
            addCriterion("team_package_id >", value, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdGreaterThanOrEqualTo(String value) {
            addCriterion("team_package_id >=", value, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdLessThan(String value) {
            addCriterion("team_package_id <", value, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdLessThanOrEqualTo(String value) {
            addCriterion("team_package_id <=", value, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdLike(String value) {
            addCriterion("team_package_id like", value, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdNotLike(String value) {
            addCriterion("team_package_id not like", value, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdIn(List<String> values) {
            addCriterion("team_package_id in", values, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdNotIn(List<String> values) {
            addCriterion("team_package_id not in", values, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdBetween(String value1, String value2) {
            addCriterion("team_package_id between", value1, value2, "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdNotBetween(String value1, String value2) {
            addCriterion("team_package_id not between", value1, value2, "teamPackageId");
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

        public Criteria andBuyTimeIsNull() {
            addCriterion("buy_time is null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIsNotNull() {
            addCriterion("buy_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTimeEqualTo(String value) {
            addCriterion("buy_time =", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotEqualTo(String value) {
            addCriterion("buy_time <>", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThan(String value) {
            addCriterion("buy_time >", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("buy_time >=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThan(String value) {
            addCriterion("buy_time <", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLessThanOrEqualTo(String value) {
            addCriterion("buy_time <=", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLike(String value) {
            addCriterion("buy_time like", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotLike(String value) {
            addCriterion("buy_time not like", value, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeIn(List<String> values) {
            addCriterion("buy_time in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotIn(List<String> values) {
            addCriterion("buy_time not in", values, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeBetween(String value1, String value2) {
            addCriterion("buy_time between", value1, value2, "buyTime");
            return (Criteria) this;
        }

        public Criteria andBuyTimeNotBetween(String value1, String value2) {
            addCriterion("buy_time not between", value1, value2, "buyTime");
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

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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

        public Criteria andUserPackageIdLikeInsensitive(String value) {
            addCriterion("upper(user_Package_id) like", value.toUpperCase(), "userPackageId");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(user_id) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdLikeInsensitive(String value) {
            addCriterion("upper(team_package_id) like", value.toUpperCase(), "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdLikeInsensitive(String value) {
            addCriterion("upper(doctor_team_id) like", value.toUpperCase(), "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andBuyTimeLikeInsensitive(String value) {
            addCriterion("upper(buy_time) like", value.toUpperCase(), "buyTime");
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
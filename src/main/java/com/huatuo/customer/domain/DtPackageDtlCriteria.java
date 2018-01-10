package com.huatuo.customer.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DtPackageDtlCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtPackageDtlCriteria() {
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

        public Criteria andTeamPackageDtlIdIsNull() {
            addCriterion("team_package_dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdIsNotNull() {
            addCriterion("team_package_dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdEqualTo(String value) {
            addCriterion("team_package_dtl_id =", value, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdNotEqualTo(String value) {
            addCriterion("team_package_dtl_id <>", value, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdGreaterThan(String value) {
            addCriterion("team_package_dtl_id >", value, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdGreaterThanOrEqualTo(String value) {
            addCriterion("team_package_dtl_id >=", value, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdLessThan(String value) {
            addCriterion("team_package_dtl_id <", value, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdLessThanOrEqualTo(String value) {
            addCriterion("team_package_dtl_id <=", value, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdLike(String value) {
            addCriterion("team_package_dtl_id like", value, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdNotLike(String value) {
            addCriterion("team_package_dtl_id not like", value, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdIn(List<String> values) {
            addCriterion("team_package_dtl_id in", values, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdNotIn(List<String> values) {
            addCriterion("team_package_dtl_id not in", values, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdBetween(String value1, String value2) {
            addCriterion("team_package_dtl_id between", value1, value2, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlIdNotBetween(String value1, String value2) {
            addCriterion("team_package_dtl_id not between", value1, value2, "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("service_id like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("service_id not like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeIsNull() {
            addCriterion("team_package_dtl_charge is null");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeIsNotNull() {
            addCriterion("team_package_dtl_charge is not null");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeEqualTo(BigDecimal value) {
            addCriterion("team_package_dtl_charge =", value, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeNotEqualTo(BigDecimal value) {
            addCriterion("team_package_dtl_charge <>", value, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeGreaterThan(BigDecimal value) {
            addCriterion("team_package_dtl_charge >", value, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("team_package_dtl_charge >=", value, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeLessThan(BigDecimal value) {
            addCriterion("team_package_dtl_charge <", value, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("team_package_dtl_charge <=", value, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeIn(List<BigDecimal> values) {
            addCriterion("team_package_dtl_charge in", values, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeNotIn(List<BigDecimal> values) {
            addCriterion("team_package_dtl_charge not in", values, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_package_dtl_charge between", value1, value2, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andTeamPackageDtlChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("team_package_dtl_charge not between", value1, value2, "teamPackageDtlCharge");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andTeamPackageDtlIdLikeInsensitive(String value) {
            addCriterion("upper(team_package_dtl_id) like", value.toUpperCase(), "teamPackageDtlId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLikeInsensitive(String value) {
            addCriterion("upper(service_id) like", value.toUpperCase(), "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceNameLikeInsensitive(String value) {
            addCriterion("upper(service_name) like", value.toUpperCase(), "serviceName");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andTeamPackageIdLikeInsensitive(String value) {
            addCriterion("upper(team_package_id) like", value.toUpperCase(), "teamPackageId");
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
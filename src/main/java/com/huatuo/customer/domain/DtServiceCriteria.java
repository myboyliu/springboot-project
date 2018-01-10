package com.huatuo.customer.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DtServiceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtServiceCriteria() {
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

        public Criteria andServiceUnitIsNull() {
            addCriterion("service_unit is null");
            return (Criteria) this;
        }

        public Criteria andServiceUnitIsNotNull() {
            addCriterion("service_unit is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUnitEqualTo(String value) {
            addCriterion("service_unit =", value, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitNotEqualTo(String value) {
            addCriterion("service_unit <>", value, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitGreaterThan(String value) {
            addCriterion("service_unit >", value, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitGreaterThanOrEqualTo(String value) {
            addCriterion("service_unit >=", value, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitLessThan(String value) {
            addCriterion("service_unit <", value, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitLessThanOrEqualTo(String value) {
            addCriterion("service_unit <=", value, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitLike(String value) {
            addCriterion("service_unit like", value, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitNotLike(String value) {
            addCriterion("service_unit not like", value, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitIn(List<String> values) {
            addCriterion("service_unit in", values, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitNotIn(List<String> values) {
            addCriterion("service_unit not in", values, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitBetween(String value1, String value2) {
            addCriterion("service_unit between", value1, value2, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceUnitNotBetween(String value1, String value2) {
            addCriterion("service_unit not between", value1, value2, "serviceUnit");
            return (Criteria) this;
        }

        public Criteria andServiceChargingIsNull() {
            addCriterion("service_charging is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargingIsNotNull() {
            addCriterion("service_charging is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargingEqualTo(Integer value) {
            addCriterion("service_charging =", value, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andServiceChargingNotEqualTo(Integer value) {
            addCriterion("service_charging <>", value, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andServiceChargingGreaterThan(Integer value) {
            addCriterion("service_charging >", value, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andServiceChargingGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_charging >=", value, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andServiceChargingLessThan(Integer value) {
            addCriterion("service_charging <", value, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andServiceChargingLessThanOrEqualTo(Integer value) {
            addCriterion("service_charging <=", value, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andServiceChargingIn(List<Integer> values) {
            addCriterion("service_charging in", values, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andServiceChargingNotIn(List<Integer> values) {
            addCriterion("service_charging not in", values, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andServiceChargingBetween(Integer value1, Integer value2) {
            addCriterion("service_charging between", value1, value2, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andServiceChargingNotBetween(Integer value1, Integer value2) {
            addCriterion("service_charging not between", value1, value2, "serviceCharging");
            return (Criteria) this;
        }

        public Criteria andChargingTypeIsNull() {
            addCriterion("charging_type is null");
            return (Criteria) this;
        }

        public Criteria andChargingTypeIsNotNull() {
            addCriterion("charging_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargingTypeEqualTo(Integer value) {
            addCriterion("charging_type =", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeNotEqualTo(Integer value) {
            addCriterion("charging_type <>", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeGreaterThan(Integer value) {
            addCriterion("charging_type >", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charging_type >=", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeLessThan(Integer value) {
            addCriterion("charging_type <", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeLessThanOrEqualTo(Integer value) {
            addCriterion("charging_type <=", value, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeIn(List<Integer> values) {
            addCriterion("charging_type in", values, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeNotIn(List<Integer> values) {
            addCriterion("charging_type not in", values, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeBetween(Integer value1, Integer value2) {
            addCriterion("charging_type between", value1, value2, "chargingType");
            return (Criteria) this;
        }

        public Criteria andChargingTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("charging_type not between", value1, value2, "chargingType");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIsNull() {
            addCriterion("guide_price is null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIsNotNull() {
            addCriterion("guide_price is not null");
            return (Criteria) this;
        }

        public Criteria andGuidePriceEqualTo(BigDecimal value) {
            addCriterion("guide_price =", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotEqualTo(BigDecimal value) {
            addCriterion("guide_price <>", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThan(BigDecimal value) {
            addCriterion("guide_price >", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("guide_price >=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThan(BigDecimal value) {
            addCriterion("guide_price <", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("guide_price <=", value, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceIn(List<BigDecimal> values) {
            addCriterion("guide_price in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotIn(List<BigDecimal> values) {
            addCriterion("guide_price not in", values, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guide_price between", value1, value2, "guidePrice");
            return (Criteria) this;
        }

        public Criteria andGuidePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("guide_price not between", value1, value2, "guidePrice");
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

        public Criteria andServiceIdLikeInsensitive(String value) {
            addCriterion("upper(service_id) like", value.toUpperCase(), "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceNameLikeInsensitive(String value) {
            addCriterion("upper(service_name) like", value.toUpperCase(), "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceUnitLikeInsensitive(String value) {
            addCriterion("upper(service_unit) like", value.toUpperCase(), "serviceUnit");
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
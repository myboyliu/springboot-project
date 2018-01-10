package com.huatuo.customer.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DtRegionServiceCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtRegionServiceCriteria() {
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

        public Criteria andRegionServiceIdIsNull() {
            addCriterion("region_service_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdIsNotNull() {
            addCriterion("region_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdEqualTo(String value) {
            addCriterion("region_service_id =", value, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdNotEqualTo(String value) {
            addCriterion("region_service_id <>", value, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdGreaterThan(String value) {
            addCriterion("region_service_id >", value, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("region_service_id >=", value, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdLessThan(String value) {
            addCriterion("region_service_id <", value, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdLessThanOrEqualTo(String value) {
            addCriterion("region_service_id <=", value, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdLike(String value) {
            addCriterion("region_service_id like", value, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdNotLike(String value) {
            addCriterion("region_service_id not like", value, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdIn(List<String> values) {
            addCriterion("region_service_id in", values, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdNotIn(List<String> values) {
            addCriterion("region_service_id not in", values, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdBetween(String value1, String value2) {
            addCriterion("region_service_id between", value1, value2, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionServiceIdNotBetween(String value1, String value2) {
            addCriterion("region_service_id not between", value1, value2, "regionServiceId");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(Integer value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(Integer value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(Integer value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(Integer value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(Integer value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(Integer value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<Integer> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<Integer> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(Integer value1, Integer value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(Integer value1, Integer value2) {
            addCriterion("region not between", value1, value2, "region");
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

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceIsNull() {
            addCriterion("gregion_uide_price is null");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceIsNotNull() {
            addCriterion("gregion_uide_price is not null");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceEqualTo(BigDecimal value) {
            addCriterion("gregion_uide_price =", value, "gregionUidePrice");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceNotEqualTo(BigDecimal value) {
            addCriterion("gregion_uide_price <>", value, "gregionUidePrice");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceGreaterThan(BigDecimal value) {
            addCriterion("gregion_uide_price >", value, "gregionUidePrice");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gregion_uide_price >=", value, "gregionUidePrice");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceLessThan(BigDecimal value) {
            addCriterion("gregion_uide_price <", value, "gregionUidePrice");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gregion_uide_price <=", value, "gregionUidePrice");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceIn(List<BigDecimal> values) {
            addCriterion("gregion_uide_price in", values, "gregionUidePrice");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceNotIn(List<BigDecimal> values) {
            addCriterion("gregion_uide_price not in", values, "gregionUidePrice");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gregion_uide_price between", value1, value2, "gregionUidePrice");
            return (Criteria) this;
        }

        public Criteria andGregionUidePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gregion_uide_price not between", value1, value2, "gregionUidePrice");
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

        public Criteria andRegionServiceIdLikeInsensitive(String value) {
            addCriterion("upper(region_service_id) like", value.toUpperCase(), "regionServiceId");
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
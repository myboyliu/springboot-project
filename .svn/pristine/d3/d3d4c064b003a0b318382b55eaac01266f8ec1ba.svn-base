package com.huatuo.customer.domain;

import java.util.ArrayList;
import java.util.List;

public class DtTypeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtTypeCriteria() {
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

        public Criteria andDtTypeIdIsNull() {
            addCriterion("dt_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdIsNotNull() {
            addCriterion("dt_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdEqualTo(String value) {
            addCriterion("dt_type_id =", value, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdNotEqualTo(String value) {
            addCriterion("dt_type_id <>", value, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdGreaterThan(String value) {
            addCriterion("dt_type_id >", value, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("dt_type_id >=", value, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdLessThan(String value) {
            addCriterion("dt_type_id <", value, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdLessThanOrEqualTo(String value) {
            addCriterion("dt_type_id <=", value, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdLike(String value) {
            addCriterion("dt_type_id like", value, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdNotLike(String value) {
            addCriterion("dt_type_id not like", value, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdIn(List<String> values) {
            addCriterion("dt_type_id in", values, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdNotIn(List<String> values) {
            addCriterion("dt_type_id not in", values, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdBetween(String value1, String value2) {
            addCriterion("dt_type_id between", value1, value2, "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTypeIdNotBetween(String value1, String value2) {
            addCriterion("dt_type_id not between", value1, value2, "dtTypeId");
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

        public Criteria andServiceAddressIdIsNull() {
            addCriterion("service_address_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdIsNotNull() {
            addCriterion("service_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdEqualTo(String value) {
            addCriterion("service_address_id =", value, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdNotEqualTo(String value) {
            addCriterion("service_address_id <>", value, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdGreaterThan(String value) {
            addCriterion("service_address_id >", value, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_address_id >=", value, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdLessThan(String value) {
            addCriterion("service_address_id <", value, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdLessThanOrEqualTo(String value) {
            addCriterion("service_address_id <=", value, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdLike(String value) {
            addCriterion("service_address_id like", value, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdNotLike(String value) {
            addCriterion("service_address_id not like", value, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdIn(List<String> values) {
            addCriterion("service_address_id in", values, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdNotIn(List<String> values) {
            addCriterion("service_address_id not in", values, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdBetween(String value1, String value2) {
            addCriterion("service_address_id between", value1, value2, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdNotBetween(String value1, String value2) {
            addCriterion("service_address_id not between", value1, value2, "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameIsNull() {
            addCriterion("service_address_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameIsNotNull() {
            addCriterion("service_address_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameEqualTo(String value) {
            addCriterion("service_address_name =", value, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameNotEqualTo(String value) {
            addCriterion("service_address_name <>", value, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameGreaterThan(String value) {
            addCriterion("service_address_name >", value, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_address_name >=", value, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameLessThan(String value) {
            addCriterion("service_address_name <", value, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameLessThanOrEqualTo(String value) {
            addCriterion("service_address_name <=", value, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameLike(String value) {
            addCriterion("service_address_name like", value, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameNotLike(String value) {
            addCriterion("service_address_name not like", value, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameIn(List<String> values) {
            addCriterion("service_address_name in", values, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameNotIn(List<String> values) {
            addCriterion("service_address_name not in", values, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameBetween(String value1, String value2) {
            addCriterion("service_address_name between", value1, value2, "serviceAddressName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameNotBetween(String value1, String value2) {
            addCriterion("service_address_name not between", value1, value2, "serviceAddressName");
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

        public Criteria andDtTypeIdLikeInsensitive(String value) {
            addCriterion("upper(dt_type_id) like", value.toUpperCase(), "dtTypeId");
            return (Criteria) this;
        }

        public Criteria andDtTeamIdLikeInsensitive(String value) {
            addCriterion("upper(dt_team_id) like", value.toUpperCase(), "dtTeamId");
            return (Criteria) this;
        }

        public Criteria andServiceAddressIdLikeInsensitive(String value) {
            addCriterion("upper(service_address_id) like", value.toUpperCase(), "serviceAddressId");
            return (Criteria) this;
        }

        public Criteria andTypeNameLikeInsensitive(String value) {
            addCriterion("upper(type_name) like", value.toUpperCase(), "typeName");
            return (Criteria) this;
        }

        public Criteria andServiceAddressNameLikeInsensitive(String value) {
            addCriterion("upper(service_address_name) like", value.toUpperCase(), "serviceAddressName");
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
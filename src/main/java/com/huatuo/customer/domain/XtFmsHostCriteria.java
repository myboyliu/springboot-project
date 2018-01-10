package com.huatuo.customer.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class XtFmsHostCriteria implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XtFmsHostCriteria() {
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

        public Criteria andHostIdIsNull() {
            addCriterion("host_id is null");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNotNull() {
            addCriterion("host_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostIdEqualTo(Integer value) {
            addCriterion("host_id =", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotEqualTo(Integer value) {
            addCriterion("host_id <>", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThan(Integer value) {
            addCriterion("host_id >", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_id >=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThan(Integer value) {
            addCriterion("host_id <", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThanOrEqualTo(Integer value) {
            addCriterion("host_id <=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdIn(List<Integer> values) {
            addCriterion("host_id in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotIn(List<Integer> values) {
            addCriterion("host_id not in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdBetween(Integer value1, Integer value2) {
            addCriterion("host_id between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("host_id not between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostDomainIsNull() {
            addCriterion("host_domain is null");
            return (Criteria) this;
        }

        public Criteria andHostDomainIsNotNull() {
            addCriterion("host_domain is not null");
            return (Criteria) this;
        }

        public Criteria andHostDomainEqualTo(String value) {
            addCriterion("host_domain =", value, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainNotEqualTo(String value) {
            addCriterion("host_domain <>", value, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainGreaterThan(String value) {
            addCriterion("host_domain >", value, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainGreaterThanOrEqualTo(String value) {
            addCriterion("host_domain >=", value, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainLessThan(String value) {
            addCriterion("host_domain <", value, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainLessThanOrEqualTo(String value) {
            addCriterion("host_domain <=", value, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainLike(String value) {
            addCriterion("host_domain like", value, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainNotLike(String value) {
            addCriterion("host_domain not like", value, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainIn(List<String> values) {
            addCriterion("host_domain in", values, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainNotIn(List<String> values) {
            addCriterion("host_domain not in", values, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainBetween(String value1, String value2) {
            addCriterion("host_domain between", value1, value2, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostDomainNotBetween(String value1, String value2) {
            addCriterion("host_domain not between", value1, value2, "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNull() {
            addCriterion("host_ip is null");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNotNull() {
            addCriterion("host_ip is not null");
            return (Criteria) this;
        }

        public Criteria andHostIpEqualTo(String value) {
            addCriterion("host_ip =", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotEqualTo(String value) {
            addCriterion("host_ip <>", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThan(String value) {
            addCriterion("host_ip >", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThanOrEqualTo(String value) {
            addCriterion("host_ip >=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThan(String value) {
            addCriterion("host_ip <", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThanOrEqualTo(String value) {
            addCriterion("host_ip <=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLike(String value) {
            addCriterion("host_ip like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotLike(String value) {
            addCriterion("host_ip not like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpIn(List<String> values) {
            addCriterion("host_ip in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotIn(List<String> values) {
            addCriterion("host_ip not in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpBetween(String value1, String value2) {
            addCriterion("host_ip between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotBetween(String value1, String value2) {
            addCriterion("host_ip not between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostVersionIsNull() {
            addCriterion("host_version is null");
            return (Criteria) this;
        }

        public Criteria andHostVersionIsNotNull() {
            addCriterion("host_version is not null");
            return (Criteria) this;
        }

        public Criteria andHostVersionEqualTo(String value) {
            addCriterion("host_version =", value, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionNotEqualTo(String value) {
            addCriterion("host_version <>", value, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionGreaterThan(String value) {
            addCriterion("host_version >", value, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionGreaterThanOrEqualTo(String value) {
            addCriterion("host_version >=", value, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionLessThan(String value) {
            addCriterion("host_version <", value, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionLessThanOrEqualTo(String value) {
            addCriterion("host_version <=", value, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionLike(String value) {
            addCriterion("host_version like", value, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionNotLike(String value) {
            addCriterion("host_version not like", value, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionIn(List<String> values) {
            addCriterion("host_version in", values, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionNotIn(List<String> values) {
            addCriterion("host_version not in", values, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionBetween(String value1, String value2) {
            addCriterion("host_version between", value1, value2, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostVersionNotBetween(String value1, String value2) {
            addCriterion("host_version not between", value1, value2, "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountIsNull() {
            addCriterion("host_online_count is null");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountIsNotNull() {
            addCriterion("host_online_count is not null");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountEqualTo(Integer value) {
            addCriterion("host_online_count =", value, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountNotEqualTo(Integer value) {
            addCriterion("host_online_count <>", value, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountGreaterThan(Integer value) {
            addCriterion("host_online_count >", value, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_online_count >=", value, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountLessThan(Integer value) {
            addCriterion("host_online_count <", value, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountLessThanOrEqualTo(Integer value) {
            addCriterion("host_online_count <=", value, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountIn(List<Integer> values) {
            addCriterion("host_online_count in", values, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountNotIn(List<Integer> values) {
            addCriterion("host_online_count not in", values, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountBetween(Integer value1, Integer value2) {
            addCriterion("host_online_count between", value1, value2, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostOnlineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("host_online_count not between", value1, value2, "hostOnlineCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountIsNull() {
            addCriterion("host_max_count is null");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountIsNotNull() {
            addCriterion("host_max_count is not null");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountEqualTo(Integer value) {
            addCriterion("host_max_count =", value, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountNotEqualTo(Integer value) {
            addCriterion("host_max_count <>", value, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountGreaterThan(Integer value) {
            addCriterion("host_max_count >", value, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_max_count >=", value, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountLessThan(Integer value) {
            addCriterion("host_max_count <", value, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountLessThanOrEqualTo(Integer value) {
            addCriterion("host_max_count <=", value, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountIn(List<Integer> values) {
            addCriterion("host_max_count in", values, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountNotIn(List<Integer> values) {
            addCriterion("host_max_count not in", values, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountBetween(Integer value1, Integer value2) {
            addCriterion("host_max_count between", value1, value2, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostMaxCountNotBetween(Integer value1, Integer value2) {
            addCriterion("host_max_count not between", value1, value2, "hostMaxCount");
            return (Criteria) this;
        }

        public Criteria andHostStatusIsNull() {
            addCriterion("host_status is null");
            return (Criteria) this;
        }

        public Criteria andHostStatusIsNotNull() {
            addCriterion("host_status is not null");
            return (Criteria) this;
        }

        public Criteria andHostStatusEqualTo(String value) {
            addCriterion("host_status =", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotEqualTo(String value) {
            addCriterion("host_status <>", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusGreaterThan(String value) {
            addCriterion("host_status >", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusGreaterThanOrEqualTo(String value) {
            addCriterion("host_status >=", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusLessThan(String value) {
            addCriterion("host_status <", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusLessThanOrEqualTo(String value) {
            addCriterion("host_status <=", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusLike(String value) {
            addCriterion("host_status like", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotLike(String value) {
            addCriterion("host_status not like", value, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusIn(List<String> values) {
            addCriterion("host_status in", values, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotIn(List<String> values) {
            addCriterion("host_status not in", values, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusBetween(String value1, String value2) {
            addCriterion("host_status between", value1, value2, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostStatusNotBetween(String value1, String value2) {
            addCriterion("host_status not between", value1, value2, "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeIsNull() {
            addCriterion("host_create_time is null");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeIsNotNull() {
            addCriterion("host_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeEqualTo(String value) {
            addCriterion("host_create_time =", value, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeNotEqualTo(String value) {
            addCriterion("host_create_time <>", value, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeGreaterThan(String value) {
            addCriterion("host_create_time >", value, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("host_create_time >=", value, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeLessThan(String value) {
            addCriterion("host_create_time <", value, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("host_create_time <=", value, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeLike(String value) {
            addCriterion("host_create_time like", value, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeNotLike(String value) {
            addCriterion("host_create_time not like", value, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeIn(List<String> values) {
            addCriterion("host_create_time in", values, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeNotIn(List<String> values) {
            addCriterion("host_create_time not in", values, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeBetween(String value1, String value2) {
            addCriterion("host_create_time between", value1, value2, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeNotBetween(String value1, String value2) {
            addCriterion("host_create_time not between", value1, value2, "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeIsNull() {
            addCriterion("host_update_time is null");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeIsNotNull() {
            addCriterion("host_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeEqualTo(String value) {
            addCriterion("host_update_time =", value, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeNotEqualTo(String value) {
            addCriterion("host_update_time <>", value, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeGreaterThan(String value) {
            addCriterion("host_update_time >", value, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("host_update_time >=", value, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeLessThan(String value) {
            addCriterion("host_update_time <", value, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("host_update_time <=", value, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeLike(String value) {
            addCriterion("host_update_time like", value, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeNotLike(String value) {
            addCriterion("host_update_time not like", value, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeIn(List<String> values) {
            addCriterion("host_update_time in", values, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeNotIn(List<String> values) {
            addCriterion("host_update_time not in", values, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeBetween(String value1, String value2) {
            addCriterion("host_update_time between", value1, value2, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("host_update_time not between", value1, value2, "hostUpdateTime");
            return (Criteria) this;
        }

        public Criteria andHostDomainLikeInsensitive(String value) {
            addCriterion("upper(host_domain) like", value.toUpperCase(), "hostDomain");
            return (Criteria) this;
        }

        public Criteria andHostIpLikeInsensitive(String value) {
            addCriterion("upper(host_ip) like", value.toUpperCase(), "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostVersionLikeInsensitive(String value) {
            addCriterion("upper(host_version) like", value.toUpperCase(), "hostVersion");
            return (Criteria) this;
        }

        public Criteria andHostStatusLikeInsensitive(String value) {
            addCriterion("upper(host_status) like", value.toUpperCase(), "hostStatus");
            return (Criteria) this;
        }

        public Criteria andHostCreateTimeLikeInsensitive(String value) {
            addCriterion("upper(host_create_time) like", value.toUpperCase(), "hostCreateTime");
            return (Criteria) this;
        }

        public Criteria andHostUpdateTimeLikeInsensitive(String value) {
            addCriterion("upper(host_update_time) like", value.toUpperCase(), "hostUpdateTime");
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
package com.huatuo.customer.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DtPackageCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtPackageCriteria() {
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

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
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

        public Criteria andPackageTypeIsNull() {
            addCriterion("package_type is null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNotNull() {
            addCriterion("package_type is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeEqualTo(Integer value) {
            addCriterion("package_type =", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotEqualTo(Integer value) {
            addCriterion("package_type <>", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThan(Integer value) {
            addCriterion("package_type >", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_type >=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThan(Integer value) {
            addCriterion("package_type <", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("package_type <=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIn(List<Integer> values) {
            addCriterion("package_type in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotIn(List<Integer> values) {
            addCriterion("package_type not in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeBetween(Integer value1, Integer value2) {
            addCriterion("package_type between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("package_type not between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNull() {
            addCriterion("package_price is null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNotNull() {
            addCriterion("package_price is not null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceEqualTo(BigDecimal value) {
            addCriterion("package_price =", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotEqualTo(BigDecimal value) {
            addCriterion("package_price <>", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThan(BigDecimal value) {
            addCriterion("package_price >", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("package_price >=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThan(BigDecimal value) {
            addCriterion("package_price <", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("package_price <=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIn(List<BigDecimal> values) {
            addCriterion("package_price in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotIn(List<BigDecimal> values) {
            addCriterion("package_price not in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_price between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("package_price not between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andChargeModeIsNull() {
            addCriterion("charge_mode is null");
            return (Criteria) this;
        }

        public Criteria andChargeModeIsNotNull() {
            addCriterion("charge_mode is not null");
            return (Criteria) this;
        }

        public Criteria andChargeModeEqualTo(Integer value) {
            addCriterion("charge_mode =", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotEqualTo(Integer value) {
            addCriterion("charge_mode <>", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeGreaterThan(Integer value) {
            addCriterion("charge_mode >", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_mode >=", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLessThan(Integer value) {
            addCriterion("charge_mode <", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeLessThanOrEqualTo(Integer value) {
            addCriterion("charge_mode <=", value, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeIn(List<Integer> values) {
            addCriterion("charge_mode in", values, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotIn(List<Integer> values) {
            addCriterion("charge_mode not in", values, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeBetween(Integer value1, Integer value2) {
            addCriterion("charge_mode between", value1, value2, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andChargeModeNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_mode not between", value1, value2, "chargeMode");
            return (Criteria) this;
        }

        public Criteria andPackageCycleIsNull() {
            addCriterion("package_cycle is null");
            return (Criteria) this;
        }

        public Criteria andPackageCycleIsNotNull() {
            addCriterion("package_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCycleEqualTo(Integer value) {
            addCriterion("package_cycle =", value, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andPackageCycleNotEqualTo(Integer value) {
            addCriterion("package_cycle <>", value, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andPackageCycleGreaterThan(Integer value) {
            addCriterion("package_cycle >", value, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andPackageCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_cycle >=", value, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andPackageCycleLessThan(Integer value) {
            addCriterion("package_cycle <", value, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andPackageCycleLessThanOrEqualTo(Integer value) {
            addCriterion("package_cycle <=", value, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andPackageCycleIn(List<Integer> values) {
            addCriterion("package_cycle in", values, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andPackageCycleNotIn(List<Integer> values) {
            addCriterion("package_cycle not in", values, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andPackageCycleBetween(Integer value1, Integer value2) {
            addCriterion("package_cycle between", value1, value2, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andPackageCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("package_cycle not between", value1, value2, "packageCycle");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeIsNull() {
            addCriterion("start_use_time is null");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeIsNotNull() {
            addCriterion("start_use_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeEqualTo(String value) {
            addCriterion("start_use_time =", value, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeNotEqualTo(String value) {
            addCriterion("start_use_time <>", value, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeGreaterThan(String value) {
            addCriterion("start_use_time >", value, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_use_time >=", value, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeLessThan(String value) {
            addCriterion("start_use_time <", value, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeLessThanOrEqualTo(String value) {
            addCriterion("start_use_time <=", value, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeLike(String value) {
            addCriterion("start_use_time like", value, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeNotLike(String value) {
            addCriterion("start_use_time not like", value, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeIn(List<String> values) {
            addCriterion("start_use_time in", values, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeNotIn(List<String> values) {
            addCriterion("start_use_time not in", values, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeBetween(String value1, String value2) {
            addCriterion("start_use_time between", value1, value2, "startUseTime");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeNotBetween(String value1, String value2) {
            addCriterion("start_use_time not between", value1, value2, "startUseTime");
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

        public Criteria andUsesIsNull() {
            addCriterion("uses is null");
            return (Criteria) this;
        }

        public Criteria andUsesIsNotNull() {
            addCriterion("uses is not null");
            return (Criteria) this;
        }

        public Criteria andUsesEqualTo(Integer value) {
            addCriterion("uses =", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotEqualTo(Integer value) {
            addCriterion("uses <>", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesGreaterThan(Integer value) {
            addCriterion("uses >", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesGreaterThanOrEqualTo(Integer value) {
            addCriterion("uses >=", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLessThan(Integer value) {
            addCriterion("uses <", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesLessThanOrEqualTo(Integer value) {
            addCriterion("uses <=", value, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesIn(List<Integer> values) {
            addCriterion("uses in", values, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotIn(List<Integer> values) {
            addCriterion("uses not in", values, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesBetween(Integer value1, Integer value2) {
            addCriterion("uses between", value1, value2, "uses");
            return (Criteria) this;
        }

        public Criteria andUsesNotBetween(Integer value1, Integer value2) {
            addCriterion("uses not between", value1, value2, "uses");
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

        public Criteria andTeamPackageIdLikeInsensitive(String value) {
            addCriterion("upper(team_package_id) like", value.toUpperCase(), "teamPackageId");
            return (Criteria) this;
        }

        public Criteria andDoctorTeamIdLikeInsensitive(String value) {
            addCriterion("upper(doctor_team_id) like", value.toUpperCase(), "doctorTeamId");
            return (Criteria) this;
        }

        public Criteria andPackageNameLikeInsensitive(String value) {
            addCriterion("upper(package_name) like", value.toUpperCase(), "packageName");
            return (Criteria) this;
        }

        public Criteria andDescriptionLikeInsensitive(String value) {
            addCriterion("upper(description) like", value.toUpperCase(), "description");
            return (Criteria) this;
        }

        public Criteria andStartUseTimeLikeInsensitive(String value) {
            addCriterion("upper(start_use_time) like", value.toUpperCase(), "startUseTime");
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
package com.huatuo.customer.dao;

import java.util.List;

import com.huatuo.customer.domain.MzVisitDiagnosis;

public interface MzVisitDiagnosisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MzVisitDiagnosis record);

    int insertSelective(MzVisitDiagnosis record);

    MzVisitDiagnosis selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MzVisitDiagnosis record);

    int updateByPrimaryKey(MzVisitDiagnosis record);
    /**
     * 查询就诊记录的诊断
     * @param visitId
     * @return
     */
	List<MzVisitDiagnosis> getListByVisitId(Long visitId);
}
package com.huatuo.customer.dao;

import com.huatuo.customer.domain.MzPatient;
import com.huatuo.customer.domain.MzPatientCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MzPatientMapper {
    int countByExample(MzPatientCriteria example);

    int deleteByExample(MzPatientCriteria example);

    int deleteByPrimaryKey(Long patientId);

    int insert(MzPatient record);

    int insertSelective(MzPatient record);

    List<MzPatient> selectByExampleWithRowbounds(MzPatientCriteria example, RowBounds rowBounds);

    List<MzPatient> selectByExample(MzPatientCriteria example);

    MzPatient selectByPrimaryKey(Long patientId);

    int updateByExampleSelective(@Param("record") MzPatient record, @Param("example") MzPatientCriteria example);

    int updateByExample(@Param("record") MzPatient record, @Param("example") MzPatientCriteria example);

    int updateByPrimaryKeySelective(MzPatient record);

    int updateByPrimaryKey(MzPatient record);
    
    MzPatient selectPatientAndAddressDetail(Long id);
    /**
     * 根据登录用户查询患者列表
     * @param userId
     * @return
     */
	List<MzPatient> getPatientListByUserId(String userId);
}
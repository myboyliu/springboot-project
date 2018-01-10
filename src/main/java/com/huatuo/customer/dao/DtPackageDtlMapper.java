package com.huatuo.customer.dao;

import com.huatuo.customer.domain.DtPackageDtl;
import com.huatuo.customer.domain.DtPackageDtlCriteria;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DtPackageDtlMapper {
    int countByExample(DtPackageDtlCriteria example);

    int deleteByExample(DtPackageDtlCriteria example);

    int deleteByPrimaryKey(String teamPackageDtlId);

    int insert(DtPackageDtl record);

    int insertSelective(DtPackageDtl record);

    List<DtPackageDtl> selectByExampleWithRowbounds(DtPackageDtlCriteria example, RowBounds rowBounds);

    List<DtPackageDtl> selectByExample(DtPackageDtlCriteria example);

    DtPackageDtl selectByPrimaryKey(String teamPackageDtlId);

    int updateByExampleSelective(@Param("record") DtPackageDtl record, @Param("example") DtPackageDtlCriteria example);

    int updateByExample(@Param("record") DtPackageDtl record, @Param("example") DtPackageDtlCriteria example);

    int updateByPrimaryKeySelective(DtPackageDtl record);

    int updateByPrimaryKey(DtPackageDtl record);

    /**
     * 套餐子项信息
     * @param map
     * @return
     */
	List<DtPackageDtl> listDtPackageDtls(Map<String, Object> map);
}
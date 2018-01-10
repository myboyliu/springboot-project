package com.huatuo.customer.dao;

import com.huatuo.customer.domain.DtType;
import com.huatuo.customer.domain.DtTypeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DtTypeMapper {
    int countByExample(DtTypeCriteria example);

    int deleteByExample(DtTypeCriteria example);

    int deleteByPrimaryKey(String dtTypeId);

    int insert(DtType record);

    int insertSelective(DtType record);

    List<DtType> selectByExampleWithRowbounds(DtTypeCriteria example, RowBounds rowBounds);

    List<DtType> selectByExample(DtTypeCriteria example);

    DtType selectByPrimaryKey(String dtTypeId);

    int updateByExampleSelective(@Param("record") DtType record, @Param("example") DtTypeCriteria example);

    int updateByExample(@Param("record") DtType record, @Param("example") DtTypeCriteria example);

    int updateByPrimaryKeySelective(DtType record);

    int updateByPrimaryKey(DtType record);
}
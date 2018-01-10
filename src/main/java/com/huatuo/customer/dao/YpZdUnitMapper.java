package com.huatuo.customer.dao;

import com.huatuo.customer.domain.YpZdUnit;
import com.huatuo.customer.domain.YpZdUnitCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface YpZdUnitMapper {
    int countByExample(YpZdUnitCriteria example);

    int deleteByExample(YpZdUnitCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(YpZdUnit record);

    int insertSelective(YpZdUnit record);

    List<YpZdUnit> selectByExampleWithRowbounds(YpZdUnitCriteria example, RowBounds rowBounds);

    List<YpZdUnit> selectByExample(YpZdUnitCriteria example);

    YpZdUnit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YpZdUnit record, @Param("example") YpZdUnitCriteria example);

    int updateByExample(@Param("record") YpZdUnit record, @Param("example") YpZdUnitCriteria example);

    int updateByPrimaryKeySelective(YpZdUnit record);

    int updateByPrimaryKey(YpZdUnit record);
}
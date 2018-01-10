package com.huatuo.customer.dao;

import com.huatuo.customer.domain.YpZdSupply;
import com.huatuo.customer.domain.YpZdSupplyCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface YpZdSupplyMapper {
    int countByExample(YpZdSupplyCriteria example);

    int deleteByExample(YpZdSupplyCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(YpZdSupply record);

    int insertSelective(YpZdSupply record);

    List<YpZdSupply> selectByExampleWithRowbounds(YpZdSupplyCriteria example, RowBounds rowBounds);

    List<YpZdSupply> selectByExample(YpZdSupplyCriteria example);

    YpZdSupply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YpZdSupply record, @Param("example") YpZdSupplyCriteria example);

    int updateByExample(@Param("record") YpZdSupply record, @Param("example") YpZdSupplyCriteria example);

    int updateByPrimaryKeySelective(YpZdSupply record);

    int updateByPrimaryKey(YpZdSupply record);
}
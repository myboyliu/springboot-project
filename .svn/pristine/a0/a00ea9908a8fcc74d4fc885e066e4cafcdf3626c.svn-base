package com.huatuo.customer.dao;

import com.huatuo.customer.domain.DtRegionService;
import com.huatuo.customer.domain.DtRegionServiceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DtRegionServiceMapper {
    int countByExample(DtRegionServiceCriteria example);

    int deleteByExample(DtRegionServiceCriteria example);

    int deleteByPrimaryKey(String regionServiceId);

    int insert(DtRegionService record);

    int insertSelective(DtRegionService record);

    List<DtRegionService> selectByExampleWithRowbounds(DtRegionServiceCriteria example, RowBounds rowBounds);

    List<DtRegionService> selectByExample(DtRegionServiceCriteria example);

    DtRegionService selectByPrimaryKey(String regionServiceId);

    int updateByExampleSelective(@Param("record") DtRegionService record, @Param("example") DtRegionServiceCriteria example);

    int updateByExample(@Param("record") DtRegionService record, @Param("example") DtRegionServiceCriteria example);

    int updateByPrimaryKeySelective(DtRegionService record);

    int updateByPrimaryKey(DtRegionService record);
}
package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtFmsHost;
import com.huatuo.customer.domain.XtFmsHostCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XtFmsHostMapper {
    int countByExample(XtFmsHostCriteria example);

    int deleteByExample(XtFmsHostCriteria example);

    int deleteByPrimaryKey(Integer hostId);

    int insert(XtFmsHost record);

    int insertSelective(XtFmsHost record);

    List<XtFmsHost> selectByExampleWithRowbounds(XtFmsHostCriteria example, RowBounds rowBounds);

    List<XtFmsHost> selectByExample(XtFmsHostCriteria example);

    XtFmsHost selectByPrimaryKey(Integer hostId);

    int updateByExampleSelective(@Param("record") XtFmsHost record, @Param("example") XtFmsHostCriteria example);

    int updateByExample(@Param("record") XtFmsHost record, @Param("example") XtFmsHostCriteria example);

    int updateByPrimaryKeySelective(XtFmsHost record);

    int updateByPrimaryKey(XtFmsHost record);
}
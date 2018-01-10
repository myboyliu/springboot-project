package com.huatuo.customer.dao;

import com.huatuo.customer.domain.PayInfo;
import com.huatuo.customer.domain.PayInfoCriteria;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PayInfoMapper {
    int countByExample(PayInfoCriteria example);

    int deleteByExample(PayInfoCriteria example);

    int deleteByPrimaryKey(String payNo);

    int insert(PayInfo record);

    int insertSelective(PayInfo record);

    List<PayInfo> selectByExampleWithRowbounds(PayInfoCriteria example, RowBounds rowBounds);

    List<PayInfo> selectByExample(PayInfoCriteria example);

    PayInfo selectByPrimaryKey(String payNo);

    int updateByExampleSelective(@Param("record") PayInfo record, @Param("example") PayInfoCriteria example);

    int updateByExample(@Param("record") PayInfo record, @Param("example") PayInfoCriteria example);

    int updateByPrimaryKeySelective(PayInfo record);

    int updateByPrimaryKey(PayInfo record);
    
    PayInfo selectPayInfoByOrderNo(String orderNo);
}
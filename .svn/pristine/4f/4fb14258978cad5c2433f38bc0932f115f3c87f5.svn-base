package com.huatuo.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huatuo.customer.domain.NumTablePojo;
import com.huatuo.customer.domain.XtReservation;

public interface XtReservationMapper {
    int deleteByPrimaryKey(Long reservationId);

    int insert(XtReservation record);

    int insertSelective(XtReservation record);

    XtReservation selectByPrimaryKey(Long reservationId);

    int updateByPrimaryKeySelective(XtReservation record);

    int updateByPrimaryKey(XtReservation record);
    
    List<XtReservation> selectReservationsByDoctorUid(Long doctorUid);

    
    /**
     * 查询每个医生的号表
     * @param doctorUid
     * @return
     */
	List<NumTablePojo> queryNumTable(@Param("doctorUid") String doctorUid);
    
}
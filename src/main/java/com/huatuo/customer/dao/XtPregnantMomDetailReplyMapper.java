package com.huatuo.customer.dao;

import java.util.List;

import com.huatuo.customer.domain.XtPregnantMomDetailReply;

public interface XtPregnantMomDetailReplyMapper {
    int deleteByPrimaryKey(String id);

    int insert(XtPregnantMomDetailReply record);

    int insertSelective(XtPregnantMomDetailReply record);

    XtPregnantMomDetailReply selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(XtPregnantMomDetailReply record);

    int updateByPrimaryKey(XtPregnantMomDetailReply record);
    
    List<XtPregnantMomDetailReply> selectPregnantMomDetailReplyByPregnantMomDetailId(Long pregnantMomDetailId);
}
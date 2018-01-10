package com.huatuo.customer.dao;

import java.util.List;
import java.util.Map;

import com.huatuo.customer.domain.XtMessageCenter;

public interface XtMessageCenterMapper {
    int deleteByPrimaryKey(String messageCenterId);

    int insert(XtMessageCenter record);

    int insertSelective(XtMessageCenter record);

    XtMessageCenter selectByPrimaryKey(String messageCenterId);
    List<XtMessageCenter> select(XtMessageCenter record);

    int updateByPrimaryKeySelective(XtMessageCenter record);

    int updateByPrimaryKey(XtMessageCenter record);
    
    
    //自定义
    /**
     * 查询聊天信息
     * @param map
     * @return 
     */
	List<XtMessageCenter> listXtMessageCenter(Map<String, Object> map);
}
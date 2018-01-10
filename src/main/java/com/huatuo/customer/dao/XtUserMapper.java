package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtUser;

public interface XtUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(XtUser record);

    int insertSelective(XtUser record);

    XtUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(XtUser record);

    int updateByPrimaryKey(XtUser record);
    
    com.huatuo.register.domain.XtUser selectByPrimaryKeyForLogin(Long id);
}
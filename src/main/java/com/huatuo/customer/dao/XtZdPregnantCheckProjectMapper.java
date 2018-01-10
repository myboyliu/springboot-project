package com.huatuo.customer.dao;

import java.util.List;

import com.huatuo.customer.domain.XtZdPregnantCheckProject;

public interface XtZdPregnantCheckProjectMapper {
    int deleteByPrimaryKey(String id);

    int insert(XtZdPregnantCheckProject record);

    int insertSelective(XtZdPregnantCheckProject record);

    XtZdPregnantCheckProject selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(XtZdPregnantCheckProject record);

    int updateByPrimaryKey(XtZdPregnantCheckProject record);
    
    List<XtZdPregnantCheckProject> selectPregnantCheckProjects();
}
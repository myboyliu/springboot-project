package com.huatuo.customer.dao;

import com.huatuo.customer.domain.XtFeedback;

public interface XtFeedbackMapper {
    int deleteByPrimaryKey(Long id);

    int insert(XtFeedback record);

    int insertSelective(XtFeedback record);

    XtFeedback selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(XtFeedback record);

    int updateByPrimaryKeyWithBLOBs(XtFeedback record);

    int updateByPrimaryKey(XtFeedback record);
}
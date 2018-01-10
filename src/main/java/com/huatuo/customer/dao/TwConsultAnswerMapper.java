package com.huatuo.customer.dao;

import com.huatuo.customer.domain.TwConsultAnswer;
import com.huatuo.customer.domain.TwConsultAnswerCriteria;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TwConsultAnswerMapper {
    int countByExample(TwConsultAnswerCriteria example);

    int deleteByExample(TwConsultAnswerCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(TwConsultAnswer record);

    int insertSelective(TwConsultAnswer record);

    List<TwConsultAnswer> selectByExampleWithRowbounds(TwConsultAnswerCriteria example, RowBounds rowBounds);

    List<TwConsultAnswer> selectByExample(TwConsultAnswerCriteria example);

    TwConsultAnswer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TwConsultAnswer record, @Param("example") TwConsultAnswerCriteria example);

    int updateByExample(@Param("record") TwConsultAnswer record, @Param("example") TwConsultAnswerCriteria example);

    int updateByPrimaryKeySelective(TwConsultAnswer record);

    int updateByPrimaryKey(TwConsultAnswer record);
    /**
     * 通过主题id拿取聊天记录
     * @param consultId
     * @return
     */
	List<TwConsultAnswer> getListByConsultId(Long consultId);
}
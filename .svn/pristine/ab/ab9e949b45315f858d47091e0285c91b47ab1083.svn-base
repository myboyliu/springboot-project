package com.huatuo.customer.dao;

import com.huatuo.customer.domain.TwConsultQuestion;
import com.huatuo.customer.domain.TwConsultQuestionCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TwConsultQuestionMapper {
    int countByExample(TwConsultQuestionCriteria example);

    int deleteByExample(TwConsultQuestionCriteria example);

    int deleteByPrimaryKey(Long id);

    Long insert(TwConsultQuestion record);

    int insertSelective(TwConsultQuestion record);

    List<TwConsultQuestion> selectByExampleWithRowbounds(TwConsultQuestionCriteria example, RowBounds rowBounds);

    List<TwConsultQuestion> selectByExample(TwConsultQuestionCriteria example);

    TwConsultQuestion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TwConsultQuestion record, @Param("example") TwConsultQuestionCriteria example);

    int updateByExample(@Param("record") TwConsultQuestion record, @Param("example") TwConsultQuestionCriteria example);

    int updateByPrimaryKeySelective(TwConsultQuestion record);

    int updateByPrimaryKey(TwConsultQuestion record);
    /**
     * 根据就诊（服务）id查询图文记录问题
     * @param visitId
     * @return
     */
	TwConsultQuestion getListByVisitId(Long visitId);
}
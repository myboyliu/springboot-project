package com.huatuo.customer.service;

import com.huatuo.customer.domain.TwConsultQuestion;

/**
 * 图文咨询服务
 * @author 河南华佗在线
 *
 */
public interface TwConsultQuestionService {
	/**
	 * 根据就诊（服务）id查询图文记录
	 * @param visitId
	 * @return
	 */
	TwConsultQuestion getListByVisitId(Long visitId);
	
	/**
	 * 保存图文咨询
	 * @param dto
	 * @return
	 */
	Long save(TwConsultQuestion dto);
	
	/**
	 * 结束咨询
	 * @param dto
	 * @return
	 */
	int endConsult(TwConsultQuestion dto);
	
	/**
	 * 通过主题id查询主题信息
	 * @param consultId
	 * @return
	 */
	TwConsultQuestion queryQuestion(Long consultId);
	
}

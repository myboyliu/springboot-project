package com.huatuo.customer.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.dao.TwConsultAnswerMapper;
import com.huatuo.customer.domain.TwConsultAnswer;
import com.huatuo.customer.service.TwConsultAnswerService;

@Service
@Transactional
public class TwConsultAnswerServiceImpl implements TwConsultAnswerService{	
	@Autowired
	private TwConsultAnswerMapper twConsultAnswerMapper;

	@Override
	public int saveAnswer(TwConsultAnswer dto) {
		return twConsultAnswerMapper.insert(dto);
	}

}

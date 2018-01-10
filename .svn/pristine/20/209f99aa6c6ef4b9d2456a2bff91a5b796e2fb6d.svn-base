package com.huatuo.customer.controller;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.huatuo.customer.base.page.Page;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.domain.XtEvaluate;
import com.huatuo.customer.query.EvaluateQuery;
import com.huatuo.customer.response.EvaluateResponse;
import com.huatuo.customer.service.EvaluateService;

/**
 * 评价控制类
 * @author dengyajie
 *
 */
@RequestMapping(value = "evaluate")
@RestController
public class EvaluateController {
	
	@Autowired
	private EvaluateService evaluateService;
	
	/**
	 * 新增评价
	 * @param evaluate
	 * @return
	 */
	@PostMapping(value = "addEvaluate")
	public Object addEvaluate(@RequestBody XtEvaluate evaluate) {
		EvaluateResponse response = new EvaluateResponse();
		String patternString = "([\\x{10000}-\\x{10ffff}\ud800-\udfff])";  
	    Pattern pattern = Pattern.compile(patternString);  
	    Matcher matcher = pattern.matcher(evaluate.getEvaluateContent()); 
		if(!matcher.find()) {
			int count = evaluateService.addEvaluate(evaluate);
			if(count == 1) {
				response.setCode(BaseResponse.SUCCESS_CODE);
				response.setMessage(BaseResponse.SUCCESS_MESSAGE);
			} else {
				response.setCode(BaseResponse.ERROR_CODE);
				response.setMessage(BaseResponse.ERROR_MESSAGE); 
			}
		} else {
			response.setCode(BaseResponse.EMOJO_ERROR_CODE);
			response.setMessage(BaseResponse.EMOJO_ERROR_MESSAGE); 
		}
		return response;
	}
	
	@PostMapping(value = "selectEvaluatesByPage")
	public Object selectEvaluatesByPage(@RequestBody EvaluateQuery evaluateQuery) {
		EvaluateResponse response = new EvaluateResponse();
		Page<XtEvaluate> page = evaluateService.selectEvaluatesByPage(evaluateQuery);
		response.setPage(page);
		response.setCode(BaseResponse.SUCCESS_CODE);
		response.setMessage(BaseResponse.SUCCESS_MESSAGE);
		return response;
	}

}

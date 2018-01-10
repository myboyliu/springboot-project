package com.huatuo.customer.service;

import java.util.List;

import com.huatuo.customer.request.PersonParam;

/**
 * 用户反馈业务
 * @author master
 *
 */
public interface XtFeedBackService {
	
	/**
	 * 用户反馈信息保存
	 * @param SuggestionsImages
	 * @param Suggestions
	 * @param relationInfo
	 * @param name
	 * @param userId
	 * @return
	 * @throws Exception 
	 */
	List<String> insertUserFeedBack(PersonParam personParam) throws Exception;
	
}

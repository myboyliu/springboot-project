package com.huatuo.customer.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huatuo.customer.base.domain.XtEvidence;
import com.huatuo.customer.base.response.BaseResponse;
import com.huatuo.customer.base.util.JudeMobileAttribution;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.domain.XtUser;
import com.huatuo.customer.service.UserService;
import com.huatuo.customer.service.XtEvidenceService;
import com.huatuo.register.domain.response.LoginDataResponse;

@Controller
@RequestMapping(value = "Evidence")
public class XtEvidenceController {
	@Resource
	private XtEvidenceService xtEvidenceService;
	@Resource
	private UserService userService;
	private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
	private static final Logger logger = LoggerFactory.getLogger(XtEvidenceController.class);

	/**
	 * 判断是否已创建凭证
	 * 
	 * @param mobile
	 * @param response
	 * @param model
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value = "/getInfo")
	@ResponseBody
	public Object getVipInfo(HttpServletRequest request) throws Exception {
		LoginDataResponse user = Utils.getLoginUserInfo(request);
		Map<String, Object> map = new HashMap<String, Object>();
		XtUser xtUser=userService.getUserinfoById(Long.parseLong(user.getXtUser().getUserId()));
		XtEvidence xtEvidence = new XtEvidence();
		xtEvidence.setMoblie(xtUser.getMobile());
		XtEvidence XtEvidenceTemp = xtEvidenceService.select(xtEvidence);
		if (XtEvidenceTemp != null) {
			char[] id=XtEvidenceTemp.getEvidenceId().toCharArray();
			String s3="";
			for(int i=0;i<id.length;i++){
				if(i%4==0&&i!=0){
					s3=s3+" ";
				}
				s3=s3+id[i];
			}
			XtEvidenceTemp.setEvidenceId(s3);
			XtEvidenceTemp.setCreateTime(df2.format(df.parse(XtEvidenceTemp.getCreateTime())));
			map.put("xtEvidence", XtEvidenceTemp);
			map.put("code", BaseResponse.SUCCESS_CODE + "");
			map.put("message", BaseResponse.SUCCESS_MESSAGE);
		} else {
			map.put("message", BaseResponse.NULL_MESSAGE + "");
		}
		return map;
	}

	/**
	 * 保存凭证信息
	 * 
	 * @param checkCode
	 * @param mobile
	 * @param institution
	 * @param name
	 * @param vipCode
	 * @return
	 */
	@SuppressWarnings("static-access")
	@RequestMapping(value = "/SaveInfo")
	@ResponseBody
	public BaseResponse SaveInfo(HttpServletRequest request) {
		LoginDataResponse user = Utils.getLoginUserInfo(request);
		BaseResponse resp = new BaseResponse();
		XtEvidence xtEvidence = new XtEvidence();
		XtUser xtUser=userService.getUserinfoById(Long.parseLong(user.getXtUser().getUserId()));
		xtEvidence.setMoblie(xtUser.getMobile());
		if(user.getXtUser().getMobile()==null||user.getXtUser().getMobile().equals("")){
			resp.setMessage("需要绑定手机号");
			resp.setCode(resp.ERROR_CODE);
			return resp;
		}
		XtEvidence XtEvidenceTemp = xtEvidenceService.select(xtEvidence);
		if (XtEvidenceTemp == null) {
			xtEvidence.setEvidenceId(new StringBuilder(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()))
					.reverse().toString().substring(0, 16));
			xtEvidence.setInstitution("哈尔滨第一医院");
			xtEvidence.setType("凭证");
			xtEvidence.setIsPay("0");
			xtEvidence.setName(user.getXtUser().getName());
			xtEvidence.setRecommendCode(UUID.randomUUID().toString());
			xtEvidence.setCreateTime(df.format(new Date()));
			xtEvidence.setqCellCore(JudeMobileAttribution.getMobileAttribution(xtUser.getMobile()));
			logger.info("用户手机号"+xtUser.getMobile());
			logger.info(JudeMobileAttribution.getMobileAttribution(xtUser.getMobile()));
			xtEvidenceService.save(xtEvidence);
			resp.setCode(resp.SUCCESS_CODE);
		} else {
			resp.setMessage("创建凭证失败");
			resp.setCode(resp.ERROR_CODE);
		}
		return resp;
	}
}
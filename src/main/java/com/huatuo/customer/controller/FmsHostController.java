package com.huatuo.customer.controller;

import io.swagger.annotations.ApiOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.customer.domain.XtFmsHost;
import com.huatuo.customer.response.FmsHostConfigResponse;
import com.huatuo.customer.service.XtFmsHostService;

/**
 * 流媒体--控制器
 * @author huzhihui
 *
 */
@RestController
@RequestMapping(value = "fmsHost")
public class FmsHostController {

	private static final Logger logger = LoggerFactory.getLogger(FmsHostController.class);
	
	@Autowired
	private FmsHostConfigResponse fmsHostConfigResponse;
	
	@Autowired
	private XtFmsHostService xtFmsHostService;
	
	@ApiOperation(value="获取流媒体配置")
	@GetMapping(value = "getFmsHostConfig", produces = MediaType.APPLICATION_JSON_VALUE)
	public FmsHostConfigResponse getFmsHostConfig() throws Exception{
		return fmsHostConfigResponse;
	}
	
	@ApiOperation(value="获取流媒体地址")
	@PostMapping(value = "getHost", produces = MediaType.APPLICATION_JSON_VALUE)
	public XtFmsHost getHost(String accessToken,Long mid,Long taskId) throws Exception{
		logger.info("-----开始获取流媒体地址--fmsHost:");
		if(0 == taskId || null == taskId){//医生对患者调取接口
			logger.info("-----医生、患者开始获取最优host");
			return xtFmsHostService.getHost(accessToken, mid);
		}else{
			logger.info("-----即时咨询获取host");
		}
		return null;
	}
	
}

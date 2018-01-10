package com.huatuo.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatuo.customer.base.enums.FmsHostStatus;
import com.huatuo.customer.base.redis.CommonDao;
import com.huatuo.customer.base.redis.RedisSupport;
import com.huatuo.customer.base.util.Utils;
import com.huatuo.customer.dao.XtFmsHostMapper;
import com.huatuo.customer.domain.XtFmsHost;
import com.huatuo.customer.domain.XtFmsHostCriteria;
import com.huatuo.customer.service.XtFmsHostService;
import com.huatuo.db.pojo.FlexVisitQueuePojo;

@Service
@Transactional
public class XtFmsHostServiceImpl implements XtFmsHostService {
	
	
	private static final Logger logger = LoggerFactory.getLogger(XtFmsHostServiceImpl.class);

	@Autowired
	private XtFmsHostMapper xtFmsHostMapper;
	
	@Autowired
	private RedisSupport redisSupport;
	
	@Autowired
	private CommonDao commonDao;
	
	/**
	 * redis 存储key
	 */
	private static final String FMS_HOST_PRE = "fms_host";
	/**
	 * host存储的list
	 */
	private static final String FMS_HOST_LIST = "fms_host_list";
	/**
	 * redis 存储时长 比前段发请求多10S用于网络开销
	 */
	private static final Integer FMS_HOST_TIME = 22;
	
	@Override
	public XtFmsHost selectByPrimaryKey(Integer hostId) {
		return xtFmsHostMapper.selectByPrimaryKey(hostId);
	}

	@Override
	public XtFmsHost getHost(String accessToken, Long mid) {
		com.huatuo.db.bean.XtFmsHost xtFmsHost = allocationHost(accessToken,mid);//获取最优的host
		try {
			FlexVisitQueuePojo flexVisitQueuePojo = commonDao.getFlexVisitQueuePojo(mid);
			if(null != flexVisitQueuePojo && null !=flexVisitQueuePojo.getXtFmsHost()){
				if(redisSupport.exists(FMS_HOST_PRE+flexVisitQueuePojo.getXtFmsHost().getHostId())){//判断主机是否已经死机
					return Utils.exchangeObject(flexVisitQueuePojo.getXtFmsHost(), XtFmsHost.class);
				}
			}
		} catch (Exception e) {
			System.out.println("redis未保存该医生信息");
			return Utils.exchangeObject(xtFmsHost,XtFmsHost.class);
		}
		return Utils.exchangeObject(xtFmsHost,XtFmsHost.class);
	}

	/**
	 * 初始化redis的fms_host数据
	 */
	private void initHost(){
		if(!redisSupport.exists(FMS_HOST_LIST)){
			logger.info("----------------------------未有FMS_HOST_PRE缓存开始数据查询到缓存");
			List<String> fms_host_list = new ArrayList<>();
			List<XtFmsHost> xtFmsHostsNew = xtFmsHostMapper.selectByExample(new XtFmsHostCriteria());
			List<com.huatuo.db.bean.XtFmsHost> xtFmsHosts = new ArrayList<>();
			for(int i=0;i<xtFmsHostsNew.size();i++){
				xtFmsHosts.add(Utils.exchangeObject(xtFmsHostsNew.get(i), com.huatuo.db.bean.XtFmsHost.class));
			}
			for(int i=0;i<xtFmsHosts.size();i++){
				if(xtFmsHosts.get(i).getHostStatus().equals(FmsHostStatus.RUNNING.getName())){//运行的主机才进行添加到缓存
					fms_host_list.add(FMS_HOST_PRE + xtFmsHosts.get(i).getHostId());//添加到列表中
					redisSupport.set(FMS_HOST_PRE + xtFmsHosts.get(i).getHostId(), xtFmsHosts.get(i), FMS_HOST_TIME);
				}
			}
			redisSupport.set(FMS_HOST_LIST, fms_host_list,600000000);
		}else{
			System.out.println("----------------------------已有FMS_HOST_PRE缓存开始校验缓存");
		}
	}
	
	/**
	 * 优先分配一个最优host
	 * @param accessToken
	 * @param mid
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private com.huatuo.db.bean.XtFmsHost allocationHost(String accessToken, Long mid) {
		initHost();
		List<String> fms_host_list = (List<String>) redisSupport.get(FMS_HOST_LIST);
		List<com.huatuo.db.bean.XtFmsHost> xtFmsHosts = new ArrayList<>();
		for(int i=0;i<fms_host_list.size();i++){
			if(redisSupport.exists(fms_host_list.get(i))){
				xtFmsHosts.add((com.huatuo.db.bean.XtFmsHost) redisSupport.get(fms_host_list.get(i)));
			}
		}
		for(int i=0;i<xtFmsHosts.size();i++){//排序
			com.huatuo.db.bean.XtFmsHost xtFmsHost = new com.huatuo.db.bean.XtFmsHost();
			int min = i;
			for(int j=i+1;j<xtFmsHosts.size();j++){
				if((xtFmsHosts.get(j).getHostMaxCount()-xtFmsHosts.get(j).getHostOnlineCount())>(xtFmsHosts.get(i).getHostMaxCount()-xtFmsHosts.get(i).getHostOnlineCount())){
					min = j;
				}
			}
			xtFmsHost = xtFmsHosts.get(i);
			xtFmsHosts.set(i,xtFmsHosts.get(min));
			xtFmsHosts.set(min, xtFmsHost);
		}
		if(null != xtFmsHosts && xtFmsHosts.size() != 0){
			System.out.println("----------------------------------------分配最优hostId");
			return xtFmsHosts.get(0);
		}
		System.out.println("----------------------------------------未分配最优hostId，直接从数据库拿取数据");
		return Utils.exchangeObject(xtFmsHostMapper.selectByExample(new XtFmsHostCriteria()).get(0), com.huatuo.db.bean.XtFmsHost.class);
	}
}

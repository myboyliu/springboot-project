package com.huatuo.customer.base.util;

public class ConfigProperites {
	private static final String REDIS_KEY_QUEUING_MAP = "redis.redisKeyQueuingMap";
	
	private static final String REDIS_KEY_TASK_MAP = "redis.task";
	
	private static final String REDIS_KEY_TIMER_TASK_MAP = "redis.timer.task";
	
	private static final String REDIS_KEY_TIMER_MZ_ORDER_MAP = "redis.timer.mz_order";
	
	private static final String REDIS_KEY_TIMER_PAY_ORDER_MAP = "redis.timer.pay_order";
	
	private static final String REDIS_KEY_TIMER_PAY_CAS_ORDER_MAP = "redis.timer.pay_CAS_order";
	
	private static final String REDIS_MZ_ORDER_TIMER = "redis.mz_order_timer";
	
	private static final String REDIS_MZ_ORDER_MINUTE = "redis.mz_order_minute";
	
	private static final String REDIS_PAY_ORDER_TIMER = "redis.pay_order_timer";
	
	private static final String REDIS_PAY_ORDER_MINUTE = "redis.pay_order_minute";
	
	private static final String REDIS_PAY_ORDER_TIMER_HOUR = "redis.pay_order_timer_hour";
	
	private static final String REDIS_PAY_ORDER_HOUR = "redis.pay_order_hour";
	
	private static final String REDIS_NOTE_TIMER = "redis.note_timer";
	
	private static final String REDIS_NOTE_MINUTE = "redis.note_minute";
	
	private static final String districtMap = "dictionary.districtMap";
	
	private static final String familyRelationMap = "dictionary.familyRelationMap";
	
	private static final String icdMap = "dictionary.icdMap";
	
	private static final String xtZdOrgMap = "dictionary.xtZdOrgMap";
	
	private static final String ypZdKindMap = "dictionary.ypZdKindMap";
	
	private static final String ypZdSupplyMap = "dictionary.ypZdSupplyMap";
	
	private static final String xtSpecialtyMap = "dictionary.xtSpecialtyMap";
	
	private static final String xtealthExamMap = "dictionary.xtealthExamMap";
	
	private static final String taskExeMap = "dictionary.taskExeMap";
	
	private static final String companyMap = "dictionary.companyMap";
	
	private static final String unitMap = "dictionary.companyMap";
	
	private static final String occupationMap = "dictionary.companyMap";
	
	private static final String doctorId = "dictionary.doctorId";

	private static final String frequencyMap = "dictionary.frequencyMap";
	
	private static final String  APPLICATION_SPRING_DATASOURCE = "application.spring.datasource";
	
	private static final String  APPLICATION_SPRING_REDIS = "application.spring.redis";
	
	private static final String APPLICATION_FMS_HOST = "application.fms.host";
	
	private static final String ASSEMBLY_PAY_PARAM_FORALIPAY = "assemblyPayParamForAlipay";
	
	private static final String PAY_AFTER_NOTICE_URL = "pay_after_notice_url";
	
	private static final String IMAGE_URL = "imageUrl";
	
	private static final String FTP_URL = "ftpUrl";
	
	private static final String PORT = "port";
	
	private static final String USER_NAME = "userName";
	
	private static final String PASSWORD = "password";
	
	private static final String NSQ_ADDRESS = "nsqAddress";
	
	private static final String TIMER_URL = "timerUrl";
	
	public static String getTimerUrl() {
		return PropertyUtils.get(TIMER_URL);
	}
	
	public static String getFtpUrl(){
		return PropertyUtils.get(FTP_URL);
	}
	
	public static String getPort(){
		return PropertyUtils.get(PORT);
	}
	
	public static String getUserName(){
		return PropertyUtils.get(USER_NAME);
	}
	
	public static String getPassword(){
		return PropertyUtils.get(PASSWORD);
	}
	
	public static String getPayAfterNoticeUrl(){
		return PropertyUtils.get(PAY_AFTER_NOTICE_URL);
	}
	
	public static String getAssemblyPayParamForAlipay(){
		return PropertyUtils.get(ASSEMBLY_PAY_PARAM_FORALIPAY);
	}
	
	public static String getApplicationSpringDatasource(){
		return PropertyUtils.get(APPLICATION_SPRING_DATASOURCE);
	}
	
	public static String getApplicationSpringRedis(){
		return PropertyUtils.get(APPLICATION_SPRING_REDIS);
	}
	
	public static String getCompanymap() {
		return PropertyUtils.get(companyMap);
	}
	public static String getUnitmap() {
		return PropertyUtils.get(unitMap);
	}
	public static String getOccupationmap() {
		return PropertyUtils.get(occupationMap);
	}
	public static String getRedisKeyQueuingMap() {
		return PropertyUtils.get(REDIS_KEY_QUEUING_MAP);
	}
	public static String getRedisKeyTaskMap() {
		return PropertyUtils.get(REDIS_KEY_TASK_MAP);
	}
	
	public static String getRedisKeyTimerTaskMap() {
		return PropertyUtils.get(REDIS_KEY_TIMER_TASK_MAP);
	}

	public static String getRedisKeyTimerMzOrderMap() {
		return PropertyUtils.get(REDIS_KEY_TIMER_MZ_ORDER_MAP);
	}

	public static String getRedisKeyTimerPayOrderMap() {
		return PropertyUtils.get(REDIS_KEY_TIMER_PAY_ORDER_MAP);
	}

	public static String getRedisKeyTimerPayCasOrderMap() {
		return PropertyUtils.get(REDIS_KEY_TIMER_PAY_CAS_ORDER_MAP);
	}

	public static String getRedisMzOrderTimer() {
		return PropertyUtils.get(REDIS_MZ_ORDER_TIMER);
	}

	public static String getRedisMzOrderMinute() {
		return PropertyUtils.get(REDIS_MZ_ORDER_MINUTE);
	}

	public static String getRedisPayOrderTimer() {
		return PropertyUtils.get(REDIS_PAY_ORDER_TIMER);
	}

	public static String getRedisPayOrderMinute() {
		return PropertyUtils.get(REDIS_PAY_ORDER_MINUTE);
	}

	public static String getRedisPayOrderTimerHour() {
		return PropertyUtils.get(REDIS_PAY_ORDER_TIMER_HOUR);
	}

	public static String getRedisPayOrderHour() {
		return PropertyUtils.get(REDIS_PAY_ORDER_HOUR);
	}

	public static String getRedisNoteTimer() {
		return PropertyUtils.get(REDIS_NOTE_TIMER);
	}

	public static String getRedisNoteMinute() {
		return PropertyUtils.get(REDIS_NOTE_MINUTE);
	}
	public static String getDistrictmap() {
		return PropertyUtils.get(districtMap);
	}
	public static String getFamilyrelationmap() {
		return PropertyUtils.get(familyRelationMap);
	}
	public static String getIcdmap() {
		return PropertyUtils.get(icdMap);
	}
	public static String getXtzdorgmap() {
		return PropertyUtils.get(xtZdOrgMap);
	}
	public static String getYpzdkindmap() {
		return PropertyUtils.get(ypZdKindMap);
	}
	public static String getYpzdsupplymap() {
		return PropertyUtils.get(ypZdSupplyMap);
	}
	public static String getXtspecialtymap() {
		return PropertyUtils.get(xtSpecialtyMap);
	}
	public static String getXtealthexammap() {
		return PropertyUtils.get(xtealthExamMap);
	}
	public static String getTaskexemap() {
		return PropertyUtils.get(taskExeMap);
	}
	public static String getDoctorid() {
		return PropertyUtils.get(doctorId);
	}
	public static String getFrequencymap() {
		return PropertyUtils.get(frequencyMap);
	}
	public static String getApplicationFmsHost() {
		return PropertyUtils.get(APPLICATION_FMS_HOST);
	}
	public static String getImageUrl() {
		return PropertyUtils.get(IMAGE_URL);
	}
	public static String getNsqAdress() {
		return PropertyUtils.get(NSQ_ADDRESS);
	}
}

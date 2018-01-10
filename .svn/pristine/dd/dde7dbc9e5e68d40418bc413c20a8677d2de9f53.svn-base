package com.huatuo.customer.base.util;

/**
 * 外部请求地址
 */
public class HttpUrl {

	/**
	 * 定时器项目
	 */
	public static String TIMER = ConfigProperites.getTimerUrl();
	
	/**
	 * 会议提前45分钟发送短信
	 */
	public static String TIMERSEND = TIMER +"/mobile/task/send";
	
	/**
	 * 订单提交审核两分钟后(待审状态)改为超时通过状态
	 */
	public static String TIMERMZORDER = TIMER +"/mzOrder/updateTaskState";
	
	/**
	 * 取消处方的定时任务
	 */
	public static String CANCELRMZORDER = TIMER +"/mzOrder/cancelTask";
	
	/**
	 * 待付款订单45分钟后的状态改变,及业务表mz_visit添加结束时间
	 */
	public static String TIMERPAYORDER = TIMER +"/payOrder/updateOrderState";
	
	/**
	 * 取消待付款订单45分钟定时任务
	 */
	public static String CANCELPAYORDER = TIMER +"/payOrder/cancelOrderState";
	
	/**
	 * 待审核订单24小时后的状态改变,及业务表mz_visit添加结束时间
	 */
	public static String TIMERPAYORDERSUB = TIMER +"/payOrder/updateCASOderState";
	
	/**
	 * 取消待审核订单24小时后的状态改变
	 */
	public static String CANCELRAYORDERSUB = TIMER +"/payOrder/cancelCASOderState";
	
	/**
	 * 预约订单提前1个小时发送短信
	 */
	public static String TIMERSENDBESPEAKMOBILE = TIMER +"/payOrder/SendBespeakMobile";
	
	/**
	 * 取消预约订单提前1个小时发送短信
	 */
	public static String CANCELSENDBESPEAKMOBILE = TIMER +"/payOrder/cancelSendBespeakMobile";
	
	/**
	 * 15分钟(24小时)后自动取消协作订单
	 */
	public static String TASKMEDICALORDERCANCEL = TIMER +"/task/updateTaskStatus";
	
	/**
	 * 取消15分钟(24小时)后自动取消协作订单任务
	 */
	public static String CANCELTASKMEDICALORDER = TIMER +"/task/cancelTaskStatus";
}

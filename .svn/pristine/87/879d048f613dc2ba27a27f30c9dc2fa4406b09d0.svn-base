package com.huatuo.customer.base.sms;


public class MessageConfig {

	public final static String URL = "/message/mail/verification/";
	public final static String BIND_URL = "/web/bind/mail/verification/";
	public final static String PERSON_CALLBACK_URL = "/web/person/person";
	public final static String ORG_CALLBACK_URL = "/web/org/person";
	public final static String DOCTOR_CALLBACK_URL = "/web/doctor/person";
	public final static String FLELD_SMTP_HOST = "smtp.exmail.qq.com";
	public final static String FLELD_SMTP_FROM = "service@huatuooh.com";
	public final static String FLELD_SMTP_FROM_USERPASSWORD = "HuaTuoService1234";
	public final static String FLELD_SMTP_FROM_MESSAGETYPE = "text/html;charset=UTF-8";
	
	//手机
	public final static String FLELD_MOBILE_USERID = "1030";
	
	public final static String FLELD_MOBILE_ACCOUNT = "schtzx";
	
	public final static String FLELD_MOBILE_PWD = "scth2015kkm";
	
	public final static long FLELD_TIME = 1000 * 60 * 10;
	
	public final static long FLELD_MOBILE_TIME = 1000 * 60;
	
	public final static long FLELD_MESSAGE_COUNT = 10;
	
	public final static int FLELD_MESSAGETYPE_SMTP = 1;
	
	public final static int FLELD_MESSAGETYPE_MOBILE = 2;
	
	public final static int FLELD_MESSAGETYPE_OTHER = 3;
	
	public final static String FLELD_SMTP_SUBJECT_VERIFICATION = "华佗快线邮箱验证";
	public final static String FLELD_MOBILE_SUBJECT_VERIFICATION = "华佗快线手机验证";
//	public final static String FLELD_SMTP_SUBJECT_COUNTEXT = "华佗快线邮箱验证";
	
	public final static String FLELD_SMTP_SUBJECT_PWD = "华佗快线找回密码";
	
    public final static String CHECK_BEFORE_MESSAGE = "【华佗快线】用户您好！XX向你们医院提出了一条新的远程协作请求，请及时进行处理。";
	
	public final static String CHECK_AFTER_MESSAGE = "【华佗快线】用户您好！您提交的远程协作请求已经全部处理完毕，请及时进行查看任务反馈信息。";
	
//	public static String getEmailCountext(String val,String code){
//		StringBuffer countext = new StringBuffer();
//		countext.append("华佗快线邮箱验证:");
//		countext.append("<a href='" + ConfigProperites.getEmailBindUrl() + URL + code +"' >" + ConfigProperites.getEmailBindUrl() + URL + code +"</a>  		点击链接进行验证");
//		return countext.toString();
//	}
//	
//	public static String getEmailBindCountext(String val,String code){
//		StringBuffer countext = new StringBuffer();
//		countext.append("华佗快线邮箱验证:");
//		countext.append("<a href='" + ConfigProperites.getEmailBindUrl() + BIND_URL + code +"' >" + ConfigProperites.getEmailBindUrl() + BIND_URL + code +"</a> 	点击链接进行验证");
//		System.out.println("getEmailBindCountext:" + countext);
//		return countext.toString();
//	}
//	
//	public static String getcode(String val){
//		return MD5Util.MD5(val+Utils.getNowTime());
//	}
	
	public static String getMoblieCountext(String code){
		StringBuffer countext = new StringBuffer();
		countext.append("【华佗快线】验证码:");
		countext.append(code +"， 如非本人操作，请忽略此信息。");
		return countext.toString();
	}
	
	public static int getcode(){
		int resultNumber = (int) (Math.random()*1000000);
		while(String.valueOf(resultNumber).length() != 6){
			resultNumber = (int) (Math.random()*1000000);
		}
		return resultNumber;
	}
	
	public static String taskInitCountext(String taskName,String time){
		return "【华佗快线】用户您好！您有远程协作任务即将在"+time+"开始，请及时通知各相关任务参与人员，以便任务如期举行。";
	}
	
	public static String getApplyYesContext(String doctorName, String date) {
		StringBuilder sb = new StringBuilder();
		sb.append("【华佗快线】");
		sb.append(doctorName);
		sb.append("医生您好！您于").append(date).append("在华佗网络医院申请的账号已经通过审核，请及时进入网络医院服务平台进行帐号激活，平台链接地址：http://www.huatuooh.com");
		return sb.toString();
		
	}
	
	public static String getApplyNoContext(String doctorName, String date) {
		StringBuilder sb = new StringBuilder();
		sb.append("【华佗快线】");
		sb.append(doctorName);
		sb.append("医生您好！您于").append(date).append("在华佗网络医院申请的帐号，因为提供的注册资料不完整没有通过审核，请提供完整的注册资料后再次申请。华佗网络医院感谢您的支持！");
		return sb.toString();
		
	}
}

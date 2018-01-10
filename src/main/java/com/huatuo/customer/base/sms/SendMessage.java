package com.huatuo.customer.base.sms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMessage {
	/**
	 * 邮箱消息发送
	 * @param smtpHost						服务器邮箱
	 * @param from							邮箱账号
	 * @param fromUserPassword				邮箱密码
	 * @param to							发送的地址
	 * @param subject						主题
	 * @param messageText					内容
	 * @param messageType					类型
	 * @throws MessagingException
	 */
	@SuppressWarnings("static-access")
	public static void sendMail(String to, String subject, String messageText) throws MessagingException {
		// 第一步：配置javax.mail.Session对象
//		System.out.println("为" + smtpHost + "配置mail session对象");
		String smtpHost = MessageConfig.FLELD_SMTP_HOST;
		String from = MessageConfig.FLELD_SMTP_FROM;
		String fromUserPassword = MessageConfig.FLELD_SMTP_FROM_USERPASSWORD;
		String messageType = MessageConfig.FLELD_SMTP_FROM_MESSAGETYPE;
		Properties props = new Properties();
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.starttls.enable", "true");// 使用 STARTTLS安全连接
		// props.put("mail.smtp.port", "25"); //google使用465或587端口
		props.put("mail.smtp.auth", "true"); // 使用验证
		// props.put("mail.debug", "true");
		Session mailSession = Session.getInstance(props, new MyAuthenticator(
				from, fromUserPassword));
		// 第二步：编写消息
//		System.out.println("编写消息from——to:" + from + "——" + to);
		InternetAddress fromAddress = new InternetAddress(from);
		InternetAddress toAddress = new InternetAddress(to);

		MimeMessage message = new MimeMessage(mailSession);

		message.setFrom(fromAddress);
		message.addRecipient(RecipientType.TO, toAddress);

		message.setSentDate(Calendar.getInstance().getTime());
		message.setSubject(subject);
		message.setContent(messageText, messageType);

		// 第三步：发送消息
		Transport transport = mailSession.getTransport("smtp");
		transport.connect(smtpHost, from, fromUserPassword);
		transport.send(message, message.getRecipients(RecipientType.TO));
//		System.out.println("message yes");
	}
	
	@SuppressWarnings("unused")
	public static String sendMobile(String mobile, String content){
		String PostData;
		try {
			PostData = "userid="+MessageConfig.FLELD_MOBILE_USERID+"&account="+MessageConfig.FLELD_MOBILE_ACCOUNT
					+"&password="+MessageConfig.FLELD_MOBILE_PWD+"&mobile="+mobile+"&sendTime=&content="+java.net.URLEncoder.encode(content,"UTF-8");
			String ret = SendMessage.SMS(PostData, "http://dc.28inter.com/sms.aspx?action=send");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
	}

    public static String SMS(String postData, String postUrl) {
        try {
            //发送POST请求
            URL url = new URL(postUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setUseCaches(false);
            conn.setDoOutput(true);

            conn.setRequestProperty("Content-Length", "" + postData.length());
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            out.write(postData);
            out.flush();
            out.close();

            //获取响应状态
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                return "";
            }
            //获取响应内容体
            String line, result = "";
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            while ((line = in.readLine()) != null) {
                result += line + "\n";
            }
            in.close();
            return result;
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return "";
    }

	/*public static void main(String[] args) {
		try {
			SendMessage.sendMail( "hu.cao@huatuooh.com",
					MessageConfig.FLELD_SMTP_SUBJECT_VERIFICATION, "test");
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(MessageConfig.getEmailCountext("hu.cao@huatuooh.com"));
	}*/
}

class MyAuthenticator extends Authenticator {
	String userName = "";
	String password = "";

	public MyAuthenticator() {

	}

	public MyAuthenticator(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}
}

package com.huatuo.customer.base.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Map;

import org.springframework.util.StringUtils;

public class HttpConnection {

	/**
	 * 后台链接,请求
	 * 
	 * @param postUrl
	 * @param method
	 * @param encod
	 * @return
	 */
	public static String get(String httpUrl, Map<String, Object> params, String encod) {
		// String postUrl = "http://localhost:8080/timer/mobile/test";
		URL url;
		HttpURLConnection conn = null;
		String json = null;
		try {
			String param = HttpConnection.setParams(params);//获取get请求参数
			url = new URL(httpUrl+"?"+param);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			// 判断是否正常响应数据
			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
				// System.out.println("网络错误异常！!!!");
				// return false;
				return null;
			}
			InputStream is = conn.getInputStream(); // 获取输入流
			try {
				// String json = this.read(is,encod);
				BufferedReader reader = new BufferedReader( new InputStreamReader(is, encod));
				StringBuilder src = new StringBuilder();
				String line = "";
				while ((line = reader.readLine()) != null) {
					// line = new String(line.getBytes(), "utf-8");
					src.append(line);
				}
				reader.close();
				is.close();
				json = src.toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect(); // 中断连接
			}
		}
		return json;
	}
	
	public static String post(String postUrl, Map<String, Object> params, String encod) {
		URL url;
		HttpURLConnection connection = null;
		String json = null;
		try {
			 // Post请求的url，与get不同的是不需要带参数
         url = new URL(postUrl);
         connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        // Post 请求不能使用缓存
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        connection.connect();
        PrintWriter pw=new PrintWriter(connection.getOutputStream());
        String content = HttpConnection.setParams(params);
        pw.print(content);
        pw.flush();
        pw.close();
        
        json = HttpConnection.getReturn(connection.getInputStream(), encod);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect(); // 中断连接
			}
		}
		return json;
    }
	
	public static String postToJson(String postUrl, Map<String, Object> params, String encod) {
		URL url;
		HttpURLConnection connection = null;
		String json = null;
		try {
        url = new URL(postUrl);
        connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        // Post 请求不能使用缓存
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        connection.connect();
        PrintWriter pw=new PrintWriter(connection.getOutputStream());
        String content = HttpConnection.setParams(params);
        pw.print(content);
        pw.flush();
        pw.close();
        
        json = HttpConnection.getReturn(connection.getInputStream(), encod);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect(); // 中断连接
			}
		}
		return json;
    }
	
	private static String setParams(Map<String, Object> params) throws IOException{
        StringBuilder content = new StringBuilder();
        // DataOutputStream.writeBytes将字符串中的16位的unicode字符以8位的字符形式写道流里面
        String t = new Date().getTime() + "";
        content.append("t=").append(t);
        if(!StringUtils.isEmpty(params) && params.size() > 0){
        	for(Map.Entry<String, Object> param : params.entrySet()){
            	content.append("&").append(param.getKey()).append("=").append(param.getValue());
            }
        }
		return content.toString();
	}
	
	private static String getReturn(InputStream inputStream, String encod) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, encod));//设置编码,否则中文乱码
        StringBuilder src = new StringBuilder();
        String line="";
        while ((line = reader.readLine()) != null){
            src.append(line);
        }
        reader.close();
		return src.toString();
	}
	

	/**
	 * Http请求，且传入格式为xml字符串
	 * @param url
	 * @param xmlStr
	 * @return
	 */
	public static String xmlPost(String urlStr, String xmlStr){
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			try {
				URL realUrl = new URL(urlStr);
				// 打开和URL之间的连接
				URLConnection conn = realUrl.openConnection();
				// 设置通用的请求属性
//				conn.setRequestProperty("accept", "*/*");
				conn.setRequestProperty("Content-Type", "text/xml");
				// 发送POST请求必须设置如下两行
				conn.setDoOutput(true);
				conn.setDoInput(true);
				// 获取URLConnection对象对应的输出流
				out = new PrintWriter(conn.getOutputStream());
				// 发送请求参数
				out.print(xmlStr);
				// flush输出流的缓冲
				out.flush();
				// 定义BufferedReader输入流来读取URL的响应
				in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line;
				while ((line = in.readLine()) != null) {
					result += line;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 使用finally块来关闭输出流、输入流
			finally {
				try {
					if (out != null) {
						out.close();
					}
					if (in != null) {
						in.close();
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

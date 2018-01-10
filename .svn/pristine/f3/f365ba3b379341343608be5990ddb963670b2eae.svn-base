package com.huatuo.customer.base.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FtpUtils {

	// FTP状态码
	public static int i = 1;
	private static Logger logger = LoggerFactory.getLogger(FtpUtils.class);
	private static String ftpUrl = ConfigProperites.getFtpUrl();
	private static int port = Integer.parseInt(ConfigProperites.getPort());
	private static String userName = ConfigProperites.getUserName();
	private static String password = ConfigProperites.getPassword();

	/**
	 * ftp上传单个文件
	 * 
	 * @param ftpUrl
	 *            ftp地址
	 * @param port
	 *            端口号
	 * @param userName
	 *            ftp的用户名
	 * @param password
	 *            ftp的密码
	 * @param directory
	 *            上传至ftp的路径名不包括ftp地址
	 * @param destName
	 *            上传至ftp后存储的文件名
	 * @param InputStream
	 *            输入流
	 * @throws IOException
	 */
	public boolean upload(String ftpUrl, int port, String userName,
			String password, String directory, String destName,
			InputStream input) throws IOException {
		FTPClient ftpClient = new FTPClient();
		boolean result = false;
		try {
			ftpClient.connect(ftpUrl, port);
			ftpClient.login(userName, password);
			ftpClient.enterLocalPassiveMode();
			boolean flag = existDirectory(directory, ftpClient);
			if (!flag) {
				createDirectory(directory, ftpClient);
			}
			// 设置上传目录
			ftpClient.changeWorkingDirectory(directory);
			ftpClient.setBufferSize(1024);
			ftpClient.setControlEncoding("gbk");
			// 设置文件类型（二进制）
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			FTPFile[] len=ftpClient.listFiles(destName);
			if(len.length!=0){
			   boolean exist =ftpClient.deleteFile(destName);
			   if (!exist) {
				   logger.error("FtpUtils删除重复文件失败,destName=" + destName);
			   }
			}
			result = ftpClient.storeFile(destName, input);
			return result;
		} catch (NumberFormatException e) {
			logger.error("FTP端口配置错误:不是数字:");
			throw e;
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		} catch (IOException e) {
			throw new IOException(e);
		} finally {
			IOUtils.closeQuietly(input);
			try {
				ftpClient.disconnect();
			} catch (IOException e) {
				throw new RuntimeException("关闭FTP连接发生异常！", e);
			}
		}
	}

	/**
	 * 将本地文件上传到FTP服务器上
	 * 
	 * @param path
	 *            FTP 服务器保存目录
	 * @param filename
	 *            上传到FTP服务器上的文件名
	 * @param orginfilename
	 *            上传文件路径
	 */
	public void upLoadFromProduction(String path, String filename,
			InputStream in) {
		try {
			boolean flag = upload(ftpUrl, port, userName, password, path,
					filename, in);
			logger.error("FtpUtils上传,flag=" + flag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 检查目录是否存在
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public boolean existDirectory(String path, FTPClient ftpClient)
			throws IOException {
		boolean flag = false;
		FTPFile[] ftpFileArr = ftpClient.listFiles(path);
		for (FTPFile ftpFile : ftpFileArr) {
			if (ftpFile.isDirectory()
					&& ftpFile.getName().equalsIgnoreCase(path)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	/**
	 * 创建新目录
	 * 
	 * @param pathName
	 * @param ftpClient
	 * @return
	 * @throws IOException
	 */
	public boolean createDirectory(String pathName, FTPClient ftpClient)
			throws IOException {
		return ftpClient.makeDirectory(pathName);
	}
	
}
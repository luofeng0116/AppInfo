package com.wzj.appsys.util.decode;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 读取database.properties文件加密驱动、用户名、密码、URI
 * @author 郭建呀
 *
 */
public class PropertiesHelper {
	public static void main(String[] args) {
		Properties  ps = new Properties();
		try(InputStream in = PropertiesHelper.class.getClassLoader().getResourceAsStream("database.properties")){
			ps.load(in);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ps.get("driver"));	
		System.out.println(ps.getProperty("driver"));	
	}
}

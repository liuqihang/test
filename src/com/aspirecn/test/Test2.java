package com.aspirecn.test;

import java.util.Date;

import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;

public class Test2 extends Thread{
	
	public static Date date = new Date();
	public static String baseTime;
	static{
		baseTime = date.getTime()+"";
	}
	
	public void run(){
		this.start();
	}
	
	public static void main(String[] args) {
//		System.out.println(date);
//		System.out.println(date.getTime());
		jsonToXml();
	}
	
	public static void jsonToXml(){
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("name", "lqh");
//		jsonObject.put("pwd", "123456");
//		XMLSerializer xmlSerializer = new XMLSerializer();
//		xmlSerializer.setRootName("user_info");
//		xmlSerializer.setTypeHintsEnabled(false);
//		String xml = xmlSerializer.write(jsonObject);
//		System.out.println(xml);
		 System.out.println("json字符串转xml字符串");
		 String jsonStr = "{\"password\":\"123456\",\"username\":\"张三\"}";
//		 JSONObject json = JSONObject.fromString(jsonStr);
		 JSONObject json = JSONObject.fromObject(jsonStr);
		 XMLSerializer xmlSerializer = new XMLSerializer();
		 xmlSerializer.setRootName("user_info");
		 xmlSerializer.setTypeHintsEnabled(false);
		 String xml = xmlSerializer.write(json);
		 System.out.println("json--->xml \n" + xml);
	}
}

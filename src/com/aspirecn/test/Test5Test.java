package com.aspirecn.test;


import java.util.Date;
import java.util.Random;


public class Test5Test {

	public static String getRandStr(int length) {
		Random r = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append((char) (r.nextInt(127 - 32) + 32));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
//		System.out.println(getRandStr(6));
		
//		Date date = new Date();
//		long exp_time = date.getTime();
//		
//		System.out.println("有效时间："+exp_time);
//		
//		System.out.println(System.currentTimeMillis());
		
//		System.out.println("version=[0x" + Integer.toHexString(33685505) + "]");
		System.out.println("");
	}
}

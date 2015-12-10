package com.aspirecn.test;

import net.sf.json.JSON;
import net.sf.json.JSONArray;

import org.junit.Test;

public class Test5 {
	@Test
	 public static boolean checkEquationAndBeyond(String baseVersion, String curVersion){
			try{
				String[] baseVs=baseVersion.split("\\.");
				String[] curVs=curVersion.split("\\.");
			
				if(baseVs.length>=2&&curVs.length>=2){
					if(baseVs[0]!=null&&curVs[0]!=null){
						   //比较高位
						   if(Integer.parseInt(baseVs[0])==Integer.parseInt(curVs[0])){
							   if(baseVs[1]!=null&&curVs[1]!=null){
								   if(Integer.parseInt(baseVs[1])==Integer.parseInt(curVs[1])){
									   //完全相等
									   return true;
								   }else{
									   return Integer.parseInt(baseVs[1])<Integer.parseInt(curVs[1]);
								   }
							   }
						   }else{
							   return Integer.parseInt(baseVs[0])<Integer.parseInt(curVs[0]);
						   }
						}
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}		
			return false;
			
		}
	
	public static void json(){
		String json = "[{'schoolname':'马龙县大庄民村小学','name':'王小娟哥哥','mobile':'13701290011','xxt_userid':'74165893'},{'schoolname':'云南移动人人通学校','name':'王小娟妈妈','mobile':'13701290011','xxt_userid':null},{'schoolname':'云南移动人人通学校','name':'王小娟爸爸','mobile':'13701290011','xxt_userid':null}]";
		JSONArray jsonArray = JSONArray.fromObject(json);
		System.out.println(jsonArray);
	
	}
	 
	 public static void main(String[] args) {
//		System.out.println(checkEquationAndBeyond("2.0", "2.0"));
		 json();
	 }
	
}

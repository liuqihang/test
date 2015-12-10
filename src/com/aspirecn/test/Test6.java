package com.aspirecn.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test6 {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

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
	 
	
}

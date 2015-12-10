package com.aspirecn.test;

//import java.text.SimpleDateFormat;
//import java.util.Date;

//import java.util.Random;
//
//import org.apache.commons.lang3.StringUtils;

public class Color {
	public static void main(String[] args) {
		// String s = "123";
		// byte[] b = s.getBytes();
		// for (byte c : b) {
		// System.out.println(c);
		// }
		// byte a = 127;
		// System.out.println(a);
		// String a = "ADFaa";
		// String b = "adFAa";
		//
		// System.out.println(a.equalsIgnoreCase(b));
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		// String time = sdf.format(new Date());
		// System.out.println(time);

		// String name ="";
		// System.out.println(StringUtils.isEmpty(name));
		// int num=new Random().nextInt(5);
		// System.out.println(num);
		// System.out.println(suanfa(3));
		count(1);
		System.out.println();
	}

	// public static int suanfa(int num)
	// {
	// if(num == 1|| num == 0){
	// return num;
	// }else{
	// return num*suanfa(num - 1);
	// }
	// }

	public static void count(int n) {
		if (n < 5)
			count(n + 1);
		System.out.print(" n的值：  " + n);

	}
	
	 public static boolean checkEquationAndBeyond(String baseVersion, String curVersion){
			try{
				String[] baseVs=baseVersion.split("\\.");
				String[] curVs=curVersion.split("\\.");
			
				if(baseVs.length>=3&&curVs.length>=3){
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

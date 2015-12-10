package com.aspirecn.test;

import java.util.Map;
import java.util.Random;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test4 {
	
	public static String getRandStr(int length) {
		Random r = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append((char) (r.nextInt(127 - 32) + 32));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(getRandStr(6).concat(110289+""));
		
//		String str = "{'isCode':'0','flag':'0','isXxt':1,'result':[{'schoolname':'卓望广福测试','name':'王小娟家长','mobile':'13701290011','xxt_userid':'74165893','isadmin':0}]}";;
//		// System.out.println(getJSONFromString(str));
//		// Map map = toMap(str);
//		// System.out.println(map);
//		// Object age = map.get('age');
//		// System.out.println(age);
//		JSONObject object = JSONObject.fromObject(str);
//		String result = object.getString("result");
//		
//		JSONArray obj = JSONArray.fromObject(result);
//		System.out.println(obj);
//		
//		
//		Object[] objs = obj.toArray();
//		for (int i = 0; i < objs.length; i++) {
//			System.out.println(objs[i]);
//			JSONObject a = JSONObject.fromObject(objs[i]);
//			String name = a.getString("name");
//			System.out.println(name);
//		}
	}

}

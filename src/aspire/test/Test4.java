package aspire.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@SuppressWarnings("all")
public class Test4 {

	public static void main(String[] args) {
		// String fileName = "D:\\temp\\hello";
		// File f = new File(fileName);
		// if(!f.exists()){
		//
		// f.mkdirs();
		// System.out.println("success");
		// System.out.println(File.separator);
		// }else{
		// System.out.println("fial");
		// }

		// String []str=new String[5];
		// String
		// str3="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";//要分的
		// for(int i=0;i<5;i++){
		// str[i]=str3.substring(i*10,i*10+10);
		// System.out.println(str[i]);
		// }
		/*List<Object> list = new ArrayList<Object>();
		list.add("w");
		list.add("s");
		list.add("l");
		list.add("q");
		list.add("h");
		list.add("w");
		list.add("s");
		list.add("l");
		System.out.println(removeRepeatElement(list));*/
		
		java.util.Date date = parseDate("2015/12/08", "2015-12-08");
		System.out.println(date);
		
	}

	
	public static List<Object> removeRepeatElement(List<Object> list) {
		Set<Object> set = new HashSet();
		List<Object> newList = new ArrayList();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (set.add(obj)) {
				newList.add(obj);
			}
		}
		set.clear();
		list.clear();
		list.addAll(newList);
		newList = null;
		return list;
	}
	
	public static java.util.Date parseDate(String strDate, String pattern) {
		if (null == strDate||"".equals(strDate)) {
			return null;
		}
		java.text.SimpleDateFormat fmtDate = null;
		java.text.ParsePosition pos = new java.text.ParsePosition(0);
		fmtDate = new java.text.SimpleDateFormat(pattern);

		java.util.Date dtRet = null;
		try {
			return dtRet = fmtDate.parse(strDate, pos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dtRet;

	}
}

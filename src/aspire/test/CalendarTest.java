package aspire.test;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.time.DateUtils;

//import com.aspirecn.task.bj.YXActivityTask;
//import com.aspirecn.task.bj.YXActivityTask.UserCount;

public class CalendarTest {
	
//	public static Calendar test() {
//		
//		Calendar calendar = getLastWeek();
//		
//		return calendar;
//		
//	}
//	
//	private static Calendar getLastWeek() {
//		Calendar calendar = getCurDay();
//		calendar.add(Calendar.DAY_OF_WEEK, -7);
//		return calendar;
//	}
//	
//	private static Calendar getCurDay() {
//		Calendar cur = Calendar.getInstance();
//		cur.setTime(new Date());
//		return cur;
//	}
//	
//	private static String formatDate(Calendar calendar) {
//		return new SimpleDateFormat("yyyy-MM-dd").format(calendar
//				.getTime());
//	}

	
//	public static void main(String[] args) {
//		Calendar  cur = Calendar.getInstance();
//		cur.setTime(new Date());
//		Calendar calendar = cur;
//		calendar.add(Calendar.DAY_OF_WEEK, -7);
//		Calendar need = calendar;
//		need.add(Calendar.DAY_OF_WEEK, 1);
//		Calendar needs = need;
//		
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String time = sdf.format(needs.getTime());
//		System.out.println(time);
//		
//	}
	
	public static void main(String[] args) {
		String fileName = CalendarTest.class.getResource("/").getPath();
		System.out.println(fileName);///C:/Users/admin/workspace/test/bin/
	}
	
}

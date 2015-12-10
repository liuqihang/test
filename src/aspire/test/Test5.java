package aspire.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Test5 implements ServletContextListener {

	// @Override
	// public void contextDestroyed(ServletContextEvent sce) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public void contextInitialized(ServletContextEvent sce) {
	// // TODO Auto-generated method stub
	//
	// }

	private Timer timer = null;

	@Override
	public void contextInitialized(ServletContextEvent event) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 3); // get 和 set 的字段数字，指示一天中的小时。
		calendar.set(Calendar.MINUTE, 0); // get 和 set 的字段数字，指示一小时中的分钟。
		calendar.set(Calendar.SECOND, 0); // get 和 set 的字段数字，指示一分钟中的秒。
		Date time = calendar.getTime();
		// 创建一个新计时器，可以指定其相关的线程作为守护程序运行。如果计时器将用于安排重复的“维护活动”，则调用守护线程，在应用程序运行期间必须调用守护线程，但是该操作不应延长程序的生命周期。
		timer = new Timer(true);// 创建一个新计时器，可以指定其相关的线程作为守护程序运行。 //设置任务计划，启动和间隔时间
		timer.schedule(new contractTask(), 0, 24 * 60 * 60 * 1000);// 安排在指定的时间执行指定的任务。执行任务前的延迟时间，单位是毫秒。

	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		timer.cancel();// 终止此计时器，丢弃所有当前已安排的任务。
	}

	class contractTask extends TimerTask {
		public void run() {
			System.out.println("---------------------------------------");
		}
	}
}

// public static void main(String[] args) {
// Timer timer = new Timer();
// timer.schedule(new TimerTask() {
//
// @Override
// public void run() {
// test();
// }
// }, 2000,2000);
// }
//
//
//
// public static void test(){
// System.out.println("test..........");
// }


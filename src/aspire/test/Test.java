package aspire.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {
	
	public static final String FILE="/file.properties";
	
	public static String NAME;
	public static String ADDRESS;
	
	static{
		Properties pro = null;
		InputStream in = null;
		in = Test.class.getResourceAsStream(FILE);
		try {
			pro = new Properties();
			pro.load(in);
			NAME = pro.getProperty("API_NAME");
			ADDRESS = pro.getProperty("ADDRESS");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("名字："+NAME);
		System.out.println("地址："+ADDRESS);
	}

}

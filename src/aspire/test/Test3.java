package aspire.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test3 {
	
//	private final static String DRIVER="oracle.jdbc.driver.OracleDriver";
//	private final static String URL="jdbc:oracle:thin:@10.8.8.143:1521:cqyxt";
//	private final static String USERNAME="bjxxt";
//	private final static String PWD="bjxxt_201402";
	
	
	private final static String DRIVER="com.mysql.jdbc.Driver";
	private final static String URL="jdbc:mysql://10.8.8.143/bjapp?characterEncoding=UTF-8";
	private final static String USERNAME="bjapp_usr";
	private final static String PWD="appdev$52C";
	
	
//	oracle.driver=oracle.jdbc.driver.OracleDriver
//			oracle.url=jdbc:oracle:thin10.8.8.143:1521:cqyxt
//			oracle.username=bjxxt
//			oracle.pwd=bjxxt_201402
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection(URL, USERNAME, PWD);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}

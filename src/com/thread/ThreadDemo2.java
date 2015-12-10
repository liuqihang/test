package com.thread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThreadDemo2 {
	
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	
	private final static String DRIVER="com.mysql.jdbc.Driver";
	private final static String URL="jdbc:mysql://localhost:3306/jxt";
	private final static String USERNAME="root";
	private final static String PWD="root";
	
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
			conn = DriverManager.getConnection(URL, USERNAME, PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		Connection con = getConnection();
		System.out.println("当前线程名："+Thread.currentThread().getName()+"---"+con);
	}


}

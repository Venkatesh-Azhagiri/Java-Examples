package controller;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DBConnection {
	private static String className = null;
	private static String jdbcUrl = null;
	private static String usr = null;
	private static String pwd = null;
	

	public static Connection connect (boolean autoCommit) { // default connect() is left out intentionally, so caller knows his/her choice explicitly
		/*if (!loadConf()) return null;
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			return null;
		}*/
		try {
			System.out.println("try block***");
			 Connection conn = null;
			DriverManager.setLoginTimeout(180);
			/*String usr ="root";
			String pwd ="venkateshA";
			Connection con = DriverManager.getConnection(jdbcUrl, usr, pwd);
			System.out.println("connection example***");*/
			String userName = "root";
			String password =  "venkateshA";					
			String driver = "com.mysql.jdbc.Driver";
			String dbName = "employeedb";
			String url = "jdbc:mysql://localhost";
			className = driver;
		    //conn = DriverManager.getConnection(url+dbName,userName,password); connect = DriverManager
	         conn =  DriverManager.getConnection("jdbc:mysql://localhost/employeedb?"
	                  + "user=root&password=venkateshA");
			System.out.println("Connectedd to the database");
			conn.setAutoCommit(autoCommit);
			return conn;
		} catch (SQLException e) {			
			System.out.println("print****");
			StringWriter s = new StringWriter();
		//	PrintWriter p = new PrintWriter(s);
			 e.printStackTrace(new PrintWriter(s));
			System.out.println("Exceptionq****"+s.toString());
			return null;
		}catch (Exception e) {
			return null;			
		}
	}
	
	private static boolean loadConf() {
		String server = "localhost";
		String port   = "3306";
		String service = "MySql";
		className = "com.mysql.jdbc.Driver";
		jdbcUrl = "jdbc:mysql:" + server + ":" + port + ":" + service;
		return true;
	}

}

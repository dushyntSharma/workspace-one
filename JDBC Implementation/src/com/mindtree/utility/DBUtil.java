package com.mindtree.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String JDBCURL = "jdbc:mysql://127.0.0.1:3306/workspace";
	private static String USERNAME = "root";
	private static String PASSWORD = "9909";

	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(JDBCURL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}

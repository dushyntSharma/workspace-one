package jdbc;

import java.sql.*;
import java.sql.DriverManager;

public class SelectQuery {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/workspace", "root", "9909");
			System.out.println("Database Connceted successfully");
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from employee");
			while (res.next()) {
				System.out.println("empId : " + res.getInt(1));
				System.out.println("firstName : " + res.getString(2));
				System.out.println("lastName : " + res.getString(3));
				System.out.println("salary : " + res.getInt(4));
				System.out.println("dept : " + res.getString(5));
				System.out.println();
			}

		} catch (SQLException e2) {
			// TODO: handle exception
			System.out.println(e2.getMessage());
		}

	}

}

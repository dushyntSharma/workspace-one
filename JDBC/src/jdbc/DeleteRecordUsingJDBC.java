package jdbc;

import java.sql.*;

public class DeleteRecordUsingJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Connceted successfully");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/workspace", "root", "9909");
				System.out.println("database connceted successfully");
				Statement st = con.createStatement();
				String sql = "Delete from employee where empId > 6";
				try {
					st.execute(sql);
					System.out.println("Deleted successfully");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Not deleted");
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Database not connected");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Driver not connceted");
		}
	}

}

package jdbc;

import java.sql.*;

public class UpdateRecordUsingJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver connceted suucessfully");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/workspace", "root", "9909");
				System.out.println("Database conncetd successfully");
				Statement st = con.createStatement();
				String sql = "Update employee set firstName='Dushynt' where empId=7";
				try {
					st.executeUpdate(sql);
					System.out.println("Updated successfully");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Not updated");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Conncetion failed");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Driver not connceted");
		}
	}

}

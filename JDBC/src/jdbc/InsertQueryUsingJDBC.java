package jdbc;

import java.sql.*;

public class InsertQueryUsingJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver connected successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/workspace", "root", "9909");
			Statement st = con.createStatement();
			try {

				String sql = "INSERT INTO employee (empId,firstName,lastName,salary,department) VALUES(7,'Dush','Sharma',455655,'HR')";
				st.execute(sql);
				System.out.println("Inserted succsessfully");

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Not inserted");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Driver not connceted");
		}
	}

}

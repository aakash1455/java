package tester;

import java.sql.*;

public class TestConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test";
		try {
			// load Type IV JDBC driver class in method area
		//	Class.forName("com.mysql.jdbc.Driver");// OPTIONAL in Java SE
			// get cn
			try (Connection cn = DriverManager.getConnection(url, "root", "root")) {
				System.out.println("cn successful "+cn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

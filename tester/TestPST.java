package tester;

import static utils.DBUtils.fetchConnection;

import java.sql.*;
import java.util.Scanner;

public class TestPST {

	public static void main(String[] args) {
		String sql = "select empid,name,salary,join_date from my_emp where deptid=? and join_date > ?";
		try (Scanner sc = new Scanner(System.in);
				Connection cn = fetchConnection();
				PreparedStatement pst = cn.prepareStatement(sql);

		) {
			// set IN params
			System.out.println("Enter dept id n join date");
			pst.setString(1, sc.next());
			pst.setDate(2, Date.valueOf(sc.next()));
			try (ResultSet rst = pst.executeQuery()) {
				while (rst.next())
					System.out.printf("Emp ID %d Name %s Salary %.1f Date %s %n", rst.getInt(1), rst.getString(2),
							rst.getDouble(3), rst.getDate(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

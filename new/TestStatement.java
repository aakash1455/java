package tester;

import java.sql.*;
import static utils.DBUtils.*;

public class TestStatement {

	public static void main(String[] args) {
		String sql = "select * from my_emp order by salary";
		try (Connection cn = fetchConnection();
				Statement st = cn.createStatement();
				ResultSet rst = st.executeQuery(sql);) {
			// process RST & display dtls sorted by salary
			while (rst.next())
				System.out.printf("Emp Id %d Name %s Salary %.2f JoinDate %s %n", rst.getInt(1), rst.getString("name"),
						rst.getDouble(4), rst.getDate(6));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

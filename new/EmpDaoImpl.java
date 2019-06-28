package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import static utils.DBUtils.fetchConnection;

import pojos.Emp;

public class EmpDaoImpl implements IEmpDao 
{
	private Connection cn;
	private PreparedStatement pst1, pst2;

	public EmpDaoImpl() throws Exception 
	{
		// get db cn
		cn = fetchConnection();
		// pst
		pst1 = cn.prepareStatement("select * from my_emp where deptid=? and join_date > ?");
		String sql = "insert into my_emp values(default,?,?,?,?,?)";
		pst2 = cn.prepareStatement(sql);
		System.out.println("dao inited");
	}

	public void cleanUp() throws Exception {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();

		if (cn != null)
			cn.close();
		System.out.println("dao cleaned up");
	}

	@Override
	public List<Emp> getEmpDetails(String dept, String joinDate) throws Exception {
		ArrayList<Emp> emps = new ArrayList<>();
		// set IN params
		pst1.setString(1, dept);
		pst1.setDate(2, Date.valueOf(joinDate));
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				emps.add(new Emp(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5),
						rst.getDate(6)));
		}
		return emps;
	}

	@Override
	public String hireEmployee(Emp e) throws Exception {
		// set IN params
		pst2.setString(1, e.getName());
		pst2.setString(2, e.getAddress());
		pst2.setDouble(3, e.getSalary());
		pst2.setString(4, e.getDeptId());
		pst2.setDate(5, e.getHireDate());
		// exec
		int updateCount = pst2.executeUpdate();
		if (updateCount == 1)
			return "Emp hired successfully....";
		return "Emp hiring failed...";
	}

}

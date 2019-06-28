package dao;

import java.util.List;

import pojos.Emp;

public interface IEmpDao {
	// get emp dtls
	List<Emp> getEmpDetails(String dept, String joinDate) throws Exception;
	//hire emp
	String hireEmployee(Emp e) throws Exception;
	
}

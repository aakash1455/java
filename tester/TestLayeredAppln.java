package tester;

import java.sql.Date;
import java.util.Scanner;

import dao.EmpDaoImpl;
import pojos.Emp;

public class TestLayeredAppln {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// dao inst
			EmpDaoImpl dao = new EmpDaoImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1 :Display Emp details 2: Hire Emp 10 : Exit");
				System.out.println("Enter your option");
				try {
					switch (sc.nextInt()) {
					case 1: // display
						System.out.println("Enter dept id n join date");
						dao.getEmpDetails(sc.next(), sc.next()).forEach(System.out::println);
						break;
					case 2: // hire
						System.out.println("Enter emp dtls name adr sal dept date");
						String sts = dao.hireEmployee(
								new Emp(sc.next(), sc.next(), sc.nextDouble(), sc.next(), Date.valueOf(sc.next())));
						System.out.println(sts);
						break;
					case 10:
						dao.cleanUp();
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

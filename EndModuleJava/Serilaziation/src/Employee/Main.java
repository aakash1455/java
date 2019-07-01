package Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"shivangi",66000.00f));
		emp.add(new Employee(2,"priya",70000.00f));
		String filename="abc.txt";
		try{
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out =new ObjectOutputStream(file);
			out.writeObject(emp);
			out.close();
			file.close();
			System.out.println("done...");
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		try{
			
			FileInputStream file1=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file1);
			ArrayList<Employee> e=(ArrayList<Employee>) in.readObject();
			file1.close();
			in.close();
			System.out.println("deserlization...");
			for(Employee a:emp)
			{
				System.out.println(a.getId());
				System.out.println(a.getName());
				System.out.println(a.getSal());
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainSeialize 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
        String file="employeeData.txt";
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1, "varsha","engg",28989));
		emp.add(new Employee(2, "bhavu","ceo",25848));
		
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(emp);
		os.close();
		fos.close();
		
		System.out.println("Deserialization");
		
		FileInputStream  fin=new FileInputStream(file);
		ObjectInputStream oi=new ObjectInputStream(fin);
		emp=(ArrayList) oi.readObject();
		oi.close();
		fin.close();
		
		for(Employee e: emp)
		{
			System.out.println(e);
		}
	}

}

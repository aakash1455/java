package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		String designation;
		float sal;
		String ch;
		do
		{
			System.out.println("\n1.add\n2.display\n3.search\n4.SearchByName");
			System.out.println("\nenter choice");
			ch=sc.next();
			switch(ch)
			{
			case "1":
				System.out.println("enter id");
				
                  id=sc.nextInt();
                  System.out.println("enter name");
                  name=sc.next();
                  System.out.println("enter designation");
                  designation=sc.next();
                  System.out.println("enter salary");
                  sal=sc.nextFloat();
                  Employee e=new Employee(id,name,designation,sal);
                  emp.add(e);
                  break;
			case "2":
				for(Employee obj:emp)
				{
					
					System.out.println(obj);
				}
			break;
			case "3":
				System.out.println("enter id to search");
				id=sc.nextInt();
				for(Employee ab:emp)
				{
					if(ab.id==id)
					{
						System.out.println(ab);
					}
					else
					{
						System.out.println("not found");
					}
				  	}
				break;
			case "4":
				System.out.println("enter the name u want to search");
				name=sc.next();
				for(Employee ab:emp)
				{
					if(ab.name.equals(name))
					{
						System.out.println(ab);
					}else
					{
						System.out.println("not found");
					}
					break;
				}
				
				
				
			}
			System.out.println("do you want to...");
			ch=sc.next();
			
			
		}while(ch.equals("y") || ch.equals("Y"));
		
	}

}

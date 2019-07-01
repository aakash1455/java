package HashMap;




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MainApp {

	public static void main(String[] args) {
		Integer i=1;
		HashMap<Integer,Employee> emp=new HashMap();
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
                  emp.put(i,e);
                  i++;
                  break;
			case "2":
				for(Map.Entry m:emp.entrySet())
				{
					
					System.out.println(m.getKey()+" "+m.getValue());
				}
			break;
			case "3":
				System.out.println("enter key to search");
				Object nm=sc.nextInt();
				String flag="no";
				for(Map.Entry m:emp.entrySet())
				{
					if(m.getKey()==nm)
					{ flag="yes";
						System.out.println(m);
					}
					
				  	}
				if(flag=="no")
				{
					System.out.println("not found");
				}
				break;
//			case "4":
//				System.out.println("enter the name u want to search");
//				name=sc.next();
//				for(Employee ab:emp)
//				{
//					if(ab.name.equals(name))
//					{
//						System.out.println(ab);
//					}else
//					{
//						System.out.println("not found");
//					}
//					break;
				}
				
			
				
				
			
			System.out.println("do you want to...");
			ch=sc.next();
			
			
		}while(ch.equals("y") || ch.equals("Y"));
		

	}

}

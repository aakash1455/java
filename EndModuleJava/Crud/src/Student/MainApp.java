package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		int ch;
		String chr;
		ResultSet rs;
		Student stu=new Student();
		String qry;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try
		{
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3366/java","root","root");
			Statement stmt=con.createStatement();
			
			
			do{
				System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display");
				System.out.println("\nenter choice:");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					stu.accept();
				 qry="insert into student values(?,?,?,?)";
					PreparedStatement sm=con.prepareStatement(qry);
					sm.setInt(1,stu.getId());
				sm.setString(2, stu.getName());
				sm.setString(3, stu.getCity());
				sm.setInt(4,stu .getMarks());
				int rs1=sm.executeUpdate();
				if(rs1>0)
				{
					System.out.println("inserted successfully..");
				}else
				{
					System.out.println("not inserted");
				}
				break;
				case 2:
					System.out.println("enter the id,name,city,marks: ");
					int id=sc.nextInt();
					String name=sc.next();
					String city=sc.next();
					int marks=sc.nextInt();
					 qry="update student set name=?,city=?,marks=? where id=?";
					 PreparedStatement sm1=con.prepareStatement(qry);
					 sm1.setString(1,name);
					 sm1.setString(2, city);
					 sm1.setInt(3, marks);
					 sm1.setInt(4, id);
					 int rs2=sm1.executeUpdate();
					 if(rs2>0)
					 {
						 System.out.println("updated..");
					 }
					 else
					 {
						 System.out.println("not updated");
					 }
		
					break;
					
				case 3:
					
					System.out.println("\n enter the id that you want to  ");
					int id1=sc.nextInt();
					qry="delete from student where id=?";
					PreparedStatement stmt3=con.prepareStatement(qry);
					stmt3.setInt(1, id1);
					int rr1=stmt3.executeUpdate();
					if(rr1> 0)
					{
						System.out.println("deleted");
					}
					else
					{
						System.out.println("not deleted");
					}
					
					break;
				case 4:
					rs=stmt.executeQuery("select * from student");
					while(rs.next())
					{
						System.out.println("id="+rs.getInt(1)+"name="+rs.getString(2)+"city="+rs.getString(3)+"marks="+rs.getInt(4));
					}
					
				}System.out.println("do u want to continue:");
				chr=sc.next();
				
			}while(chr.equals("y")||chr.equals("Y"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}

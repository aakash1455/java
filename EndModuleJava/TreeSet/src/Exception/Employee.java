package Exception;

import java.util.Scanner;

public class Employee
{
 int id;
 String name;
 String designation;
 float sal;
 Scanner sc=new Scanner(System.in);
 public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String designation, float sal) {
	super();
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.sal = sal;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public float getSal() {
	return sal;
}
public void setSal(float sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", sal=" + sal + "]";
}
public void accept() 
{ 
	
	try
{
	System.out.println("enter id");
	id=sc.nextInt();
	System.out.println("enter name");
	name=sc.next();
	System.out.println("enter designation");
	designation=sc.next();
	System.out.println("enter salary");
	sal=sc.nextFloat();
	if(sal < 0)
	{
		throw new Myexception("invalid salary");
	}
	
}catch(Myexception e)
{
	System.out.println(e.getMessage());
}
//	public void display()
//	{
//		System.out.println(id+""+name+""+designation+""+sal);
//	}
	
}

}

 


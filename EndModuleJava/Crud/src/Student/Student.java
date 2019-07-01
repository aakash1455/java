package Student;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	String city;
	int marks;
	
	Scanner sc=new Scanner (System.in);
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(){
		
	}
	public Student(int id, String name, String city, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public void accept()
	{
	System.out.println("enter id");
	id=sc.nextInt();
	System.out.println("enter name");
	name=sc.next();
	System.out.println("enter city");
	city=sc.next();
	System.out.println("enter marks");
	marks=sc.nextInt();
	}
public void display()
{
	System.out.println(id+" "+name+" "+city+" "+marks);
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
}

}

package HashMap;


public class Employee {
 int id;
 String name;
 String designation;
 float sal;
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

}

 


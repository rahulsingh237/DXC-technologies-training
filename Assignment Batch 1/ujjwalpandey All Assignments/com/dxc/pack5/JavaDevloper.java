package com.dxc.pack5;

public class JavaDevloper {
private int Id;
private	String name;
private int salary;
private String role;
public JavaDevloper(int id, String name, int salary, String role) {
	super();
	this.Id = id;
	this.salary=salary;
	this.name = name;
	this.role= role;
	
}


public int getSalary() {
	return salary;
}


public int getId() {
	return Id;
}


public String getName() {
	return name;
}


public String getRole() {
	return role;
}


public int Salary(int salary) {
	return (int)(salary*1.2);
}

public String skillset()
{

	return "Id is: "+ Id+" Name is: "+name+" Salary is: "+salary+" Role is: "+role;

}

public String getrole()
{
	return role;
}
}

package com.dxc.pack5;

public class JavaArchitect extends JavaDevloper {
private int noOfProjects;
private int bonus;
public JavaArchitect(int id, String name, int salary,String role, int noOfProjects) {
	super(id, name, salary,role);
	this.noOfProjects = noOfProjects;
}
@Override
public String skillset() {
	// TODO Auto-generated method stub
	return super.skillset()+" No of Projects is:  "+noOfProjects;
}
@Override
public int Salary(int num) {
	// TODO Auto-grated method stub
	int sal = num + bonus;
	return super.Salary(sal);
}

}

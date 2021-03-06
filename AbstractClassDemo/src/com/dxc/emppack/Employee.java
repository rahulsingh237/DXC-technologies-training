package com.dxc.emppack;

public abstract class Employee {
	protected int empId;
	protected String empName;
	protected int salary;
	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public String getDetails()
	{
		return (empId+"   "+empName+"    "+salary);
	}
	protected abstract int calcNetSalary();
}

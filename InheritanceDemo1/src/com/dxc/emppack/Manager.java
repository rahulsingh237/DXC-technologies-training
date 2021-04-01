package com.dxc.emppack;
//Every manager IS A employee
public class Manager extends Employee{
	private String deptName;
	private int empCount;
	public Manager(int empId, String empName, int salary, String deptName, int empCount) {
		super(empId, empName, salary);//envoked==> for the employee class constructor
									  // constructor chaining, base class constructor is envoked 
									  // then the derived class constructor is executed
		this.deptName = deptName;
		this.empCount = empCount;
	}
	@Override
	public String getDetails()
	{
		return(super.getDetails()+"    "+deptName+"   "+empCount);
	}
	public String getDeptName() {
		return deptName;
	}
	public int getEmpCount() {
		return empCount;
	}
	
	
}

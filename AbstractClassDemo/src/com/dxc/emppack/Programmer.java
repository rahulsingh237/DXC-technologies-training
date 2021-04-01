package com.dxc.emppack;

public class Programmer extends Employee{
	private int noofproj;
	private String skillset;
	public Programmer(int empId, String empName, int salary, String skillset, int noofproj) {
		super(empId, empName, salary);
		this.noofproj = noofproj;
		this.skillset = skillset;
	}
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return (super.getDetails()+"    "+skillset+"   "+noofproj);
	}
	public int getNoofproj() {
		return noofproj;
	}
	public String getSkillset() {
		return skillset;
	}
	@Override
	public int calcNetSalary() {
		// TODO Auto-generated method stub
		return (int)(1.5*salary);
	}
	
	
}

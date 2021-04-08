package com.dxc.ppack;

public class JavaProgrammer {
	protected int emp_id;
	protected final String mainstream="Java";
	protected String name;
	public JavaProgrammer(int emp_id, String name) {
		super();
		this.emp_id = emp_id;
		this.name = name;
	}
	public String getskillset(JavaProgrammer j)
	{
		return name+" "+"has  mainstream as"+mainstream+" employee id is "+emp_id;
	}
	
	public String getName() {
		return name;
	}
	

}

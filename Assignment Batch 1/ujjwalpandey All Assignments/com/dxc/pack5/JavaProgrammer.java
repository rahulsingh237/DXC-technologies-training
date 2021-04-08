package com.dxc.pack5;

public class JavaProgrammer extends JavaDevloper {
	
	String projecttype;
	String managername;
	public JavaProgrammer(int id, String name, int salary, String role,String projecttype) {
		super(id, name, salary, role);
		this.projecttype = projecttype ;
	}
	public String getManager()
	{
	 if(projecttype == "Python")
	 {
		 return "Mrs. Lakshmi Menon";
	 }
	 else
		 if(projecttype == "Java")
		 {
			 return "Mrs. Mythili Subramaniam";
		 }
		 else
			 if(projecttype == "Cloud")
			 {
				 return "Mrs. Shree Lata";
			 }
			 else
				 return null;
	}
	@Override
	public String skillset() {
		return super.skillset()+" Project Type is: "+projecttype ;
		// TODO Auto-generated method stub
	
	}
	@Override
	public int Salary(int salary) {
		// TODO Auto-generated method stub
		salary = 2 * salary;
		return super.Salary(salary);
	}
	

}

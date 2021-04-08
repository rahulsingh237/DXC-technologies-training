package com.work;

public class JavaProgrammer {
	
	JavaProgrammer(String technologies, int experience, String designation, int salary) {
		super();
		this.technologies = technologies;
		this.experience = experience;
		this.designation = designation;
		this.salary = salary;
	}
	protected String technologies;
	private int experience;
	private String designation;
	private int salary;
	private String supportFrameworks;
	
	private String[] skillArray = new String[3];
	
	
	public void setSkillSet(String s1, String s2, String s3){
		skillArray[0] = s1;
		  skillArray[1] = s2;
		  skillArray[2] = s3;
	}
	
	public String skillSet(){
	    for(String s: skillArray){
	    	System.out.print(s+" ");
	    }
	  
		return " Support  "+technologies+" "+supportFrameworks;
	}
	
}

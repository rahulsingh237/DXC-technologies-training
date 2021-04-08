package com.work;

public class JavaArchitect extends JavaDeveloper{

	JavaArchitect(String technologies, int experience, String designation, int salary) {
		super(technologies, experience, designation, salary);
		
	}
	
	protected String otherTech;
	protected String architectures;
	
	
protected String[] skillArray = new String[3];
	
   @Override
	public void setSkillSet(String s1, String s2, String s3){
	   
	      skillArray[0] = s1;
		  skillArray[1] = s2;
		  skillArray[2] = s3;
	}
	
   @Override
	public String skillSet(){
	    for(String s: skillArray){
	    	System.out.print(s+" ");
	    }
	  
		return " "+technologies+" ";
	}

}

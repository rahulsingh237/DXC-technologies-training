package com.work;

public class JavaAccess {

	public static void main(String[] args) {
		
		JavaProgrammer obj1 = new JavaProgrammer("Java",3,"Professional",100000);
		
		obj1.setSkillSet("JSP","DependencyInjection","Hibernate");
		System.out.println("SkillSet of JavaProgrammer");
		System.out.println(obj1.skillSet());
		System.out.println();
		
		
		JavaDeveloper obj2 = new JavaDeveloper("SpringBoot",4,"Professional",150000);
		obj2.setSkillSet("SOAP","REST","OOPS");
		System.out.println("SkillSet of JavaDeveloper");

		System.out.println(obj2.skillSet());
		System.out.println();
		
		JavaArchitect obj3 = new JavaArchitect("DatabaseDesign",7,"Associate",120000);
		obj3.setSkillSet("ArchitectureComponent","BusinessIntelligence","SDLC and TOOLS");
		System.out.println("SkillSet of JavaArchitect");
        System.out.println(obj3.skillSet());
		System.out.println();
	}

}
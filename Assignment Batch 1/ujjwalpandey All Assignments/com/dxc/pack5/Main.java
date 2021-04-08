package com.dxc.pack5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaDevloper jd = new JavaDevloper(1,"ujjwal",50000,"Devloper");
		System.out.println(jd.skillset());
		System.out.println("New Salary for Java Devloper is "+jd.Salary(jd.getSalary()));
		JavaProgrammer jp = new JavaProgrammer(2,"aayush", 60000,"Programmer","Java");
        System.out.println(jp.skillset());
        System.out.println("New Salary for Java Programmer is "+jp.Salary(jp.getSalary()));
        System.out.println("The Manager alotted is "+jp.getManager());
        JavaDevloper jc = new JavaArchitect(2,"Priya",70000,"Architect",5);
        System.out.println(jc.skillset());
	}

}

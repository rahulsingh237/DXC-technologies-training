package com.dxc.mainpack;
import com.dxc.ppack.*;
public class Main {
	
	public static void main(String[] args)
	{
		JavaProgrammer j = new JavaProgrammer("Rahul", "core java");
		JavaDeveloper j1 = new JavaDeveloper("Rahul Veer", "core java", 2, 10, "docker");
		JavaArchitect j2 = new JavaArchitect("Rahul Veer Singh", "core java", 5, 20, "docker", 10, "Team Handling");
		System.out.println("Skillset of java programmer: "+j.getSkillset());
		System.out.println("Skillset of java developer: "+j1.getSkillset());
		System.out.println("Skillset of java architect: "+j2.getSkillset());
		
		System.out.println("Java Programmer: "+j);
		System.out.println("Java Developer"+j1);
		System.out.println("Java Architect"+j2);
	}
}

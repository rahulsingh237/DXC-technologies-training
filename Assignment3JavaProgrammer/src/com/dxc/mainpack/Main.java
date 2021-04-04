package com.dxc.mainpack;
import com.dxc.ppack.*;
public class Main {
	
	public static void main(String[] args)
	{
		JavaProgrammer j = new JavaProgrammer("Rahul", "core java", 5);
		JavaDeveloper j1 = new JavaDeveloper("Rahul", "Core Java, docker, oracle", 10, 1);
		JavaArchitect j2 = new JavaArchitect("Rahul","Core java, docker, oracle, team lead, leadership", 10 , 6, 5);
		
		System.out.println(j);
		System.out.println(j1);
		System.out.println(j2);
	}
}

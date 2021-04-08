package com.dxc.mpack;
import com.dxc.jpack.JavaArchitect;
import com.dxc.jpack.JavaDeveloper;
import com.dxc.jpack.JavaProgrammer;
public class Main {
	
	public static void main(String[] args)
	{
		JavaProgrammer j = new JavaProgrammer( 5,"core java");
		JavaDeveloper j1 = new JavaDeveloper("ashu", "Core Java, docker, oracle", 10, 1);
		JavaArchitect j2 = new JavaArchitect("ash","Core java", 10 , 6, 5);
		
		System.out.println(j);
		System.out.println(j1);
		System.out.println(j2);
	}
}
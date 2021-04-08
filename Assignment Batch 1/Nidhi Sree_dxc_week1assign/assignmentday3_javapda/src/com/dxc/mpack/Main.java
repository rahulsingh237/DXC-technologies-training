package com.dxc.mpack;

import com.dxc.apack.JavaArchitect;
import com.dxc.dpack.JavaDeveloper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaDeveloper j1=new JavaDeveloper(101,"Pranav",2,"Banglore","core java");
		System.out.println(j1);
		System.out.println("-------------------------------------");
		System.out.println(j1.getskillset(j1));
		
		System.out.println();
		
		JavaArchitect j2=new JavaArchitect(109,"Pranitha",3,"Chennai","Java servelets");
		System.out.println(j2);
		
		System.out.println("-------------------------------------");
		System.out.println(j2.getskillset(j2));

	}

}

package com.dxc.spack;

import java.util.Scanner;

public class Student {
	
	private int regno;
	private String name;
	private int[] scores=new int[3];
	private int totalmarks=0;
	private int perc;
	public Student(int regno, String name) {
		super();
		this.regno = regno;
		this.name = name;
	}
	public void getscore()
	{
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);
			scores[i]=sc.nextInt();
		}
	}
	public int calcTotal()
	{
		for(int i=0;i<3;i++)
		{
			totalmarks+=scores[i];
		}
		return totalmarks;
	}
	public int calcper()
	{
		perc=totalmarks/3;
		return perc;
	}
	public String grades(int perc)
	{
		if(perc>=70)
			return("Grade is first class with distinction");
		else if(perc>=60 && perc<70)
			return("Grade is first class");
		else if(perc>=50 && perc<60)
			return("Grade is second class");
		else if(perc>=40 && perc<50)
			return("passed");
		else
			return("u are failed");
	}
	public void show()
	{
		System.out.println("REGISTRATION ID IS "+regno);
		System.out.println("Student name is"+name);
		System.out.println("The marks in first subject "+scores[0]);
		System.out.println("The marks in second subect "+scores[1]);
		System.out.println("The marks in third subject "+scores[2]);
		System.out.println("your totalmarks is "+calcTotal());
		System.out.println("Your percentage is "+calcper());
		System.out.println(grades(perc));
	}
		
	}
	


	
	



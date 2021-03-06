package com.dxc.stu;

import java.util.Arrays;

public class Student {
	private String name;
	private static int regno;
	private int[] score=new int[3];
	static {
		regno=0;
	}
	public Student(String name, int[] score) {
		super();
		this.name = name;
		this.score = score;
		++regno;
	}
	
	@Override
	public String toString() {
		return "Student [" +"Registration Number"+regno+ "name=" + name + ", score=" + Arrays.toString(score)+ ", Grade="+ grade(score) +"]";
	}

	public String grade(int[] scores)
	{
		int avg = (int)((scores[0]+scores[1]+scores[2])/3);
		if(avg>70 && avg<=100) return "Passed with distinction";
		else if(avg>40 && avg<=70) return "Pass";
		else if(avg<=40 && avg>=0) return "Fail";
		else return "Invalid Marks";
	}
}

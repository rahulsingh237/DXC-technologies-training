package com.dxc.pack4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student[] sarr = new Student[3];
		Scanner s = new Scanner(System.in);
		int regId;
		String Name;
		for(int i=0;i<3;i++)
		{
		System.out.println("Enter the regId of the Student");
		regId = s.nextInt();
		System.out.println("Enter the name of the Student");
		Name=s.next();
		sarr[i] = new Student(regId, Name);
		System.out.println("Enter the marks in 3 subjects ");
		sarr[i].getscore();
		}
		for(int i=0;i<3;i++)
		{
			sarr[i].show();
		}
		
		// TODO Auto-generated method stub

	}

}

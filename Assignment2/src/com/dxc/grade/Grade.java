package com.dxc.grade;
import com.dxc.stu.*;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s = new Student[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int[] score = new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Please type your marks of 3 subjects: ");
			for(int j=0;j<3;j++)
			{
				score[j]=sc.nextInt();
			}
			s[i] = new Student(name,score);
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(s[i]);
		}
		sc.close();
	}
}

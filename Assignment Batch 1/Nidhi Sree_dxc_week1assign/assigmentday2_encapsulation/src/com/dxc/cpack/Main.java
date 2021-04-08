package com.dxc.cpack;

import com.dxc.spack.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s[]=new Student[3];
		s[0]=new Student(101,"Nithya",90,85,95);
		s[1]=new Student(102,"Harika",25,30,50);
		s[2]=new Student(103,"Pranav",70,69,40);
		for(int i=0;i<3;i++)
		{
			System.out.println(s[i].calculate_score(s[i]));
		}

	}

}

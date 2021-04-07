package com.dxc.spack;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(1,"Jalli",80));
		slist.add(new Student(2,"Patil",75));
		slist.add(new Student(3,"Singh",80));
		slist.add(new Student(4,"Goyal",70));
		
		Collections.sort(slist);
		for(Student s: slist)
		{
			System.out.println(s);
		}
	}
}

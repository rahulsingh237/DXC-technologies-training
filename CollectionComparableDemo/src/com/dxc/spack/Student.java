package com.dxc.spack;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	//s1.compareTo(s2)
	@Override
	public int compareTo(Student std) {
		// TODO Auto-generated method stub
		if(marks>std.marks)
			return 1;
			else
				if(marks == std.marks)
				{
					return(name.compareTo(std.name));
				}
				else
				{
					return -1;
				}
		
		
	}
	
}

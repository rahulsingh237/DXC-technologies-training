package com.dxc.spack;

public class Student {
	private int regno;
	private String name;
	private int maths_score;
	private int physics_score;
	private int chemistry_score;
	public Student(int regno, String name, int maths_score, int physics_score, int chemistry_score) {
		super();
		this.regno = regno;
		this.name = name;
		this.maths_score = maths_score;
		this.physics_score = physics_score;
		this.chemistry_score = chemistry_score;
	}
	
	public String calculate_score(Student s)
	{
		int sum=s.maths_score+s.physics_score+s.chemistry_score;
		int percentage=(sum/3);
		System.out.println("your percentage is "+percentage+"%");
		if(percentage>=75)
			return s.name+" "+"you have passed with distinction!!!";
		else if(percentage>=40)
			return s.name+" "+"you have passed!!";
		else
			return s.name+" "+"sorry!! you have failed";	
	}

}

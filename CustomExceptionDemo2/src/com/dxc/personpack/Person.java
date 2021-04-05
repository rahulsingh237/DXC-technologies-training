package com.dxc.personpack;

import com.dxc.exceptionpack.InvalidAgeException;

public class Person {
	private int ssn;
	private int age;
	public Person(int ssn, int age) {
		super();
		this.ssn = ssn;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", age=" + age + "]";
	}
	public String getLicense() throws InvalidAgeException
	{
		if(age<=18)
			throw new InvalidAgeException("Young master, you're not eligible.");
		else 
			if((age>18)&&(age<=75))
				return "congrats!! you're eligible";
			else
				throw new InvalidAgeException("Senior citizen, you're not eligible.");
	}
	
}

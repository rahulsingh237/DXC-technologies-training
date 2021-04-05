package com.dxc.mainpack;

import com.dxc.exceptionpack.InvalidAgeException;
import com.dxc.personpack.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(1000,35);
		try {
			System.out.println(p.getLicense());
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println(p);
	}

}

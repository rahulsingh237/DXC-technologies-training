package com.dxc.pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList<Integer> i1 = new ArrayList<Integer>(); i1.add(12); i1.add(22);
		 * i1.add(12); i1.add(32); System.out.println(i1);
		 * 
		 * ArrayList<String> strarr = new ArrayList<String>();
		 * 
		 * strarr.add("abc"); strarr.add("Meera"); strarr.add("aditi");
		 * strarr.add("srishti"); strarr.add(1,"Rahul"); strarr.remove(0);
		 * strarr.remove(1);
		 * 
		 * System.out.println(strarr);
		 * 
		 * ArrayList<String> subarr = new ArrayList<String>(); subarr.add("one");
		 * subarr.add("Two"); subarr.add("Three"); strarr.addAll(1,subarr);
		 * System.out.println(strarr); System.out.println(strarr.get(2));
		 * 
		 * for (String str:strarr) { System.out.println(str); }
		 */
		ArrayList<Person> parr = new ArrayList<Person>();
		parr.add(new Person(100,"Rahul"));
		parr.add(new Person(200,"Aditi"));
		
		Iterator<Person> pit = parr.iterator();
		while(pit.hasNext())
		{
			System.out.println(pit.next());
		}
	}

}

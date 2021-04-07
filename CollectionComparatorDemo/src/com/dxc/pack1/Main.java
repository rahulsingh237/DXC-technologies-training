package com.dxc.pack1;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		ArrayList<Person> plist =new ArrayList<Person>();
		
		plist.add(new Person(100,"Ravi",45));
		plist.add(new Person(200,"Ramesh",25));
		plist.add(new Person(300,"Raghu",45));
		plist.add(new Person(400,"Radha",65));
		plist.add(new Person(500,"Rolli",30));
		
		Collections.sort(plist,new NameComparator());
		
		for(Person p:plist)
		{
			System.out.println(p);
		}
	}
}

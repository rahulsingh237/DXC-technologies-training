package com.dxc.pack1;
import java.util.*;
public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return (o1.getpName().compareTo(o2.getpName()));
	}

}

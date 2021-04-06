package com.dxc.pack1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new HashSet();
		s.add(1); //autoboxed
		s.add(12.5);
		s.add("xxx");
		s.add(null);
		System.out.println(s);
		
		Set<String> strs = new HashSet<String>();
		strs.add("xxx");
		strs.add("zzz");
		strs.add("yyy");
		System.out.println(strs);
		
		//linkedhashset
		
		Set<String> ls = new LinkedHashSet<String>();
		ls.add("xxx");
		ls.add("yyy");
		ls.add("zzz");
		System.out.println(ls);
		
		//to convert arraylist to set
		//Set<ArrayList> arraySet = new LinkedHashSet<ArrayList>();
		
		//treeset --> sortedset
		
		Set<String> ts =  new TreeSet<String>();
		ts.add("abc");
		ts.add("zzz");
		ts.add("xxx");
		System.out.println(ts);

	}

}

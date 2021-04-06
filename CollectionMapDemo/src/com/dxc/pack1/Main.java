package com.dxc.pack1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//<Key,value>
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(100, "Aditi");
		hm.put(200, "Rahul");
		hm.put(300, "Srishti");
		hm.put(400, null);
		hm.put(500, null);
		hm.put(null, null);
		hm.put(450, "Motu");
		//hm.put(200, "Manisha"); //no duplicate values allowed
		//System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		for (Integer i:hm.keySet())
		{
			System.out.println(i+"  "+hm.get(i));
		}
		System.out.println("*********************");
		Map<Integer,String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(100, "Anu");
		lhm.put(100, "Aditi");
		lhm.put(200, "Rahul");
		lhm.put(300, "Srishti");
		lhm.put(400, null);
		lhm.put(500, null);
		lhm.put(null, null);
		lhm.put(450, "Motu");
		
		for (Integer i:lhm.keySet())
		{
			System.out.println(i+"  "+lhm.get(i));
		}
		
		System.out.println("**********************");
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("Karnataka", "Banglore");
		tm.put("Tamil Nadu", "chennai");
		tm.put("Maharashtra", "Mumbai");
		tm.put("haryana", "Chandigarh");
		//tm.put(null, null);
		for (String i:tm.keySet())
		{
			System.out.println(i+"  "+tm.get(i));
		}	
	}

}

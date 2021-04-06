package com.dxc.pack1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("Archana");
		v.addElement("Rahul");
		v.addElement("Harsha");
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}

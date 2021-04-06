package com.dxc.pack1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		
		q.add("Java");
		q.add("JS");
		q.add("HTML");
		q.add(".net");
		//if queue is empty remove() will throw exception
		//System.out.println("remove element: "+q.remove());
		//if queue id empty poll() returns null
		//System.out.println("remove element: "+q.poll());
		
		System.out.println("retrive element: "+q.element());
	}

}

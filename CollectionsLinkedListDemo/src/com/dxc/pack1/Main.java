package com.dxc.pack1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("orange");
		l1.add("apple");
		l1.add("banana");
		l1.add("grapes");
		l1.add("apple");
		
		System.out.println("no.of elements = "+l1.size());
		System.out.println("Is Linked List empty: "+l1.isEmpty());
		System.out.println("Does linkedlist contain grapes: "+l1.contains("grapes"));
		
		// traverse through linkedlist
		
		ListIterator<String> litr = l1.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+"  ");
		}
		System.out.println();
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous()+"  ");
		}
	
		List<String> l2 = new LinkedList<String>();
		l2.addAll(l1);
//		while(litr.hasNext())
//		{
//			System.out.print(litr.next());
//		}
		System.out.println();
		Collections.reverse(l2);
		System.out.println(l2);
		
		List<String> sublist = l2.subList(1, 4);
		System.out.println(sublist);
		
		Collections.shuffle(l2);
		System.out.println(l2);
	}
	
}

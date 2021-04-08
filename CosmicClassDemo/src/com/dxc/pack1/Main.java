package com.dxc.pack1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate ob1 = new MyDate(8,4,2021);
		MyDate ob2 = new MyDate(8,4,2021);
		System.out.println(ob1.hashCode());
//		System.out.println(ob1);
		System.out.println(ob2.hashCode());
		System.out.println(ob1.equals(ob2));
	}

}

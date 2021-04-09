package com.dxc.pack1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<String,String> mob1 = new Test<String, String>("Good", "Day");
		System.out.println(mob1);
		
		Test<Integer,String> mob2 = new Test<Integer, String>(10, "Rahul");
		System.out.println(mob2);
	}

}

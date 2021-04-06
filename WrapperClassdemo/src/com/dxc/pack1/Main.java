package com.dxc.pack1;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		int i = 10;
		Integer iob1 = new Integer(i);
		System.out.println(iob1);
		String str = "15";
		Integer iob2 = new Integer(str);
		System.out.println(iob2);
		
		int ui1 = iob1;
		int ui2 = iob2;
		
		System.out.println(ui1 + "  " + ui2);
		
		Integer iob3 = 1000;
		System.out.println(iob3);
		
		System.out.println(Integer.parseInt("123"));
		
		System.out.println(iob1.toString());
		
		int i1 = Integer.valueOf(iob1);
	}
}

package com.dxc.main;

import com.dxc.apack.average;
import com.dxc.utility.sumation;

public class Main {

	public static void main(String[] args) {
		sumation s = new sumation();
		System.out.println("Sum int: "+s.add(10, 15));
		System.out.println("Sum Float: "+s.add(10.5F, 15.3F));
		System.out.println("Three Sum: "+s.add(10,16L,12.5D));
		average aob=new average();
		System.out.println(aob.avg(1,4,6,8));
	}

}

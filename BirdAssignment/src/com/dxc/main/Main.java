package com.dxc.main;

import com.dxc.abs.Bird;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		System.out.println(b.buildNest());
		System.out.println(b.takeOff());
		System.out.println(b.fly());
		System.out.println(b.land());
		System.out.println(b.eat());
		System.out.println(b.layeggs());
		System.out.println(b.sleep());
	}

}

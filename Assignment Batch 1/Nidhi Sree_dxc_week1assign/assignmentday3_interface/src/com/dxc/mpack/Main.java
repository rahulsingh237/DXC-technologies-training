package com.dxc.mpack;

import com.dxc.cpack.Bird;
import com.dxc.cpack.animal;

public class Main {
	public static void main(String args[])
	{
		Bird b=new Bird(2,"grains",6,"Green","Parrot","Banglore","Madanapalle");
		System.out.println(b);
		System.out.println(b.takeoff(b));
		System.out.println(b.fly());
		System.out.println(b.land(b));
		System.out.println(b.eat());
		System.out.println(b.sleep());
		
		
	}

}

package com.dxc.main;
import com.dxc.vehicle.*;
public class Main {
	public static void main(String[] args)
	{
		Vehicle v = new Vehicle();
		Vehicle v1 = new Vehicle("DL 8 AB 9023",4,4,35,"Blue");
		System.out.println(v1);
	}
}

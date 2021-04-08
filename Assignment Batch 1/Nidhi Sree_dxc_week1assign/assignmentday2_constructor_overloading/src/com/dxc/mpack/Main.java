package com.dxc.mpack;

import com.dxc.vpack.vehicle;

public class Main {
	public static void main(String args[]) 
	{
		vehicle v[]=new vehicle[4];
		v[0]=new vehicle("KA03-2563",6,4);
		v[1]=new vehicle("AP09-4567",6,4,25,"white");
		v[2]=new vehicle("TN07-3898",2,2,10);
		v[3]=new vehicle("KA09-8982",6);
		System.out.println("The specifications you have not mentioned are assigned either to 0 or null");
		for(vehicle varr:v)
		{
			System.out.println(varr);
		}
	}

}

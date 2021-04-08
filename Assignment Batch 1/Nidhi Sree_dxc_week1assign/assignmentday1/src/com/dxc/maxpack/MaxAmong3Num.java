package com.dxc.maxpack;

import java.util.Scanner;

public class MaxAmong3Num {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int max=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Max among 3 numbers is "+max);
		sc.close();
	}

}

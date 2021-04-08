package com.dxc.pack2;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number you want to enter");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		armstrong(num);
	}
public static int capture(int num)
{   int count=0;
	while(num !=0)
	{ 
	 num=num/10;
	 count++;
	}
	return count;
}
public static void armstrong(int num)
{   int n=num;
	int rem;
	int rev=0;
	int count = capture(num);
	while(num !=0)
	{
	rem = num %10;
	rev+= Math.pow(rem,count);
	num=num/10;
	}
	if(rev==n)
		System.out.println(" It is an Armstrong number");
	else
		System.out.println(" Not an Armstrong no");
}
}

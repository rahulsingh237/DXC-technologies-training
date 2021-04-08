package com.dxc.assignmentday1;

import java.util.Scanner;

public class prime {
	public static void main(String args[])
	{
		int n;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
		
		
	}

}

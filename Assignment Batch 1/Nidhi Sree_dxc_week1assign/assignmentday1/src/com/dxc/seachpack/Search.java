package com.dxc.seachpack;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		boolean found=false;
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int key=sc.nextInt();
		for(int ele:a)
		{
			if(ele==key)
			{
				found=true;
			}
		}
		if(found)
		{
			System.out.println(key+" element found in array");
		}
		else
		{
			System.out.println(key+" element not found");
		}
		sc.close();
	}

}

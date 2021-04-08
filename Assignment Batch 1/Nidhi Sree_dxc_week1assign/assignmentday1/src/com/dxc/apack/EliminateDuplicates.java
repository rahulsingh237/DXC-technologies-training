package com.dxc.apack;

import java.util.Scanner;

public class EliminateDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the array elements in sorted order");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int arr[]=new int[n];
			int k=0;
			for(int i=0;i<n-1;i++)
			{
				if(a[i]!=a[i+1])
					arr[k++]=a[i];
			}	
			System.out.println("ARRAY ELEMENTS AFTER REMOVING DUPLICATES");
			for(int ele:arr)
			{
				if(ele!=0)
					System.out.println(ele);
			}
		

	}

}

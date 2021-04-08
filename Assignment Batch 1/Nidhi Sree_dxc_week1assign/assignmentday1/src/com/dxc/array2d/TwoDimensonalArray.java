package com.dxc.array2d;

import java.util.Scanner;

public class TwoDimensonalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows and columns: ");
		n=sc.nextInt();
		m=sc.nextInt();
		System.out.println("enter the elements");
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array elements you have entered are :");
		for(int arr[]:a)
		{
			for(int ele:arr)
			{
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		sc.close();
		

	}

}

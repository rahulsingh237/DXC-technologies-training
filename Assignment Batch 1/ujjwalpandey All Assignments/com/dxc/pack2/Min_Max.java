package com.dxc.pack2;


import java.util.Scanner;

public class Min_Max {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
System.out.println(" enter the array ");
Scanner sc = new Scanner(System.in);
for(int i=0;i<4;i++)
{
arr[i]=sc.nextInt();	
}
max(arr);
min(arr);
System.out.println("enter the elemant you want to search now");
int num=sc.nextInt();
search(arr, num);
sc.close();
	}
	
	public static void max(int[] array)
	{
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		System.out.println("The maximum elemant is "+max);
		
	}
	public static void min(int[] arr)
	{ int min=arr[0];
	for(int i=0;i<arr.length;i++)
		{
			if(min > arr[i])
				min=arr[i];
		}
				System.out.println("The minimum elemant is " +min);
	}
	public static void search(int[] array, int num)
	{ int flag=1;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				System.out.println("Elemant found at position: "+(i+1));
		 flag=0;
				break;
			}
			
		}
		if(flag==1)
		System.out.println("Elemant not found");
	}
}

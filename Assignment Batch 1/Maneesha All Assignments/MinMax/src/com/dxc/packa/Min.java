package com.dxc.packa;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,4,5,6};
		int min,max=0;
		int i=0;
		min=arr[i];
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
		}
		System.out.println(min+" "+max);

	}

}

package com.dxc.pack1;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,6,2,1};
		int sum=0;
		/*
		 * for(int i=0;i<arr.length;i++) { sum+=Math.pow(arr[i], i); }
		 * System.out.println(sum); String[] sarr=
		 * {"Harleen","Hema","Lochana","Meghana"};
		 * 
		 * //Enhanced for loop for(String str:sarr) { System.out.println(str); }
		 */
		
		int f=sumArray(arr);
		System.out.println(f);
		updatearr(arr);
		int numarr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
	}
	public static int sumArray(int[] arr)
	{
		int x=0;
		for(int y:arr)
		{
			x+=y;
		}
		return x;
	}
	public static void updatearr(int[] arr2)
	{
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]+=10;
		}
	}
}

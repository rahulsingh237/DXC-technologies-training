package com.dxc.pack1;

import java.util.Arrays;

public class assignmentday1 {
	//To find the sum of all elements in an array
	public static int sumArray(int[] arr)
	{
		int x=0;
		for(int y:arr)
		{
			x+=y;
		}
		return x;
	}
	//Practicing implicit and explicit data conversions
	//and 
	//how to nest the conditional operator
	public static int conditionalOp(int n1,int n2, double n3)
	{
		double x=n1; //implicit data type conversion
		System.out.println("value after implicit type casting: "+x);
		return (int)((((n1>n2)?n1:n2)>n3)?((n1>n2)?n1:n2):n3); //one line conditional operator and explicit data type conversion;
	}
	//To search an element in an array 
	public static boolean search(int[] a, int b)
	{
		for(int x:a)
		{
			if(x==b) return true;
		}
		return false;
	}
	//accessing and printing two dimensional array elements
	 public static void print1D(int[] arr) {
	        for (int ele : arr) {
	            System.out.print(ele + " ");
	        }
	        System.out.println();
	    }

    public static void print2D(int[][] arr) {
        for (int[] ar : arr) {
            print1D(ar);
        }
    }
    
    //To eliminate the duplicates in an array
    public static int[][] remDupli(int[] a)
    {
    	Arrays.sort(a);
    	print1D(a);
    	int[] b=new int[a.length];
    	int j=0;
    	for(int i=0;i<a.length-1;i++)
    	{
    		if(a[i]==a[i+1]) continue;
    		else {
    			b[j]=a[i];
    			if(i+1==a.length-1 && b[j]!=a[i+1])
    			{
    				j++;
    				b[j]=a[i+1];
    			}
    			j++;
    		}
    	}
    	//print1D(b);
    	int[][] x=new int[2][];
    	x[0]=b;
    	int[] y= {j};
    	x[1]= y;
    	return x;
    }
    
    //To find the min and max element in an array
    public static int[] minmax(int[] a)
    {
    	int[] b= {0,0};
    	int min=(int)1e9;
    	int max=(int)-1e9;
    	for(int i=0;i<a.length;i++)
    	{
    		min=Math.min(min, a[i]);
    		max=Math.max(max, a[i]);
    	}
    	b[0]=min;
    	b[1]=max;
    	return b;
    }
    
	public static void main(String[] args) {
		int[] arr= {1,4,5,8,8,0,0,9};
		System.out.println("Sum of array elements: " + sumArray(arr));
		System.out.println();
		
		int a=5,b=20;
		double c=2.55;
		System.out.println("Largest element using nested conditional operator: "+conditionalOp(a,b,c));
		System.out.println();
		
		int target=9;
		System.out.println("Linear search to find if "+target+" is present or not: "+search(arr,target));
		System.out.println();
		
		int[][] arr2D= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print2D(arr2D);
		System.out.println();
		
		int[][] e = remDupli(arr);
		System.out.println("Array after removing duplicates:");
		for(int i=0;i<e[1][0];i++)
		{
			System.out.print(e[0][i]+" ");
		}
		System.out.println();
		System.out.println();
		
		int[] d=minmax(arr);
		System.out.println("Minimum:"+d[0]+" Maximum:"+d[1]);
		
	}

}

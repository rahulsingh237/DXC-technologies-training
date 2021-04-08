package com.dxc.pack2;

import java.util.Scanner;

public class Main {
		 
	    public static int duplicates(int a[], int num)
	    {
	       
	  
	        int[] temp = new int[num];
	        int j = 0;
	 
	        for (int i = 0; i < num - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                temp[j++] = a[i];
	            }
	        }
	 
	        temp[j++] = a[num - 1];
	 
	        for (int i = 0; i < j; i++) {
	            a[i] = temp[i];
	        }
	 
	        return j;
	    }
	    public static void main(String[] args)
	    { Scanner sc = new Scanner(System.in);
	        int a[] = new int[5];
	        System.out.println(" Enter the array: ");
	        for(int i=0;i<5;i++)
	        {
	        	a[i] = sc.nextInt();
	        }
	        	
	        int n = a.length;
	 
	        int num = duplicates(a, n);
	 
	        for (int i = 0; i < num; i++)
	            System.out.print(a[i] + " ");
	    }
	}

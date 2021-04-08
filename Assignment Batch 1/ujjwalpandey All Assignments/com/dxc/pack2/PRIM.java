package com.dxc.pack2;

import java.util.Scanner;

public class PRIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1, s2, flag = 0, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println ("Enter the lower limit :"); 
        s1 = s.nextInt();
        System.out.println ("Enter the upper limit :"); 
        s2 = s.nextInt();
        System.out.println ("The prime numbers in the range are are :");
       while(s1<=s2)
       {
    	   for(i=2;i<s1;i++)
    	   {
    		   if(s1%i==0)
    		   {
    			   flag=0;
    			   break;
    		   }
    		   else
    		   {
    			   flag=1;
    		   }
    	   }
    	   if(flag==1)
    	   {
    		   System.out.println(i);
    	   }
    	   s1++;
       }
	}

}

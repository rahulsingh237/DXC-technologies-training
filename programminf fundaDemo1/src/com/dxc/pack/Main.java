package com.dxc.pack;
import java.util.Scanner;
public class Main {
	public static long factorial(int num)
	{
		long fact=1;
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		 // TODO Auto-generated method stub //int a=15,b=10,c=20; 
			/*
			 * Scanner sc=new Scanner(System.in); int n1=sc.nextInt(); int n2=sc.nextInt();
			 * double n3=sc.nextDouble(); //System.out.println(n1+n2+n3);
			 * 
			 * int lar1=(n1>n2)?n1:n2; int lar2=(int)((lar1>n3)?lar1:n3);
			 * System.out.println(lar2); //class assignment---------------
			 * lar2=(int)((((n1>n2)?n1:n2)>n3)?((n1>n2)?n1:n2):n3);
			 * System.out.println(lar2); //------------------------------- //sc.close();
			 */		 
			/*
			 * int num=1234; int revnum=0; while(num!=0) { int x=num%10;
			 * revnum=x+(10*revnum); num=num/10; } System.out.println(revnum);
			 */
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		System.out.println(factorial(n1));
	}
	

}

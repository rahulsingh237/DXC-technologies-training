package com.dxc.pack2;
import java.lang.Math;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int flag=0;
		System.out.println(" enter the elemant");
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1)
			System.out.println(" neither prime nor composite number");
		else
			if(num==2)
				System.out.println(" It is a prime number");
			else
			{
				for(int i=2;i<=num/2;i++)
					
				{
					if(num%i==0)
						{System.out.println("Number is not prime");
			             flag=1;
			             break;
						}
				}
			}
			
		if(flag!=1)
			System.out.println("Number is Prime");
			
	System.out.println(" Enter range of numbers");
	int num1 = sc.nextInt();
	int num2= sc.nextInt();
	primerange(num1,num2);// TODO Auto-generated method stub
	

	}
	
public static void primerange(int num1, int num2)
{  int flag=0;
	for(int i=num1;i<=num2;i++)
	{  
		for(int j=2;j<i;j++)
		{
			if(i%j ==0)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
			
		}
	
		if(flag==0)
		{
			System.out.println(i);
		}
	}	
	}
		
}
	
	


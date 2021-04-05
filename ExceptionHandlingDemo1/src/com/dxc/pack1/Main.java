package com.dxc.pack1;

public class Main {

	public static void main(String[] args) {
		/*
		 * String str1 = args[0]; String str2 = args[1];
		 * System.out.println(str1+"  "+str2);
		 */
		int n1=0,n2=0;
		double res=0.0;
		try {
		 n1 = Integer.parseInt(args[0]);
		 n2 = Integer.parseInt(args[1]);
		//double n3 = Double.parseDouble(args[2]);
		 res=n1/n2;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error");
			e.printStackTrace();//prints the whole error
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Exception for zero division"+e1.getMessage());
			e1.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Exception due to array index out of bound");
			e2.printStackTrace();
		}
		finally // this block will work even if exception is thrown or not
		{
			System.out.println("Finally block is running rn: "+res);
		}
		System.out.println("Bye Bye!!!");
	}

}

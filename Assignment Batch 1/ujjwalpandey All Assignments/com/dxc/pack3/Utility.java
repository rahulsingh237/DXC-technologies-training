package com.dxc.pack3;

public class Utility {
	
public int FormatNumber(int num)
{
	System.out.println("You are in Integer Function");
	return(num);
}
public double FormatNumber(double num)
{ 
	System.out.println("You are in Double Function");
	return(num);
}
public int FormatNumber(String num)
{
	System.out.println("You are in String Function");
	return(Integer.parseInt(num));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		Utility hs = new Utility();
		System.out.format("%.2f\n", hs.FormatNumber(500.9989F));
		System.out.format("%.3f\n", hs.FormatNumber(89.9934));
		System.out.format("%.3f\n",(double)(hs.FormatNumber("550")));
	}

}

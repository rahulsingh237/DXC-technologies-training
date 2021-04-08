package com.dxc.upack;

public class utility {
	
	public String formatnumber(float num)
	{
		return String.format("%.2f",num);
	} 
	public String formatnumber(double num)
	{
		return String.format("%.3f", num);
	}
	public String formatnumber(String num)
	{
		return String.format("%.3f", Double.parseDouble(num));
	}

}

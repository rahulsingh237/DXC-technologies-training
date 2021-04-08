package com.dxc.spack;

public class subclass {
		
		public String formatNumber(float n)
		{
			 return String.format("%.2f", n);
		}
		public String formatNumber(double n)
		{
			return String.format("%.3f",n);
		}
		public String formatNumber(String n)
		{
			double x = Double.valueOf(n);
			String s = String.format("%3f",x);
			return s.replaceAll("\\.?0*$", "");
		}
	}
		





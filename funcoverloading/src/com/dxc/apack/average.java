package com.dxc.apack;

public class average {
	public int avg(int ...nums)
	{
		int sum=0;
		for(int a:nums)
		{
			sum+=a;
		}
		return (sum/nums.length);
	}
}

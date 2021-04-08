package com.dxc.mathpack;

public class MathOperation {
	private int i = 0;
	public synchronized void add(int num)
	{
		i+=num;
		System.out.println("Value of i after add: "+i);
	}
	public synchronized void sub(int num)
	{
		i-=num;
		System.out.println("Value of i after sub: "+i);
	}
}

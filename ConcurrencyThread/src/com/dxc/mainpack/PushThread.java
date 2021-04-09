package com.dxc.mainpack;

public class PushThread implements Runnable
{
	
	private MyStack theStack;
	private int num;
	private static int counter = 1;
	
	
	public PushThread(MyStack s){
		this.theStack = s;
		num = counter++;
	}
	
	@Override
	public void run() {
		char c ;
		for(int  i= 0;i<50;i++){
		c = (char)(Math.random()*26+'A');
		theStack.push(c);
		System.out.println("PushThread"+num +" : pushed character "+c);
	try {
		Thread.sleep((int)Math.random()*300);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		}
	}



}

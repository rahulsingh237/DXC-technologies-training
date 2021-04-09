package com.dxc.mainpack;

public class PopThread implements Runnable{
	private MyStack theStack;
	private int num;
	private static int counter = 1;
	
	
	public PopThread(MyStack s){
		this.theStack = s;
		num = counter++;
	}
	
	@Override
	public void run() {
		
		for(int i= 0;i<50;i++){
		
		System.out.println("Pop Thread"+ num +" : pop character  "+theStack.pop());
		try {
			Thread.sleep((int)Math.random()*300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

}

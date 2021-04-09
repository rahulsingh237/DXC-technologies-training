package com.dxc.mainpack;

public class Main {

	public static void main(String[] args) {
		MyStack mystack = new MyStack();
		
		PushThread p1 = new PushThread(mystack);
		
		Thread tp1 = new Thread(p1);
		tp1.start();
		
		PushThread p2 = new PushThread(mystack);
		Thread tp2 = new Thread(p2);
		tp2.start();
		
		
		PushThread p3 = new PushThread(mystack);
		Thread tp3= new Thread(p3);
		tp3.start();
		
		
		
		PopThread pop1= new PopThread(mystack);
		Thread tpop1= new Thread(pop1);
		tpop1.start();
		
		
		PopThread pop2= new PopThread(mystack);
		Thread tpop2= new Thread(pop2);
		tpop2.start();
		
		
		
		PopThread pop3= new PopThread(mystack);
		Thread tpop3= new Thread(pop3);
		tpop3.start();

	}

}

package com.dxc.tpack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadClass tob1 = new ThreadClass();
		
		Thread t1 = new Thread(tob1);
		t1.setName("thread1");
//		System.out.println(t1.isAlive());
		System.out.println(t1.getName());
		t1.setPriority(9);
		System.out.println(t1.getPriority());
		t1.start();
		
		
		
		
		Thread t2 = new Thread(tob1);
		t2.setName("thread2");
//		System.out.println(t1.isAlive());
//		System.out.println(t1.getName());
		t2.setPriority(5);
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(t2.getPriority());
		
		
		Thread t3 = new Thread(tob1);
		t3.setName("thread3");
//		System.out.println(t1.isAlive());
		System.out.println(t1.getName());
		t3.setPriority(5);
		t3.yield();
		t3.start();
		//		System.out.println(t3.getPriority());
		
	}

}
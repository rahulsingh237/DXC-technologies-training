package com.dxc.mainpack;

import com.dxc.tpack.ThreadClass1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass1 tob1 = new ThreadClass1();
		Thread t1 = new Thread(tob1); //new statement of thread
		
		t1.setName("Thread1");
		
		//to go to runnable state
		t1.start();
		//to run the thread, run method is going to be executed
		
	}
}

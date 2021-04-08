package com.dxc.tpack;

public class ThreadClass implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
}
}
}
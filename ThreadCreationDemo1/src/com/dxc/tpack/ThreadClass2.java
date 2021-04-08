package com.dxc.tpack;

public class ThreadClass2 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}
}

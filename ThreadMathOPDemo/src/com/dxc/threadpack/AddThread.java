package com.dxc.threadpack;

import com.dxc.mathpack.MathOperation;

public class AddThread implements Runnable {
	private MathOperation op;
	private Thread t;
	public AddThread(MathOperation op, String threadname)
	{
		this.op=op;
		this.t=new Thread(this);
		t.setName(threadname);
		t.start();
	}
	@Override
	public void run() {
		op.add(10);
	}

}

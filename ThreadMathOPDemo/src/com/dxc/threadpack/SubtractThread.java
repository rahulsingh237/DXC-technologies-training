package com.dxc.threadpack;

import com.dxc.mathpack.MathOperation;

public class SubtractThread implements Runnable{
	private MathOperation op;
	private Thread t;
	
	public SubtractThread(MathOperation op, String threadname)
	{
		this.op=op;
		this.t=new Thread(this);
		t.setName(threadname);
		t.start();
	}
	@Override
	public void run() {
		op.sub(10);
	}

}

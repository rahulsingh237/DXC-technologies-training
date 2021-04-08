package com.dxc.mainpack;

import com.dxc.mathpack.MathOperation;
import com.dxc.threadpack.AddThread;
import com.dxc.threadpack.SubtractThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation mob1 = new MathOperation();
		//MathOperation mob2 = new MathOperation();
		AddThread t1 = new AddThread(mob1,"Thread1");
		AddThread t2 = new AddThread(mob1,"Thread2");
		AddThread t3 = new AddThread(mob1,"Thread3");
		SubtractThread t4 = new SubtractThread(mob1, "Thread4");
		SubtractThread t5 = new SubtractThread(mob1, "Thread5");
		SubtractThread t6 = new SubtractThread(mob1, "Thread6");
	}

}

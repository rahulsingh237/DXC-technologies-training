package com.dxc.mainpack;

import com.dxc.emppack.Employee;
import com.dxc.exceptionpack.InsufficientLeaveException;

public class Main {
	public static void main(String[] args)
	{
		Employee emp = new Employee(1000,12);
		try {
			System.out.println(emp.applyLeave(20));
		} catch (InsufficientLeaveException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}

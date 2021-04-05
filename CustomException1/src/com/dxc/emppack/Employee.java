package com.dxc.emppack;

import com.dxc.exceptionpack.InsufficientLeaveException;

public class Employee {
	private int eId;
	private int balLeave;
	
	public Employee(int eId, int balLeave) {
		super();
		this.eId = eId;
		this.balLeave = balLeave;
	}
	public String applyLeave(int appliedLeave) throws InsufficientLeaveException 
	{
		if(balLeave < appliedLeave)
		{
			throw new InsufficientLeaveException("Leave not sanctioned");
		}else {
			balLeave-=appliedLeave;
			return "Leave Sanctioned";
		}
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", balLeave=" + balLeave + "]";
	}
	
}

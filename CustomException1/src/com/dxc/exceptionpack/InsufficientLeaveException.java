package com.dxc.exceptionpack;
//unchecked exception
//public class InsufficientLeaveException extends Runtime
//checked exception
public class InsufficientLeaveException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 10000001L;
	private String msg;

	public InsufficientLeaveException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}

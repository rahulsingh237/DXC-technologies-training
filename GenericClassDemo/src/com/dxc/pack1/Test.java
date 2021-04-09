package com.dxc.pack1;

public class Test<T,U> {
	private T ob1;
	private U ob2;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(T ob1, U ob2) {
		super();
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	public T getOb1() {
		return ob1;
	}
	public U getOb2() {
		return ob2;
	}
	@Override
	public String toString() {
		return "Test [ob1=" + ob1 + ", ob2=" + ob2 + "]";
	}
	
	
}

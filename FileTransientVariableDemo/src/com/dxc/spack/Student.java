package com.dxc.spack;

import java.io.Serializable;

public class Student implements Serializable {
	private int sId;
	private int m1;
	private int m2;
	private transient int total;
	public Student(int sId, int m1, int m2) {
		super();
		this.sId = sId;
		this.m1 = m1;
		this.m2 = m2;
	}
	
	public void setTotal(int total) {
		this.total = m1+m2;
	}

	public int getsId() {
		return sId;
	}

	public int getM1() {
		return m1;
	}

	public int getM2() {
		return m2;
	}

	public int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", m1=" + m1 + ", m2=" + m2 + ", total=" + getTotal() + "]";
	}

	
	
}

package com.dxc.pack1;

public class Person {
	private int pId;
	private String pName;
	private int pAge;
	
	public int getpId() {
		return pId;
	}

	public String getpName() {
		return pName;
	}

	public int getpAge() {
		return pAge;
	}

	public Person(int pId, String pName, int pAge) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAge = pAge;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + "]";
	}
	
}

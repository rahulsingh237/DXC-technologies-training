package com.dxc.pack1;

import java.io.Serializable;

public class Student implements Serializable {
	private int sId;
	private String sName;
	private int age;
	public Student(int sId, String sName, int age) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", age=" + age + "]";
	}
	
}

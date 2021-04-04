package com.dxc.ppack;

public class JavaProgrammer {
	private String name;
	private String skillset;
	private int noOfProj; //no. of project that he has worked on
	
	public JavaProgrammer(String name, String skillset, int noOfProj) {
		super();
		this.name = name;
		this.skillset = skillset;
		this.noOfProj = noOfProj;
	}
	
	public String toString() {
		return "name=" + name + ", skillset=" + skillset+", Number of projects=" + noOfProj;
	}
	
	
}

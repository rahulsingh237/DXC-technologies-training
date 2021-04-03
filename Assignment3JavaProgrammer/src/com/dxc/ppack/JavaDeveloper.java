package com.dxc.ppack;
public class JavaDeveloper extends JavaProgrammer{
	private int experience; //experience of handling full projects
	private String otherTech;
	public JavaDeveloper(int noOfProj, String skillset, int experience, String otherTech) {
		super(noOfProj, skillset);
		this.experience = experience;
		this.otherTech = otherTech;
	}
	
}

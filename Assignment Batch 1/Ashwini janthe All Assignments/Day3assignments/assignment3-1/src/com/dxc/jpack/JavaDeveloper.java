package com.dxc.jpack;
public class JavaDeveloper extends JavaProgrammer{
	private int experience; //experience of handling full projects
	
	
	public JavaDeveloper(String name, String skillset, int noOfProj, int experience) {
		super(name, skillset, noOfProj);
		this.experience = experience;
	}
	@Override
	public String toString() {
		return super.toString()+", Experience="+experience;
	}
}
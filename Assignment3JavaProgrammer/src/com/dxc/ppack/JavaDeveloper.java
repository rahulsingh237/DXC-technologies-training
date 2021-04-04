package com.dxc.ppack;
public class JavaDeveloper extends JavaProgrammer{
	private int experience; //experience of handling full projects
	private int noOfProj; //no. of project that he has worked on
	private String skillset;
	public JavaDeveloper(String name, String skillset, int experience, int noOfProj, String skillset2) {
		super(name, skillset);
		this.experience = experience;
		this.noOfProj = noOfProj;
		skillset = skillset2;
	}
	public String getSkillset() {
		return skillset;
	}
	@Override
	public String toString() {
		return "JavaDeveloper [experience=" + experience + ", noOfProj=" + noOfProj + ", skillset=" + skillset + "]";
	}
	
	
	
}

package com.dxc.ppack;

public class JavaProgrammer {
	private String name;
	private String skillset;
	public JavaProgrammer(String name, String skillset) {
		super();
		this.name = name;
		this.skillset = skillset;
	}
	public String getSkillset()
	{
		return skillset;
	}
	@Override
	public String toString() {
		return "JavaProgrammer [name=" + name + ", skillset=" + skillset + "]";
	}
	
	
}

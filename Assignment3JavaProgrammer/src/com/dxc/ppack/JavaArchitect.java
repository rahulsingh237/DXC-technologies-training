package com.dxc.ppack;

public class JavaArchitect extends JavaDeveloper{
	private int projectsHandled;
	private String skillset;
	public JavaArchitect(String name, String skillset, int experience, int noOfProj, String skillset2,
			int projectsHandled, String skillset3) {
		super(name, skillset, experience, noOfProj, skillset2);
		this.projectsHandled = projectsHandled;
		skillset = skillset3;
	}
	public String getSkillset()
	{
		return skillset;
	}
	@Override
	public String toString() {
		return "JavaArchitect [projectsHandled=" + projectsHandled + ", skillset=" + skillset + "]";
	}
	
		
	
}

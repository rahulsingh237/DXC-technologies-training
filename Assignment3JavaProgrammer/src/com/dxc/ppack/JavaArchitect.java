package com.dxc.ppack;

public class JavaArchitect extends JavaDeveloper{
	private int projectsHandled;

	public JavaArchitect(int noOfProj, String skillset, int experience, String otherTech, int projectsHandled) {
		super(noOfProj, skillset, experience, otherTech);
		this.projectsHandled = projectsHandled;
	}
}

package com.dxc.jpack;

public class JavaArchitect extends JavaDeveloper{
	private int projectsHandled;
	
	public JavaArchitect(String name, String skillset, int noOfProj, int experience, int projectsHandled) {
		super(name, skillset, noOfProj, experience);
		this.projectsHandled = projectsHandled;
	}

	@Override
	public String toString() {
		return super.toString()+"projectsHandled=" + projectsHandled;
	}
}
	
		
	

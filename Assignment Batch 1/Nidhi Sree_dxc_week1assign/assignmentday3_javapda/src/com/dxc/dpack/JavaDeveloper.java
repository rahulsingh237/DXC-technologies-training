package com.dxc.dpack;

import com.dxc.ppack.JavaProgrammer;

public class JavaDeveloper extends JavaProgrammer {
	
	private final String substream="Developer";
	private int noofprojects;
	private String location;
	private String skillset;
	public JavaDeveloper(int emp_id, String name, int noofprojects, String location, String skillset) {
		super(emp_id, name);
		this.noofprojects = noofprojects;
		this.location = location;
		this.skillset = skillset;
	}
	@Override
	public String getskillset(JavaProgrammer j) {
		// TODO Auto-generated method stub
		return super.getskillset(j)+"\n"+j.getName()+" works on "+noofprojects+" projects "+"at "+this.location+"\n"+"he is specialised in "+skillset;
	}
	@Override
	public String toString() {
		return "JavaDeveloper [substream=" + substream + ", noofprojects=" + noofprojects + ", location=" + location
				+ ", skillset=" + skillset + "]";
	}
	
	
	
	

}

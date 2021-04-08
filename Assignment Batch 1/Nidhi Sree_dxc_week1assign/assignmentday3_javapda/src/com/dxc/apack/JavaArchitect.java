package com.dxc.apack;
import com.dxc.ppack.JavaProgrammer;

public class JavaArchitect extends JavaProgrammer  {
	private final String substream="Architect";
	private int noofprojects;
	private String location;
	private String skillset;
	public JavaArchitect(int emp_id, String name, int noofprojects, String location, String skillset) {
		super(emp_id, name);
		this.noofprojects = noofprojects;
		this.location = location;
		this.skillset = skillset;
	}
	@Override
	public String getskillset(JavaProgrammer j) {
		// TODO Auto-generated method stub
		return super.getskillset(j)+"\n"+j.getName()+" works on "+noofprojects+" projects "+"at "+this.location+"\n"+"she is specialised in "+skillset;
	}
	@Override
	public String toString() {
		return "JavaArchitect [substream=" + substream + ", noofprojects=" + noofprojects + ", location=" + location
				+ ", skillset=" + skillset + "]";
	}
	

}

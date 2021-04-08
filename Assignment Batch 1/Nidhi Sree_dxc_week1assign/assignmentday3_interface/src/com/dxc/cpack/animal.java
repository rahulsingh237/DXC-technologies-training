package com.dxc.cpack;

public class animal {
	protected int nooflegs;
	protected String food;
	protected int noofhours_slept;
	
	
	public animal(int nooflegs, String food, int noofhours_slept) {
		super();
		this.nooflegs = nooflegs;
		this.food = food;
		this.noofhours_slept = noofhours_slept;
	}
	public String eat()
	{
		return "It is eating" +this.food;
	}
	public String sleep()
	{
		return "It rested for "+this.noofhours_slept+" hours";
	}

}

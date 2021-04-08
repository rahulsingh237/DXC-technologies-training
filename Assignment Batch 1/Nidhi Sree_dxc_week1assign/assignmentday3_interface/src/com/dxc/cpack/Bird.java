package com.dxc.cpack;
import com.dxc.ipack.Flyer;

public class Bird extends animal implements Flyer {
	private String color;
	private String name;
	private String llocation;
	private String tlocation;
	
	public Bird(int nooflegs, String food, int noofhours_slept, String color, String name, String llocation,
			String tlocation) {
		super(nooflegs, food, noofhours_slept);
		this.color = color;
		this.name = name;
		this.llocation = llocation;
		this.tlocation = tlocation;
	}
	@Override
	public String takeoff(Bird b) {
		// TODO Auto-generated method stub
		return b.name+" is to take off from "+b.tlocation;
	}
	@Override
	public String land(Bird b) {
		// TODO Auto-generated method stub
		
		return b.name+" is to land at "+b.llocation;
	}
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "the bird is flying ";
	}
	@Override
	public String toString() {
		return "Bird [color=" + color + ", name=" + name + ", llocation=" + llocation + ", tlocation=" + tlocation
				+ "]";
	}
	
	
	
	
	
	

}

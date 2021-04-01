package com.dxc.cpack;

public class circle {
	private double radius;
	private String colour;
	public circle(double radius, String colour) {
		super();
		this.radius = radius;
		this.colour = colour;
	}
	public circle(double radius) {
		this(radius,"Brown");
	}
	public circle() {
		this(3.5,"Blue");
	}
	public circle(String colour) {
		this(6.5,colour);
	}
	@Override
	public String toString() {
		return "circle [radius=" + radius + ", colour=" + colour + "]";
	}
	
	
}

package com.dxc.cpack;

public class Car extends Vehicle{
	private int maxSpeed;
	private String type;
	public Car(int regNo, String model, int currSpeed, int maxSpeed, String type) {
		super(regNo, model, currSpeed);
		this.maxSpeed = maxSpeed;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", type=" + type + ", regNo=" + regNo + ", model=" + model + ", currSpeed="
				+ currSpeed + "]";
	}

	@Override
	public int increaseSpeed(int n) {
		if(currSpeed+n<maxSpeed)
		{
			currSpeed+=n;
			return currSpeed;
		}
		return -1;
	}
	
}

package com.dxc.cpack;
import com.dxc.ipack.*;
public abstract class Vehicle implements Automobile{
	protected int regNo;
	protected String model;
	protected int currSpeed;
	public Vehicle(int regNo, String model, int currSpeed) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.currSpeed = currSpeed;
	}
	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Vehicle has started";
	}
	@Override
	public abstract int increaseSpeed(int n);
		
	public int getCurrSpeed() {
		return currSpeed;
	}
	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Vehicle is stopped";
	}
	
	
}

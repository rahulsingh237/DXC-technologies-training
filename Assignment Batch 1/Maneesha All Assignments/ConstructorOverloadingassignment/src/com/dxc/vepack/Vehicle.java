package com.dxc.vepack;
public class Vehicle {
	private int regid;
	private int noofwheels;
	private int noofseater;
	private int cubiccapacity;
	private String color;
	public Vehicle( int noofwheels, int noofseater,int cubiccapacity) {
		super();
		//this.regid = regid;
		this.noofwheels = noofwheels;
		this.noofseater = noofseater;
		//this.color = color;
		this.cubiccapacity=cubiccapacity;
	}
	public Vehicle(int noofwheels,int noofseater)
	{
	//this(4,4);
	this.noofwheels=noofwheels;
	this.noofseater=noofseater;
	}
	public Vehicle(int regid,String color)
	{
		//this("1001","red");
		this.regid=regid;
		this.color=color;
	}

}

package com.dxc.vehicle;

public class Vehicle {
	private String regID;
	private int NoOfW;
	private int seat;
	private int cc;
	private String colour;
	
	public Vehicle()
	{
		regID="";
		NoOfW=0;
		seat=0;
		cc=0;
		colour="";
	}
	
	public Vehicle(String regID, int noOfW, int seat, int cc, String colour) {
		super();
		this.regID = regID;
		NoOfW = noOfW;
		this.seat = seat;
		this.cc = cc;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [regID=" + regID + ", NoOfW=" + NoOfW + ", seat=" + seat + ", cc=" + cc + ", colour=" + colour
				+ "]";
	}	
	
}

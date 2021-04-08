package com.dxc.vpack;

public class vehicle {
	private String registrationid;
	private int noofwheels;
	private int noofseats;
	private int cubiccapacity;
	private String colour;
	public vehicle(String registrationid, int noofwheels, int noofseats) {
		super();
		this.registrationid = registrationid;
		this.noofwheels = noofwheels;
		this.noofseats = noofseats;
	}
	public vehicle(String registrationid, int noofwheels, int noofseats, int cubiccapacity, String colour) {
		super();
		this.registrationid = registrationid;
		this.noofwheels = noofwheels;
		this.noofseats = noofseats;
		this.cubiccapacity = cubiccapacity;
		this.colour = colour;
	}
	public vehicle(String registrationid, int noofwheels, int noofseats, int cubiccapacity) {
		super();
		this.registrationid = registrationid;
		this.noofwheels = noofwheels;
		this.noofseats = noofseats;
		this.cubiccapacity = cubiccapacity;
	}
	public vehicle(String registrationid, int noofwheels) {
		super();
		this.registrationid = registrationid;
		this.noofwheels = noofwheels;
	}
	@Override
	public String toString() {
		return "vehicle [registrationid=" + registrationid + ", noofwheels=" + noofwheels + ", noofseats=" + noofseats
				+ ", cubiccapacity=" + cubiccapacity + ", colour=" + colour + "]";
	}
	
	

}

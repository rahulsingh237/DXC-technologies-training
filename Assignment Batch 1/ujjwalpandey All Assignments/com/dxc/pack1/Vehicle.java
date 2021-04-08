package com.dxc.pack1;

public class Vehicle {
	private int regId;
	private int noofWheels;
	private int noofSeater;
	private String cubiccapacity;
	private String colour;
	
		public Vehicle(int regId, int noofWheels, int noofSeater, String cubiccapacity, String colour) {
		super();
		this.regId = regId;
		this.noofWheels = noofWheels;
		this.noofSeater = noofSeater;
		this.cubiccapacity = cubiccapacity;
		this.colour = colour;
	}
		public Vehicle(int regId, int noofseater)
		{ 
			this(regId,4,noofseater,"1800cc","red");
		}
		
		public Vehicle(String cubiccapacity, String colour) {
			this(130, 10, 6, cubiccapacity, colour);
		}
		public Vehicle(int noofwheels, String cubiccapacity)
		{
			this(164, noofwheels, 12 , cubiccapacity,"silver");
		}

		@Override
		public String toString() {
			return "Vehicle [regId=" + regId + ", noofWheels=" + noofWheels + ", noofSeater=" + noofSeater
					+ ", cubiccapacity=" + cubiccapacity + ", colour=" + colour + "]";
		}
		

}

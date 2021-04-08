//package assignment2;

public class Vehicle {
	
	
 public	Vehicle(int registrationID, int no_of_wheels, int no_of_seater, String colour) {
		super();
		this.registrationID = registrationID;
		this.no_of_wheels = no_of_wheels;
		this.no_of_seater = no_of_seater;
		this.colour = colour;
	}
	
	
	
 public	Vehicle(int registrationID, int no_of_wheels, int no_of_seater) {
		super();
		this.registrationID = registrationID;
		this.no_of_wheels = no_of_wheels;
		this.no_of_seater = no_of_seater;
			}
	
public	Vehicle(int registrationID, int no_of_wheels) {
		super();
		this.registrationID = registrationID;
		this.no_of_wheels = no_of_wheels;
		
	}
	
	public Vehicle(int registrationID) {
		super();
		this.registrationID = registrationID;
	}
	
	
	private int registrationID; 
	private int no_of_wheels; 
	private int no_of_seater; 
	private String colour;
	
	
	public int getRegistrationID() {
		return registrationID;
	}



	public int getNo_of_wheels() {
		return no_of_wheels;
	}



	public int getNo_of_seater() {
		return no_of_seater;
	}



	public String getColour() {
		return colour;
	}



	@Override
	public String toString() {
		return "Vehicle [registrationID=" + registrationID + ", no_of_wheels=" + no_of_wheels + ", no_of_seater="
				+ no_of_seater + ", colour=" + colour + "]";
	}
	
	
	
	
	
	


}


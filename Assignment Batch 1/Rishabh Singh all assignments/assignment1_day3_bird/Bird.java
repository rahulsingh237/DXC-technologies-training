package com.bird;

public class Bird extends Animal implements Flyer {
	
	private String birdname;
	
	public Bird(String name){
		this.birdname = name;
	}
	
	

	@Override
	public String takeoff() {
		
		return "Bird takesoff into the sky";
	}

	@Override
	public String fly() {
		
		return "Bird is flying into the sky";
	}

	@Override
	public String land() {
		
		return "Bird has landed";
	}

	@Override
	String eat() {
		
		return "Bird is eating";
	}

	
	
	String layEggs(){
		return "Bird lays eggs";
		
	}
	String buildNests(){
		return "Bird build nest";
		
	}



	public String getBirdname() {
		return birdname;
	}



	public void setBirdname(String birdname) {
		this.birdname = birdname;
	}

}

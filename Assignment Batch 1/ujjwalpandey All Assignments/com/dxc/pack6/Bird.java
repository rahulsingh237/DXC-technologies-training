package com.dxc.pack6;

public class Bird extends Animal implements Flyer{
public String buildnest()
{
	return "Nest has to be build First for the Birds";
}
public String layeggs()
{
	return "Nest is completed now Birds will lay  Eggs";
	}
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Bird is ready to Fly" ;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "The Bird is flying in the air" ;
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Bird is returning to its home on land";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return " Bird is hungry ";
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return "Bird is sleeping";
	}

}

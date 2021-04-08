package com.dxc.bpack;

import com.dxc.apack.Animal;
import com.dxc.arpack.Aris;


public class Bird extends Animal implements Aris{
	public String buildNest()
	{
		return "Nest has been built";
	}
	public String layeggs()
	{
		return "Eggs are layed";
	}
	@Override
	public String takeOff()
	{
		return "Bird is starting to fly";
	}
	@Override
	public String fly()
	{
		return "Bird is Flying";
	}
	@Override
	public String land()
	{
		return "Bird is tired.It will land now";
	}
	@Override
	public String eat()
	{
		return "Hungry!!It will eat now";
	}
	@Override
	public String sleep()
	{
		return "It is feeling sleepy.";
	}

}

package com.dxc.ppack;
import com.dxc.dpack.Dice;
public class Player {
	private String pName;
	private Dice d1;
	private Dice d2;
	
	public Player(String pName)
	{
		this.pName=pName;
		this.d1 = new Dice();
		this.d2 = new Dice();
	}
	public int play()
	{
		return(d1.roll()+d2.roll());
	}
	public String getpName() {
		return pName;
	}
	
}

package com.dxc.dpack;
import java.util.Random;
public class Dice {
	public int roll()
	{
		Random rand = new Random();
		return (int)(rand.nextInt(5)+1);
	}
}

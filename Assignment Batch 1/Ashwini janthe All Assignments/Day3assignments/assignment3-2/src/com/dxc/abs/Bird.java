package com.dxc.abs;
import com.dxc.ab.Airs;
import com.dxc.ani.Animal;

public class Bird extends Animal implements Airs{
		
		public String buildNest()
		{
			return "Nest has been built";
		}
		public String layeggs()
		{
			return "Eggs are layed";
		}
		@Override
		public String takeOff() {
			// TODO Auto-generated method stub
			return "Bird is starting to fly";
		}
		@Override
		public String fly() {
			// TODO Auto-generated method stub
			return "Bird is flying";
		}
		@Override
		public String land() {
			// TODO Auto-generated method stub
			return "Bird is tired. It will land now";
		}
		@Override
		public String eat() {
			// TODO Auto-generated method stub
			return "Hungry!! It will eat now";
		}
		@Override
		public String sleep() {
			// TODO Auto-generated method stub
			return "It's feeling sleepy. Good night!!";
		}
	}
	

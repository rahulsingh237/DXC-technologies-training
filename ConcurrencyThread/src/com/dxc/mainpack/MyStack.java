package com.dxc.mainpack;

import java.util.ArrayList;

public class MyStack {
	
	private ArrayList<Character> buffer = new ArrayList<Character>(100);
	
	public synchronized void push(char character){
	
		this.notify();
		buffer.add(character);
	}
	public synchronized char pop(){
		char character ;
		
		
		while(buffer.isEmpty()){
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		character= buffer.remove(buffer.size()-1);
		return character;
	}
	
	
	

}


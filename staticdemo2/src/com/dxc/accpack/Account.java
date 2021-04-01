package com.dxc.accpack;
import java.util.Random;
public class Account {
	private final int accNo;
	private String accType;
	private int balance;
	private static int count;
	
	static {
		count=0;
	}
	public static int getCount()
	{
		Random rand = new Random();
		count=rand.nextInt(4000)+1000;
		return count;
	}
	public Account(String accType, int balance) {
		super();
		this.accNo=getCount();
		this.accType = accType;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", balance=" + balance + "]";
	}
	
}

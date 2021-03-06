package com.dxc.cpack;

public class Consumer {
	private int mtno;
	private int unitsConsumed;
	private int unitPrice;
	public Consumer(int mtno,int unitsConsumed,int unitPrice) {
		super();
		this.mtno=mtno;
		this.unitsConsumed=unitsConsumed;
		this.unitPrice=unitPrice;		
	}
	private int calcBill()
	{
		return unitsConsumed*unitPrice;
	}
	@Override
	public String toString() {
		return "Consumer [mtno=" + mtno + ", unitsConsumed=" + unitsConsumed + ", unitPrice=" + unitPrice
				+ ", Bill Amount = " + calcBill() + "]";
	}
	
	
	
}

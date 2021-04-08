package com.dxc.pack1;

public class MyDate {
	private int dd;
	private int mm;
	private int yy;
	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (dd != other.dd)
			return false;
		if (mm != other.mm)
			return false;
		if (yy != other.yy)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
}

package com.dxc.cpack;
import com.dxc.ipack.*;
public class class1 implements Interface1,Interface2{

	@Override
	public String m3() {
		// TODO Auto-generated method stub
		return "I am in m3 with a constant "+Interface2.count;
	}

	@Override
	public String m1() {
		// TODO Auto-generated method stub
		return "I am in m1";
	}

	@Override
	public String m2() {
		// TODO Auto-generated method stub
		return "I am in m2";
	}

	
	
}

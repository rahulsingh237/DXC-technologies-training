package com.dxc.ipack;

import com.dxc.cpack.Bird;

public interface Flyer {

	String takeoff(Bird b);
	String land(Bird b);
	String fly();
}

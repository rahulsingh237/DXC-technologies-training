package com.dxc.pack1;
import java.util.*;

public class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// ascending order age
		
		if(o1.getpAge()>o2.getpAge())
			return 1;
		else
			if(o1.getpAge()==o2.getpAge())
				return 0;
			else
				return -1;
	}

}

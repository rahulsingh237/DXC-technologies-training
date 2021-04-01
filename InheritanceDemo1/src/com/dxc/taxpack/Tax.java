package com.dxc.taxpack;
import com.dxc.emppack.*;
public class Tax {
	public static int calcTax(Employee e)
	{
		if(e instanceof Manager)
		{
			return 35000;
		}
		else {
			if(e instanceof Programmer)
			{
				return 25000;
			}
			else return 0;
		}
	}
}

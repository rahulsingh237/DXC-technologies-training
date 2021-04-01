package com.dxc.mpack;
import com.dxc.cpack.Car;
public class MainLongDrive {
	public static void main(String[] args) {
		Car c1 = new Car(1073,"q3",40,120,"7 seater");
		System.out.println(c1.start()+" with current Speed:"+c1.getCurrSpeed());
		if(c1.increaseSpeed(100)!=-1)
		{
			System.out.println("Car has speed up with current speed "+c1.getCurrSpeed());
		}else {
			System.out.println("Slow down or stop the car");
		}
		System.out.println(c1.stop());
	}
}

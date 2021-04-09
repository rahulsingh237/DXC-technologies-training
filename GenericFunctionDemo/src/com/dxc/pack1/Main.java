package com.dxc.pack1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intarr = {3,5,7,9};
		Test.printArray(intarr);
		System.out.println();
		String[] strarr = {"Orange","Apple","Grapes","Melon"};
		Test.printArray(strarr);
		System.out.println();
		Student[] stdarr = {new Student(10,"xxx",85),new Student(11,"yyy",75),new Student(12,"zzz",95)};
		Test.printArray(stdarr);
		
		System.out.println(Test.findMax(intarr[0], intarr[1], intarr[2]));
        System.out.println(Test.findMax(strarr[0], strarr[1], strarr[2]));
        System.out.println(Test.findMax(stdarr[0], stdarr[1], stdarr[2]));
	}

}

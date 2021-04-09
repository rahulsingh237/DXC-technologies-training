package com.dxc.pack1;

public class Test {

	 

    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {

 

        T max = x;

 

        if (y.compareTo(max) > 0) {
            max = y;
        }

 

        if (z.compareTo(max) > 0) {
            max = z;
        }

 

        return max;

 

    }

 

    public static <T> void printArray(T[] arr) {
        for (T ele : arr) {
            System.out.println(ele);
        }
    }

 

}
package com.dxc.pack1;
import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<String>();
		st.push("aa");
		st.push("bb");
		st.push("cc");
		st.push("dd");
		st.push("ee");
		System.out.println(st.remove(1));
		
		
		//LIFO
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.contains("dd"));
		System.out.println(st.search("cc"));
	}

}

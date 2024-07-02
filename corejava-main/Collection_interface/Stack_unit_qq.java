package com.rays.Collection_interface;

import java.util.Stack;

public class Stack_unit_qq {

	public static void main(String[] args) {
		Stack s = new Stack();
		 s.push("A");
		 s.push("B");
		 s.push("C");
		 s.push("D");
		 s.push("E");
		 s.push("F");
		 s.push("G");
		 s.push("H");
		 s.push("I");
		 s.push("J");
		 s.push("K");
		 s.push("L");
		 s.push("M");
		 s.push("N");
		 s.push("O");
		 s.push("P");
		 s.push("Q");
		 s.push("R");
		 s.push("S");
		 s.push("T");
		 s.push("U");
		 s.push("V");
		 s.push("W");
		 s.push("X");
		 s.push("Y");
		 s.push("Z");
		 
		 
		
		 System.out.println(s);
		 
		 Stack st = new Stack();
		 
		 while (s.size()>0) {
			Object o = s.pop();
			st.push(o);
			
		}
		 System.out.println(st);
		 
	}

}

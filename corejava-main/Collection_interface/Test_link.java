package com.rays.Collection_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Test_link {

	public static void main(String[] args) {
		 
		List l = new ArrayList();
		l.add(1);
		l.add(22);
		l.add(33.3);
		l.add('a');
		l.add("Aakash");
		l.add("Rathod");
		l.add(null);
		
		System.out.println(l);
		
		/*for (Object o : l) {
			System.out.println(o);
			
		}*/
		
		LinkedList li = new LinkedList();
		
		li.add(5);
		li.add(56);
		li.add(22.2);
		li.add('f');
		li.add("aayushi");
		li.add(null);
		System.out.println(li);
		
		
		Vector v = new Vector();
		v.add(6);
		v.add(54);
		v.add('d');
		v.add("name");
		v.add(null);
		
		System.out.println(v);

		
		Stack s = new Stack();
		s.push(89);
		s.push(56.5);
		s.push('j');
		s.push("sky rathod");
		
		//s.pop();
		
		System.out.println(s);
		//System.out.println(s.peek());
		
	}

}

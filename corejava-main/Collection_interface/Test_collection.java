package com.rays.Collection_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test_collection {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(15);
		li.add(6.6);
		li.add('a');
		li.add("Sky");
		System.out.println(li);
		
		
		/*for (Object o : li) {
			
			System.out.println(o);
		}*/
		
		List a = new LinkedList();
		
		a.add(55);
		a.add(7.89);
		a.add('k');
		a.add("Rathod");
		
		System.out.println(a);
		
	}

}

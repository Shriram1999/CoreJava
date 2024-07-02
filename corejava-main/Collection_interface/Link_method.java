package com.rays.Collection_interface;

import java.util.LinkedList;
import java.util.List;

public class Link_method {
 public static void main(String[] args) {
	
	 List a = new LinkedList();
		
		a.add(55);
		a.add(7.89);
		a.add('k');
		a.add("Rathod");
		a.add('A');
		a.add('k');
		a.add(1, "Aakash");
		//a.remove(4);
		//a.set(0, "zsxsxsxs");
		//System.out.println(a.get(1));
		//System.out.println(a.subList(0, 4));
		
		System.out.println(a);
		 List k= new LinkedList();
			
			k.add(77);
			k.add(3.89);
			k.add('s');
			k.add("trun");
			k.add('t');
			k.add('r');
			
			System.out.println(k.lastIndexOf(3.89));
}
}

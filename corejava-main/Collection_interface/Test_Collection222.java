package com.rays.Collection_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_Collection222 {
public static void main(String[] args) {
	
	List li = new ArrayList();
	li.add(78);
	li.add(7.7);
	li.add('k');
	li.add("Aakash");
	
	//li.remove(0);
	//li.removeAll(li);
	//li.isEmpty();
	
	//System.out.println(li.isEmpty());
	//System.out.println(li.size());
	System.out.println(li);
	List l = new ArrayList();
	l.add(78);
	l.add(7.7);
	l.add('k');
	l.add("Aakash");
	Iterator i = l.iterator();
	while (i.hasNext()) {
		Object o = (Object)i.next();
		System.out.println(o);
		
	}
	
	//l.clear();
	//l.addAll(li);
	//l.retainAll(li);
	
	//System.out.println(l.containsAll(li));
	//System.out.println(l);
}
}

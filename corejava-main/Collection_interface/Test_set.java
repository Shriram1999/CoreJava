package com.rays.Collection_interface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test_set {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add(2);
		s.add(3);         //(dublicate elementns does nat store )
		s.add(8);
		s.add(5);
		s.add(1);
		
		System.out.println(s);
		
		TreeSet t = new TreeSet();
		t.add(56);
		t.add(46);
		t.add(12);     //(contane same type  elemante)
		t.add(96);
		t.add(1);
		
		System.out.println(t);
		
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("Two");
		lh.add("One");
		lh.add("Three");  //(same order in which they have been added)
		lh.add("Four");
		
		System.out.println(lh);
		
		SortedSet st = new TreeSet();
		
		st.add(1);
		st.add(5);       
		st.add(8);
		st.add(4);
		st.add(3);
		st.add(11);
		
		System.out.println(st.first());
		System.out.println(st.last());
		System.out.println(st.headSet(5));//(element se chote element dikhata h)
		System.out.println(st.tailSet(8));//(element bhi or usse aage elements dikhata h)
		System.out.println(st.subSet(4, 11));//(first or uske bich k elements ko dikhata h)
	}

}

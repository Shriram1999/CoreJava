package com.rays.Collection_interface;

import java.util.Deque;
import java.util.LinkedList;

public class Test_Deque {
	public static void main(String[] args) {
		
		
		Deque d = new LinkedList();
		
		d.offer(78);
		d.offer(45);
		d.offer(451);
		d.offer(12);
		d.offerFirst(25);
		d.offerLast(63);
		d.pollFirst();
		//d.pollLast();
		
		System.out.println(d.peekLast());
		
		//System.out.println(d.peekFirst());
		
	}

}

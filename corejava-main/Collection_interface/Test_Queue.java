package com.rays.Collection_interface;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test_Queue {
public static void main(String[] args) {
	
	Queue q = new LinkedList ();
	
	q.offer(1);
	q.offer(8);
	q.offer(9);
	q.offer(5);
	q.poll();
	//q.poll();
	//q.poll();
	System.out.println(q.peek());
	
	
	PriorityQueue p = new PriorityQueue();
	p.offer("Four");
	p.offer("One");
	p.offer("Two");
	p.offer("Three");
	
	System.out.println(p);
	
	
}
}

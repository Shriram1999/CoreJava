package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class TestforEach_method {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(10);
		
		list.add(25);
		list.add(54);
		list.add(34);
		list.add(23);
		list.add(78);
		list.add(43);
		list.add(67);
		
		list.forEach(o-> System.out.println(o));
		
	}
}

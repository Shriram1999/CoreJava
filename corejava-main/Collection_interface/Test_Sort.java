package collection_interface;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Test_Sort {
	
	public static void main(String[] args) {

		LinkedList z = new LinkedList();
		z.add(13);
		z.add(12);
		z.add(11);
		z.add(15);
		z.add(17);
		z.add(18);
		/*for (Object o : z) {
			System.out.println(o);
		}*/
		Collections.sort(z);
		System.out.println(z);
		
		
	}

}

package collection_interface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Test_StreamAPI {

	
	public static void main(String[] args) {
		
	
		  List<Integer> list = Arrays.asList(4,5,6,7,7,8,8,9,83,10);
		  
		 list.stream().forEach(li -> System.out.println(li));
		
		  
		
		
		/*
		 * List<String> list = Arrays.asList("java","DBMS","paython","Java");
		 * 
		 * List<String> li
		 * =list.stream().map(e->e.toLowerCase()).collect(Collectors.toList());
		 * 
		 * System.out.println(li);
		 */
		 		}
}

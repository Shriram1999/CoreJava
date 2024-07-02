package com.rays.Collection_interface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class Test_Map {
	
	public static void main(String[] args) {
		 
		Map m = new HashMap();
		m.put(1, "Aakash");
		m.put(2 ,"Ram");
		m.put(3, "Trun");
		m.put(4 ,"shyam");
		m.put(5 ,"Aanand");
		m.put(6 ,"Hemant");
		m.put(7 ,"Ayush");
		//.clear();
	    Set Entry = m.entrySet();
	    for (Object l : Entry) {
			System.out.println(l);
		}
		/*System.out.println(m.containsKey(1));
		System.out.println(m.containsValue("Trun"));
		System.out.println(m.get(4));
		System.out.println(m.isEmpty());
		System.out.println(m.keySet());
		m.remove(1);
		System.out.println(m.size());
		System.out.println(m.values());*/

	    
	    
	    Hashtable h = new Hashtable();
	    h.put(1 ,"JAVA");
	    h.put(2 ,"c+");
	    h.put(3 ,"c++");
	    h.put(4 ,"python");
	   // h.put(4, "Aakash"); //order  to store & retrive
	    
	  System.out.println(h);  
	  
	  
	  LinkedHashMap lm = new LinkedHashMap();
	  
	  lm.put(1 ,45);
	  lm.put(2 , 54);
	  lm.put(3 , 74);
	  lm.put(4 , 554);
	  lm.put(5 ,555);
	  
	  System.out.println(lm);
	  
	  
	  Properties pm = new Properties();
	  pm.put(1 ,45);
	  pm.put(2 , 54);
	  pm.put(3 , 7446);
	  pm.put(4 , 554);
	  pm.put(5 ,555);
	  
	  System.out.println(pm);
	  
	  
	  
	  
	    
	}
}

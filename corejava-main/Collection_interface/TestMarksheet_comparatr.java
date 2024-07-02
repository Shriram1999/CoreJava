package collection_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestMarksheet_comparatr  {


public static void main(String[]args) {
	Marksheet_comparatr m = new Marksheet_comparatr();
	m.setRollNo("5");
	m.setPhysics(88);
	m.setChamistry(75);
	m.setFname("Hemant");
	m.setLname("Sonaniya");
	
	
	Marksheet_comparatr m1 = new Marksheet_comparatr();
	m1.setRollNo("3");
	m1.setPhysics(77);
	m1.setChamistry(57);
	m1.setFname("Aakash");
	m1.setLname("patidar");
	
		
		  Marksheet_comparatr m2 = new Marksheet_comparatr();
		 m2.setRollNo("1");
		  m2.setPhysics(66);
		 m2.setChamistry(67);
		 m2.setFname("Anand "); 
		 m2.setLname("Lodhi");
		 
		 
		  Marksheet_comparatr m3 = new Marksheet_comparatr(); 
		  m3.setRollNo("2");
		  m3.setPhysics(57);
		  m3.setChamistry(77);
		  m3.setFname("Aayush "); 
			 m3.setLname("jain");
		  Marksheet_comparatr m4 = new Marksheet_comparatr();
		  m4.setRollNo("4");
		  m4.setPhysics(78);
		  m4.setChamistry(87);
		  m4.setFname("Ayush"); 
			 m4.setLname("Shrivastva");
	ArrayList<Marksheet_comparatr> list = new ArrayList<Marksheet_comparatr>();
	list.add(m);
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
    
	Collections.sort(list,new Marksheet_comparatr());
	 Iterator<Marksheet_comparatr> I = list.iterator();
	 while (I.hasNext()) {
		Marksheet_comparatr o = (Marksheet_comparatr) I.next();
		System.out.println(o.getRollNo()+" "+o.getPhysics()+" "+o.getChamistry()+" "+o.getFname()+" "+o.getLname());
	}
		 
		 
		 
	
	
}
}

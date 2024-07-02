package collection_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test_Marksheet_comparabl {

	public static void main(String[] args) {
		
		Marksheet_comparabl mc = new Marksheet_comparabl();
		mc.setRollNo("1");
		mc.setChamistry(55);
		mc.setPhysics(76);
		
		Marksheet_comparabl mc1 = new Marksheet_comparabl();
		mc1.setRollNo("3");
		mc1.setChamistry(56);
		mc1.setPhysics(67);
	
		Marksheet_comparabl mc2 = new Marksheet_comparabl();
		mc2.setRollNo("2");
		mc2.setChamistry(66);
		mc2.setPhysics(77);
		
		ArrayList<Marksheet_comparabl> list = new ArrayList<Marksheet_comparabl>();
		list.add(mc);
		list.add(mc1);
		list.add(mc2);
		
		Collections.sort(list);
		 Iterator<Marksheet_comparabl> I = list.iterator();
		 while (I.hasNext()) {
			Marksheet_comparabl o = (Marksheet_comparabl) I.next();
			System.out.println(o.getRollNo()+" "+o.getPhysics()+" "+o.getChamistry());
		 }
	}
	
}
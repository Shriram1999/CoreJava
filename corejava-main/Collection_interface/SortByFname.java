package collection_interface;

import java.util.Comparator;

public class SortByFname implements Comparator<Marksheet_comparatr>{

	@Override
	public int compare(Marksheet_comparatr m, Marksheet_comparatr m1) {
		
		if (m.getFname() == m1.getFname()) {
		return  m.getLname().compareTo(m1.getLname());
	}else {
		
		return m.getFname().compareTo(m1.getFname());
		
	}
		
		}	
}


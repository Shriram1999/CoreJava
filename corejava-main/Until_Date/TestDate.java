package until_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
	Date d = new Date();		
		System.out.println(d);
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 String nd = sdf.format(d);
	 System.out.println(nd);
	}
	


}


package in.co.constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestPerson4 {
	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d= sdf.parse("13/08/2000");
		Parson4 p = new Parson4("akash","khargone",d);
		
	    
	    
		System.out.println("Name : "+p.getName());
		System.out.println("Address : "+p.getAddress());
		System.out.println("DOB : "+sdf.format(p.getDob()));
		System.out.println("age : "+p.AVG_AGE);
		
	}

}
 



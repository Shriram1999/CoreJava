package Java.Until.Date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		
		String str =sdf.format(d);
		System.out.println("Date : "+ str);
		String str1 ="22/03/2009";
		Date d1 = sdf.parse(str1);
		
		System.out.println(d1);
	}

	
	}


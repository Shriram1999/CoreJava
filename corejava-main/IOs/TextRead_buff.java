package IOs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextRead_buff {

	public static void main(String[] args) throws Exception {
	  FileReader r = new FileReader("C:/Sky/Aakash.txt");
	
 	BufferedReader br = new BufferedReader(r);
	
	String ch = br.readLine();
	while (ch!= null) {
		System.out.println(ch);
		ch = br.readLine();
	}
	
   	}
}

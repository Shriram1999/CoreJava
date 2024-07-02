package IOs;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextRead {

	public static void main(String[] args) throws Exception  {
		
		FileReader reader = new FileReader("C:/Sky/Aakash.txt");
		
		int ch = reader.read();
		
		while (ch!= -1) {
			System.out.println((char)ch);
			
			ch = reader.read();
			
		}
		reader.close();
	}
}

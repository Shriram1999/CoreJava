package IOs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Try_textReader {

public static void main(String[] args) throws IOException   {
		
		
		try 
			(FileReader fr = new FileReader("C:/Sky/Aakash.txt")){
			/*BufferedReader brr = new BufferedReader(fr);
		String ch = brr.readLine();
		
		while (ch!= null) {
			System.out.println(ch);
			
			ch = brr.readLine();
		}	*/
			int ch = fr.read();
			
			while (ch!=-1) {
				System.out.println((char)ch);
				ch=fr.read();
			}
			//fr.close();
		
		}/* catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}*/		
}
}

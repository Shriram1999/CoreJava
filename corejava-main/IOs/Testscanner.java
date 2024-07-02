package IOs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Testscanner {

	public static void main(String[] args) throws Exception {
		
		FileReader frd = new FileReader("C:/Sky/Aakash.txt");

	 Scanner s = new Scanner(frd);
	 
	while (s.hasNext()) {
		System.out.println(s.nextLine());
	}
	s.close();
	}
	
}

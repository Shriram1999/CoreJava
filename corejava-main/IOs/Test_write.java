package IOs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test_write {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("C:/Sky/Aakash.txt");
		
		fw.write("Aakash");
		
		fw.write("\n");
		//fw.write(" This is line one ");
		//fw.write(" This is line Two");
		fw.close();
		System.out.println("Check C:/Sky/Aakash.txt");
	}
}

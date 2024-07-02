package IOs;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class TestKeyboard {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter f = new FileWriter("C:/Sky/Aakash.txt",true);
		PrintWriter out = new PrintWriter(f);
		System.out.println("Start.....");
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader brr = new BufferedReader(ir);
		
		String line = brr.readLine();
		while (!line.equals("quit")) {
			out.print(line);
			line = brr.readLine();
			
		}
		out.close();
		ir.close();
		System.out.println("Done");
		
		
	}

}

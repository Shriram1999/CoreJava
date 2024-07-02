package IOs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PPwriter {

	public static void main(String[] args) throws Exception {
		FileWriter out = new FileWriter("C:/Sky/Aakash.txt");
		PrintWriter p = new PrintWriter(out);
		
		for (int i = 0; i<5; i++) {
			p.println(i+ ":Aakash Rathod");
			
		}
		p.close();
		out.close();
		
		System.out.println("Check C:/Sky/Aakash.txt");
	}
}

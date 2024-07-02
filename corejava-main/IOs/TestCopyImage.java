package IOs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestCopyImage {

	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("C:/Users/akash/Pictures/Saved Pictures/shiv.jpeg");
		
		FileOutputStream fo = new FileOutputStream("C:/akki.jpeg");
		
		int ch = f.read();
		while (ch!=-1) {
			fo.write(ch);
			ch = f.read();
			
		}
		System.out.println("Copied");
		fo.close();
		f.close();
	}
}

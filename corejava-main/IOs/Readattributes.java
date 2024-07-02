package IOs;

import java.io.File;

public class Readattributes {
	public static void main(String[] args) {
		File fl = new File("C:/Sky/Aakash.txt");
		if(fl.exists()) {
			System.out.println("akku "+fl.getName());
			//System.out.println();
		}
	}

}

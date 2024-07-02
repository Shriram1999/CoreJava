package IOs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testMarksheetseriali  {
	
public static void main(String[] args) throws IOException, Exception{
		
		FileOutputStream file = new FileOutputStream("C:/Sky/Aakash.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheetseriali ms = new Marksheetseriali();
		ms.setName("Aakash");
		ms.setMath(90);
		ms.setChemistry(76);
		ms.setPhysics(55);
		 out.writeObject(ms);
		System.out.println(ms.getName());
		System.out.println(ms.getMath());
		System.out.println(ms.getPhysics());
		System.out.println(ms.getPhysics());
		System.out.println("done");
		out.close();
		file.close();
		
		System.out.println();
		
		FileInputStream fis= new FileInputStream("C:/Sky/Aakash.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Marksheetseriali mi = null;
		
		mi=(Marksheetseriali)ois.readObject();
		System.out.println("done");
		System.out.println(mi.getName());
		System.out.println(mi.getMath());
		System.out.println(mi.getPhysics());
		System.out.println(mi.getPhysics());
		ois.close();
		fis.close();
		
		
	}

}

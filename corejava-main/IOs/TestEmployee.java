package IOs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream o = new FileOutputStream("C:/Sky/Aakash.txt");
		ObjectOutputStream ob = new ObjectOutputStream(o);
		Employee E = new Employee("sky","Aakash","Rathod",70000);
		E.writeExternal(ob);
		System.out.println("done");
		ob.close();
		o.close();
		
		FileInputStream fo = new FileInputStream("C:/Sky/Aakash.txt");
		ObjectInputStream op = new ObjectInputStream(fo);
		Employee E1 = new Employee("sky","Aakash","Rathod",70000);
		E1.readExternal(op);
		System.out.println(E1.getId());
		System.out.println(E1.getFname());
		System.out.println(E1.getLname());
		System.out.println(E1.getSalery());
		op.close();
		fo.close();
	}
}

package IOs;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
	

	private String id;
	private String fname;
	private String lname;
	private double salery;
	public Employee(String id, String fname, String lname, double salery) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salery = salery;
		
	}
	public String getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public double getSalery() {
		return salery;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(fname);
		out.writeObject(lname);
		out.writeObject(salery);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = (String)in.readObject();
		fname= (String)in.readObject();
		lname = (String)in.readObject();
		salery = (double)in.readObject();
		
	}
	
	
}

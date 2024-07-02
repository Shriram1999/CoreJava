package collection_interface;

import java.util.Comparator;

public class Marksheet_comparatr implements Comparator<Marksheet_comparatr> {
	private   String rollNo;
	private int physics;
	private int chamistry;
	private String fname;
	private String lname;
	public String getRollNo() {
		return rollNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChamistry() {
		return chamistry;
	}
	public void setChamistry(int chamistry) {
		this.chamistry = chamistry;
	}

	@Override
	public int compare(Marksheet_comparatr o1, Marksheet_comparatr o2) {
		
		if(o1.getFname()==o2.getFname()) {
			return o1.getLname().compareTo(o2.getLname());
		}else {
			return o1.getFname().compareTo(o2.getFname());
		}

	}
	
	
	
	
	
	

}

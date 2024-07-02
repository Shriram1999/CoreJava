package in.co.constructor;

import java.util.Date;

public class Parson4 {
		
	
	private String name;
	private Date dob;
	private String address;
	
	public static final int AVG_AGE=22;
	
	public Parson4(String name, String address, Date dob) {
		this.name=name;
		this.address=address;
		this.dob=dob;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}

	public static int getAvgAge() {
		return AVG_AGE;
	}
}	
	

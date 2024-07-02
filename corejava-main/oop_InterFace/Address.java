package oop_InterFace;

public class Address implements Cloneable {
private String state;
private String city;
private String town ;
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getTown() {
	return town;
}
public void setTown(String town) {
	this.town = town;
}

 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

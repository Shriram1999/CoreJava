package oop_constructor;

public class AutoMobileContructor {
 private String colore;
 private int speed;
 private String make;
private String color;
 public static final int NO_OF_GEARS=5;
 
 public AutoMobileContructor(String color,String make,int speed) {
	    this.color=color;
	    this.speed=speed;
	    this.make=make;
 }
 public AutoMobileContructor(String color,String make) {
	 this.color=color;
	 this.make=make;
 }
 
 public AutoMobileContructor() {
	 System.out.println("Default Constructor");
 }
public String getColore() {
	return colore;
}
public int getSpeed() {
	return speed;
}
public String getMake() {
	return make;
}
public void breakk() {
	System.out.println("The car is breaking");
}
	public void accelerator() {
		if(speed>0) {
			System.out.println("The car is accelerating");
		}
		else {
			System.out.println("The car is breaking");
		}
	}
	public void ChangeGear() {
		if(speed>0 && speed<20) {
			System.out.println("first gear");
		}else if(speed>=20 && speed<=40) {
			System.out.println("second gear");
		}else if(speed>=40 && speed<=60) {
			System.out.println("third gear");
		}else if(speed>=60 && speed<=80) {
			System.out.println("fourth gear");
		}else if(speed>=80 && speed<=200) {
			System.out.println("fifth gear");
		}else {
			System.out.println("stop");
			
		}
		
		
	}
			}


package oop_abstract;

public abstract class Shape {
	
	private String color;
	private int borderWidtgh;
	
	public static final float PI=3.14f;
	
	public Shape(String color, int borderWidtgh) {
		this.color=color;
		this.borderWidtgh=borderWidtgh;
	}
	 public Shape() {
		 //System.out.println("Default Constructor");
	 }

	public String getColor() {
		return color;
	}
	public int getBorderWidtgh() {
		return borderWidtgh;
	}
	public abstract double area ();
	
} 




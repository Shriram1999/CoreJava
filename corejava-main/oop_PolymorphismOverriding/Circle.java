package oop_PolymorphismOverriding;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle (int radius) {
		this.radius= radius;
	}

	public int getRadius() {
		return radius;
	}
	public double area() {
		double d =PI*radius*radius;
		return d;
		
	}
	

}

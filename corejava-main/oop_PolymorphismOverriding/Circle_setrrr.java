package oop_PolymorphismOverriding;

public class Circle_setrrr extends Shape_setrrr {
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
			double d =PI*radius*radius;
			return d;
			
		}
	
	
	

}

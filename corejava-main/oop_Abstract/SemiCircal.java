package oop_abstract;

public class SemiCircal extends  Circle {
	private int radius;
	
	public SemiCircal() {}
	
	public SemiCircal (int radius) {
		this.radius= radius;
	}

	public int getRadius() {
		return radius;
	}
	public double area() {
		double d =PI*radius*radius/2;
		return d;
		
	}
}

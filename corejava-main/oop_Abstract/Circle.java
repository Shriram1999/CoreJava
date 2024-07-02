package oop_abstract;

public abstract class Circle extends Shape {
	private int radius;

public Circle() {
	
}

public Circle (int radius) {
	this.radius= radius;
}

public int getRadius() {
	return radius;
}
	/*
	 * public double area () { double d =PI*radius*radius; return d;
	 * 
	 * }
	 */
public abstract double area ();
}
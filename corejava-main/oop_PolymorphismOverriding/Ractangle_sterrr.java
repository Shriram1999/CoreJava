package oop_PolymorphismOverriding;

public class Ractangle_sterrr extends Shape_setrrr {
	private int length;
    private int width;
    
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area() {
		double d =length*width;
		return d;
		
	}

}

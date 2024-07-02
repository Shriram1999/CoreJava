package oop_PolymorphismOverriding;

public class Triangle extends Shape {
	private int base;
	private int hight;
	
	public Triangle(int base, int hight) {
		this.base= base;
		this.hight= hight;
	}
    public Triangle () {
    	
    }
	public int getBase() {
		return base;
	}
	public int getHight() {
		return hight;
	}
	public double area() {
		double d = (hight*base)/2;
		return d;
	}
	
	

}

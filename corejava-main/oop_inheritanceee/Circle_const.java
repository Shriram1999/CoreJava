package oop_inheritanceee;

public class Circle_const {
	private int radius;
	
	
    public Circle_const() {	
    }
    public Circle_const(int radius) {
    	this.radius = radius;
    } 
	public int getRadius() {
		return radius;
	}
public  void area() {
    	
		double d= Shape.PI*radius*radius;
		System.out.println(d);
    }
	

}

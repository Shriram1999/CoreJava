package oop_inheritanceee;

public class Circle extends Shape{
	private int radius;
    
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
    public  void area() {
    	
		double d= Shape.PI*radius*radius;
		System.out.println(d);
    }
    }
    


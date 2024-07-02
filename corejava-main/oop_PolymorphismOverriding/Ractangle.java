package oop_PolymorphismOverriding;

public class Ractangle extends Shape {
	private int length;
	private int width;
	
	 
	public Ractangle(int length, int width) {
		this.length= length;
		this.width= width;
		
	}


	public int getLength() {
		return length;
	}


	public int getWidth() {
		return width;
	}
	
    public double area() {
	   double d = length*width;
	return d;
	   
   }

}

package oop_inheritanceee;

public class Ractrangle_const {
	private int length;
	private int width;
	
	public Ractrangle_const(int length,int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	  public  void area() {
	    	
			double d= length*width;
			System.out.println(d);
			
	}

}

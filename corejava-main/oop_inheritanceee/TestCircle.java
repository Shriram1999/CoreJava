package com.rays.oop_inheritanceee;

public class TestCircle {
	public static void main(String[] args) {
	
		Circle c= new Circle();
		c.setColor("Red");
		c.setBorderWidth(3);
		c.setRadius(5);
		System.out.println("Circle color :" +c.getColor());
		System.out.println("Circle Borderwidth :" +c.getBorderWidth());
		//System.out.println("Circle :" +c.area() );
		c.area();
		System.out.println();
		
		Rectangle r= new Rectangle();
		r.setLength(8);
		r.setWidth(20);
		r.setColor("black");
		r.setBorderWidth(4);
		System.out.println("Rectangle lenght :"+r.getLength());
		System.out.println("Rectangle width :"+r.getWidth());
		r.area();
		System.out.println();
		
		Triangle t= new Triangle();
		t.setBase(20);
		t.setHight(23);
		t.setColor("blue");
		t.setBorderWidth(5);
		
		System.out.println("Triangle base :" +t.getBase());
		System.out.println("Triangle hight :" +t.getHight());
		t.area();
	}

}

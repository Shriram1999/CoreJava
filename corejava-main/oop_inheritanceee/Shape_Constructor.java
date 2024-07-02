package oop_inheritanceee;

public class Shape_Constructor {

	private String color;
	private int borderWidth;
	
	public static final float PI =3.14f;
	
	public Shape_Constructor(String color, int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
	}
	public Shape_Constructor() {
		
	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;

	}	
}

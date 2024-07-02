package oop_PolymorphismOverriding;

public class Return_type {
	public static void main(String[] args) {
		
		System.out.println(getShape(1).area());
		System.out.println(getShape(2).area());
		System.out.println(getShape(3).area());
		System.out.println(getShape(5));
	}
	
	
	public static Shape getShape(int i) {
		if (i==1)
			return new Circle(5);
		if (i==2)
			return new Ractangle(20,10);
		if (i==3)
			return new Triangle(15,25);
		return null;
	}

}

package oop_PolymorphismOverriding;

public class Test_Overriding {
	public static void main(String[] args) {
		
		
	Shape c= new Circle(5);
	System.out.println(c.area());

	System.out.println();
	
	Shape r = new Ractangle(8,20);
	
	System.out.println(r.area());
	
	System.out.println();
	
	Shape t = new Triangle(20,23);
	
	System.out.println(t.area());
	}

	
	
}
	



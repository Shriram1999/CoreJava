package oop_PolymorphismOverriding;

public class Test_Overridingarrr {
	
	public static void totalarea(Shape []s) {
		double total =0;
		for (int i = 0; i < s.length; i++) {
			total = total+ s[i].area();
		}
		System.out.println("total : "+total);
	}
	public static void main(String[] args) {
		
	
	
	Shape[]s = new Shape[3];
	     s[0] = new Circle(8);
	     s[1] = new Triangle(20,33);
	     s[2] = new Ractangle(10,20);
	     totalarea(s);
	     
	    /* double total =0;
	     for (int i = 0; i < s.length; i++) {
	     total = total+ s[i].area();
	     }
	     System.out.println("total : "+total);*/
	} 
}

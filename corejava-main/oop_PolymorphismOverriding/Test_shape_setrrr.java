package oop_PolymorphismOverriding;

public class Test_shape_setrrr  {
	
	public static void main(String[] args) {

		Shape_setrrr s= new Circle_setrrr();
		s.setColor("Red");
		s.setBorderWidth(5);
		
		Circle_setrrr c = (Circle_setrrr)s;
		c.setRadius(5);
		System.out.println("Color :"+s.getColor());
		System.out.println("BorderWidth :"+s.getBorderWidth());
		System.out.println(s.area());
		
		System.out.println();
		
		
		Shape_setrrr t = new Triangle_seterrr();
		
		Triangle_seterrr t1 = (Triangle_seterrr)t;
		t.setColor("Yello");
		t.setBorderWidth(5);
		t1.setBase(20);
		t1.setHight(20);
	
		System.out.println("Color :"+t.getColor());
		System.out.println("BorderWidth :"+t.getBorderWidth());
		System.out.println(t.area());
		
		System.out.println();
		
		Shape_setrrr r= new Ractangle_sterrr();
		Ractangle_sterrr r1 = (Ractangle_sterrr)r;
		r.setColor("Blue");
		r.setBorderWidth(5);
		r1.setLength(25);
		r1.setWidth(11);
		
		System.out.println("Color :"+r.getColor());
		System.out.println("BorderWidth :"+r.getBorderWidth());
		System.out.println(r.area());
		
		
	}

}

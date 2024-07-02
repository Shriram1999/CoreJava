package oop_PolymorphismOverriding;

public class Triangle_seterrr extends Shape_setrrr{
	private int hight;
	private int base;
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public double area() {
		double d =(hight*base)/2;
		return d;
		
	}

	

}

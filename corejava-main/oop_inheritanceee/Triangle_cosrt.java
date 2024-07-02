package oop_inheritanceee;

public class Triangle_cosrt {
	
	private int base;
	private int hight;
	

	public Triangle_cosrt(int base , int hight) {
		this.base = base;
		this.hight = hight;
	}
		public Triangle_cosrt() {
			
		}
		public int getBase() {
			return base;
		}
		public int getHight() {
			return hight;
		}
		   public  void area() {
		    	
				
				double d= base*hight/2;
				System.out.println(d);

		    }
	

}

package oop_PolymorphismOverriding;

public class Overloading_testshap {
	public void add(int a , int b) {
		int c=a+b;
		
		System.out.println(c);
	}
	public void add(int a , int b ,int c) {
		System.out.println(a+b+c);
	}
	public void add(int a , double b ) {
		System.out.println(a+b);
	}
	public void add(double a,double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
	
		Overloading_testshap a= new Overloading_testshap();
		a.add(20, 20);
		a.add(15, 15, 11);
		a.add(25, 2.25);
		a.add(2.74, 8.12);
	}
}
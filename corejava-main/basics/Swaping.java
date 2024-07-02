package com.rays.basics;

public class Swaping {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		//3rd V.             //2 v.
		int c=3;              //a=a+b;
		a=b;                  //b=a-b;
		b=c;
		c=a;                  //a=a-b;
		
		System.out.println(a);
	    System.out.println(b);
		System.out.println(c);

	}

}

package com.rays.Exception;

public class TestException2 {

	public static void main(String[] args) {
		 String name = "vijay";
		 try {
				 System.out.println("Lantgh of name is "+name.length());
				 System.out.println("Charter at 7th position is "+name.charAt(6));
		 }catch(NullPointerException e) {
			 System.out.println("Name can't be null");
		 }catch(StringIndexOutOfBoundsException e) {
			 System.out.println("String is small");
		 
		 }finally{
			 System.out.println("pandit hu me");
		 }
	}
}

package java8;

public class test_even {

	public static void main(String[] args) {
		
		evenNo e = (a)-> {
			
			if (a%2==0) {
				System.out.println("it is evenNo");
				
			}else {
				System.out.println("it is odd");
			}
		};e.even(5);
	}
}

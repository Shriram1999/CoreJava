package exception;

public class TestExceptionnnnnnn3 {

	public static void main(String[] args) {
		try {
		String name = "vijay";
		System.out.println(name.length());
		System.out.println(name.charAt(7));
		
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("error");
			System.exit(0);
		}
		

		
		finally{
			System.out.println("hdghvsbj");
			
		}
	}}
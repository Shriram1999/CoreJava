package exception;

public class UserClass {
	public static void main(String[] args) throws LogingException {
		int val = 5;
	
	LogingException e= new LogingException();
	if(val>1)
		try {
			throw e;
		} catch (LogingException a) {
			//a.printStackTrace();
			System.out.println(a.getMessage());
			
		}
        else {
	System.out.println("ghggh");
}
	}
	}

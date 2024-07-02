package exception;



public class throws_exception {

	public static void main(String[] args) throws LogingException {
		auth("Aakash");
	}

	private static void auth(String user) throws LogingException {
		if(!user.equals("Admin")) {
			LogingException e= new LogingException();
			throw e;
		}
		
	}
}

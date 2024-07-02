package concuree_thred;

public class testrunnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new rrrunnable("trun"));
		Thread t2 = new Thread(new rrrunnable("Rathod"));
		
		t1.start();
		t2.start();
	}

			
}

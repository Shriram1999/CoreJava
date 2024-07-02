package concuree_thred;

public class HelloWithThread extends Thread {

	private String Name;

	public HelloWithThread(String name) {
		
		Name = name;
		
	}


	

	/*public String getName() {
		return Name;
	}*/

	public void run() {
	
		for (int i = 0; i < 50; i++) {
			System.out.println(i+ Name);
		}
	}
	
	}
	
	


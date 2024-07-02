package concuree_thred;

public class rrrunnable implements Runnable {
	private String Name;

	public rrrunnable(String name) {
		
		Name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+ Name);
		}		
	}

	}


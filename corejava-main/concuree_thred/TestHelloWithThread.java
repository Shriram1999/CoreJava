package concuree_thred;

public class TestHelloWithThread {

	
	public static void main(String[] args) {
		
		HelloWithThread h = new HelloWithThread("Aakash");
		HelloWithThread h1 = new HelloWithThread("Rathod");
		
		//h.run();
		//h1.run();
		h.start();
		h1.start();
	}
}

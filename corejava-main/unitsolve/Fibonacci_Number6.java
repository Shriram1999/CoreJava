package unitsolve;

public class Fibonacci_Number6 {
	public static void main(String[] args) {
		
	

	int a = 0;
	int b =1;
	int i= 0;
	while(i<=10) {
		System.out.print(a);
		System.out.print(" ,");
		i++;
		int c = (a+b);
		a=b;
		b=c;

}
}
}
package java8;

public class Test_CLC {

	public static void main(String[] args) {
	
		Calculater add= (a,b)->{
			System.out.println(a+b);
		};add.cal(35,6);
		
		Calculater sub = (a,b)->{
			System.out.println(a-b);
		};sub.cal(35,6);
		
		
		Calculater multi = (a,b)->{
			System.out.println(a*b);
		};multi.cal(35,6);
		
		
		
		Calculater div = (a,b)->{
			System.out.println(a/b);
		};div.cal(35,6);
		
		
	}
}

package oop_constructor_another;

public class SavingAccount extends Account{
 
	public int getAmount() {
		//int i = super.getAmount() +10;
		return 10;
		
	}
	public static void main(String[] args) {
		Account a= new Account();
		SavingAccount s = new SavingAccount();
		Account as = new SavingAccount();
		
		System.out.println(a.getAmount());
		System.out.println(s.getAmount());
		System.out.println(as.getAmount());
	}
}

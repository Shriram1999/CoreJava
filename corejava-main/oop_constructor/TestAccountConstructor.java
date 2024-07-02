package oop_constructor;

public class TestAccountConstructor {
	public static void main(String[] args) {

	
	AccountConstructor a= new AccountConstructor("35636765","Saving",10000);
	a.fundTransfer(1000);
	a.payBill(500);
	a.deposit(20000);
	a.withdrowl(200);
	System.out.println("Number "+a.getNumber());
     System.out.println("AccountType "+a.getAccountType());
     System.out.println("Balance "+a.getBalance());
	


	}

	}

	
		

	


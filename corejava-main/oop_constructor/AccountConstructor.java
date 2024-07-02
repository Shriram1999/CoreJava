package oop_constructor;

public class AccountConstructor {
	
	private String number;
	private String accountType;
	private double balance;
	
	public AccountConstructor(String number,String accountType,double balance) {
		this.number=number;
		this.accountType=accountType;
		this.balance=balance;
	}
	 public AccountConstructor() {
		 System.out.println("Default Constructor");
	 }

	
	
	public String getNumber() {
		return number;
	}
	public String getAccountType() {
		return accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		  balance=balance+amount;
	 }
	 public void withdrowl(double amount) {
		   balance= balance-amount;
	 }
	public void fundTransfer(double amount) {
		 balance=balance-amount;
	}
	public void payBill(double amount) {
		balance =balance- amount;
	}
}

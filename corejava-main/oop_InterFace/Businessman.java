package oop_InterFace;

import oop_InterFace.Richman.richman;

public class Businessman implements richman,SocialWorker {

	private String name;
	private String address;
	
	public Businessman(String name,String address) {
		this.name=name;
		this.address=address;
	}



	@Override
	public void earnMoney() {
		System.out.println("earnMoney");
	}

	@Override
	public void donation() {
		System.out.println("donation");
		
	}

	@Override
	public void party() {
		System.out.println("party");
	}



	@Override
	public void helpToOther() {
		System.out.println("helpToOtgher");
	}

	public static void main(String[] args) {
		Businessman b= new Businessman ("Aakash", "indore");
		
		System.out.println("Name :"+b.name);
		System.out.println("Address :"+b.address);
		b.earnMoney();
		b.donation();
		b.party();
		b.helpToOther();
	}
}

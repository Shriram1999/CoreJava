package oop_constructor_another;

public class Person {
	
	
	protected  String firstName;
	protected String  lastName;
	protected String address;
	
	public Person() {
		System.out.println("Person Default constructorr");
	}
	/*public void ChangAddress() {
		System.out.println("Person change Address");
	}*/
   public Person(String fn,String ln) {
	firstName= fn;
	lastName= ln;
	System.out.println("2 params is constructor is called "+fn+ln);
  }
   public Person(String fn ,String ln, String address) {
	   this(fn,ln);
	   this.address= address;
	   System.out.println("3 params is constructor is called "+fn+ln+address);
	   
   }
   //public static void main(String[] args) {
	   
	 //  Person p = new Person("Aakash ","Rathod ","indore");}
}

package oop_constructor_another;

public class Employee extends Person {
	private String designation;
	
        public Employee() {
	    
		System.out.println("Defult constructor");
	}
        //(change address k liye)
       /* public void ChangAddress() {
    		System.out.println("Khargone");
    	} */ 
	public Employee(String fn , String ln , String des) {
	    super(fn,ln);
	   // super.ChangAddress();
		designation = des;
		System.out.println("3 params constructor "+fn+ln+des);
		//System.out.println("Employ Change Address");
	}
	public static void main(String[] args) {
		Employee E = new Employee("Aakash ","Rathod ","CA");
		//E.ChangAddress();
	}
	
	

}

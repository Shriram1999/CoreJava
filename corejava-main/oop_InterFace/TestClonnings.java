package oop_InterFace;

public class TestClonnings {
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Address a = new Address();
		a.setState(" M.P.");
		a.setCity("Khargon");
		a.setTown("Singun");
		
		Address a1 = (Address)a.clone();
		a1.setCity("indore");
		  
		
		
		Employee e = new Employee();
		e.setName("Aakash");
		e.setId(143);
		e.setAddress(a1);
		

       Employee e1 = (Employee)e.clone();
       System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getAddress().getState());
		System.out.println(e.getAddress().getCity());
		System.out.println(e.getAddress().getTown());
		System.out.println("------------");
		
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		System.out.println(e1.getAddress().getState());
		System.out.println(e1.getAddress().getCity());
		System.out.println(e1.getAddress().getTown());
		
	}
}

package oop_constructor;

public class TestAutoMobileCostru {
	public static void main(String[] args) {

		AutoMobileContructor a = new AutoMobileContructor("Red", "TATA", 200);
		a.accelerator();
		System.out.println("car color :" + a.getColore());
		System.out.println("maker by :" + a.getMake());
		System.out.println("Car speed :" + a.getSpeed());
		a.ChangeGear();
		System.out.println("No_of_gear :" + a.NO_OF_GEARS);

	}
}
package in.co.constructor;

public class TestAutoMobileCostru {
	public static void main(String[] args) {

		AutoMobileContructor a = new AutoMobileContructor("Red", "TATA");
		a.accelerator();
		System.out.println("car color :" + a.getColore());
		System.out.println("maker by :" + a.getMake());
		//System.out.println("Car speed :" + a.getSpeed());
		a.ChangeGear(120);
		//System.out.println("No_of_gear :" + a.NO_OF_GEARS);

	}
}
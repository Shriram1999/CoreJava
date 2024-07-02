package com.rays.Exception;

public class TestException {

	public static void main(String[] args) {

		try {
			String name = "vijay";
			//System.err.println("Lantgh of name is " + name.length());
			System.out.println("Charter at 7th position is " + name.charAt(7));
			try {
				double div = 15 / 3;
				System.err.println(div);

			} catch (ArithmeticException e) {

				System.out.println(e.getMessage());
			}

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			try {
				double div = 225 / 0;
				System.out.println(div);
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
				//System.exit(0);
			}
			//(Exceotion h to Finally n hi chalega);
			System.exit(0);
		}

		finally {
			System.out.println("I am finally");
			try {
				String s = null;
				System.out.println("Langht of name is" + s.length());
			} catch (Exception e) {
				System.out.println("String null");
			}
		}
	}

}

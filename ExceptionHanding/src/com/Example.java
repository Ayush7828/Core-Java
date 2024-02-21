package com;

public class Example {

	public static void main(String[] args) {

		int a = 10, b = 0, c;
		try {
			c = a / b;
			System.out.println("Divisionm" + c);
		}

		catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("Not Divide Zero ");
		}

//		catch (Exception e) {
//			System.out.println(e);
//			System.out.println("Not Divide Zero ");
//		}
		System.out.println("Main Method Ended");

// exception aaye hai y -->		java.lang.ArithmeticException: / by zero
	}
}

//Exception Handle karte hai to last tak program run hota hain 
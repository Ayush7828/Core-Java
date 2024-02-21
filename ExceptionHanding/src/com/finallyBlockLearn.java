package com;

public class finallyBlockLearn {

	public static void main(String[] args) {

		try {
			System.out.println("Ayush");
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
			System.out.println("All");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Subscribe");
		}
		System.out.println("Main Method Ends");

	}

}

/*
 * Ayush java.lang.ArithmeticException: / by zero Subscribe Main Method Ends
 */

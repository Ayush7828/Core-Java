package com;

public class NumberFormatExceptionLearn {

	public static void main(String[] args) {
		String name = "Ayush";

		try {
//			Exception in thread "main" java.lang.NumberFormatException: For input string: "Ayush"
			int nm = Integer.parseInt(name);
			System.out.println(nm);
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("Not Convert string to Int");
		}
		System.out.println("Main Program End");

	}

}

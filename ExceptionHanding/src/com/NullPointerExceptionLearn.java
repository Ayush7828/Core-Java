package com;

public class NullPointerExceptionLearn {

	public static void main(String[] args) {

		String s = null;

		try {
			System.out.println(s.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("Do not write NUll ");
		}
		System.out.println("Main Program Ended ");

	}

}

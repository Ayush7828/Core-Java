package com.methodOverriding;

public class Parent {
	final void hello() {
		System.out.println("Good Morning");
	}

	public static void add() {
		int a = 10, b = 20;
		int c = a + b;
		System.out.println(c);
	}

	void property() {
		System.out.println("HOuse ,car,BaNk Balance");
	}

	void marry() {
		System.out.println("Gril A ");
	}
}

class Child extends Parent {

	/*
	 * Final Variable method and class Can't Override because if declare final so
	 * means cannot change it
	 * 
	 * error
	 * 
	 * void hello() { System.out.println("Good Morning"); }
	 */
	/* Yes Static Method Override */
	public static void add() {
		int a = 10, b = 20;
		int c = a + b;
		System.out.println(c);
	}

	void marry() {
		System.out.println("Gril B ");
	}
}
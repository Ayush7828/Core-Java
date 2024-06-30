package com.praticestatic;

public class B {

	static int a;
	int b;;

	public static void m1() {
		System.out.println("I am static method");
	}

	public void m2() {
		System.out.println("Normal method");
	}

	public static void main(String[] args) {
		B b = null;

		System.out.println(b.a);
		// System.out.println(b.b); // this line gives exception Exception ||
		// java.lang.NullPointerException:

		b.m1();
		b.m2(); // this line gives exception Exception

	}
}

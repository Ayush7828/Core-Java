package com.methodOverloading;

public class Demo {
	void add() {
		int a = 45, b = 78, c;
		c = a + b;
		System.out.println("Additon = " + c);

	}

	void add(int a, int b) {
		int c = a + b;
		System.out.println("Addtion= " + c);

	}

	void add(int a, int b, double c) {
		double ans = a + b + c;
		System.out.println("Addtion= " + ans);

	}

	void multiply() {
		int a = 7, b = 8, c;
		c = a * b;
		System.out.println("Multiply = " + c);
	}

	void multiply(int a, int b) {
		int c = a * b;
		System.out.println("Muliply = " + c);
	}
}

class Test {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.add();
		d1.add(78, 20);
		d1.add(5, 7, 89.4);
		d1.multiply();
		d1.multiply(7, 3);
	}
}
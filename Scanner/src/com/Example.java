package com;

import java.util.Scanner;

class Demo {
	Scanner sc = new Scanner(System.in);

	void addition() {
		System.out.println("Enter a two number ");
		int a = sc.nextInt(), b = sc.nextInt(), c;
		c = a + b;
		System.out.println("Addtion = " + c);

	}

	void subtraction() {
		System.out.println("Enter a two number ");
		int a = sc.nextInt(), b = sc.nextInt(), c;
		c = a - b;
		System.out.println("Subtract = " + c);

	}

	void multiply() {
		System.out.println("Enter a two number ");
		int a = sc.nextInt(), b = sc.nextInt(), c;
		c = a * b;
		System.out.println("Multiply = " + c);

	}

	void division() {
		System.out.println("Enter a two number ");
		int a = sc.nextInt(), b = sc.nextInt();
		double c;
		c = a / b;
		System.out.println("Division = " + c);

	}

	void disccount() {
		System.out.println("Enter a product amount ");
		int product = sc.nextInt();

		if (product > 50000) {
			double discount = product * 0.3;
			double p = discount - product;
			System.out.println("Apply for 30% discount = " + discount + " Final Amount you Pay " + p);

		} else {
			System.out.println("Sorry Not Applicable Disocunt " + product);
		}
	}

	void employeesalarincremnt() {
		System.out.println("Enter a salary ");
		double salary = sc.nextDouble();
		if (salary > 100000) {
			double incremntamount = salary * 0.30;
			double add = incremntamount + salary;
			System.out.println("Salary " + incremntamount + " Your Final Salary " + add);
		} else {
			System.out.println("Not Eligible");
		}
	}

}

public class Example {
	public static void main(String[] args) {
		// System.out.println("Enter a number ");
		Demo d1 = new Demo();
		d1.addition();
		d1.subtraction();
		d1.multiply();
		d1.division();
		d1.disccount();
		d1.employeesalarincremnt();

	}

}

package com.learnInternclasscommunicationandmethods;

public class Tester {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();

		double sumC = c1.add(12, 12);
		System.out.println("Addtion" + sumC);

		double avg_c = c1.average(12, 14);
		System.out.println(avg_c);

		double discount = c1.discountCaculate(10, 50);
		System.out.println(discount);

	}
}

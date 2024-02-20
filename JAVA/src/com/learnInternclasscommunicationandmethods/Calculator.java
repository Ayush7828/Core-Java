package com.learnInternclasscommunicationandmethods;

public class Calculator {
	double add(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}

	double average(double n1, double n2) {
		Calculator c1 = new Calculator();
		double sum = c1.add(n1, n2);
		double avg = (sum) / 2.0d;
		return avg;
	}

	double discountCaculate(double a, double b) {
		Calculator c1 = new Calculator();
		double dis = c1.average(a, b);

		double disAns = (dis * 15) / 100d;
		return disAns;
	}
}

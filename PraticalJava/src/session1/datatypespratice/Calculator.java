package session1.datatypespratice;

public class Calculator {

	int a = 1, b = 12;
	// double c, d = 15;

	int addition() {
		int add = a + b;
		return add;
	}

	double subtract(double a, double b) {
		double sub = a - b;
		return sub;
	}

	double average() {
		Calculator ob = new Calculator();
		double sum = ob.addition();
		double avg = sum / 2;
		return avg;

	}
}

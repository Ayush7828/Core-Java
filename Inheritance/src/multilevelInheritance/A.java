package multilevelInheritance;

public class A {
	int a, b, c;

	void add() {
		a = 45;
		b = 78;
		c = a + b;
		System.out.println("Add = " + c);

	}

	void subtract() {
		a = 145;
		b = 78;
		c = a - b;
		System.out.println("Subtract = " + c);

	}
}

class B extends A {
	void multiply() {
		a = 4;
		b = 7;
		c = a * b;
		System.out.println("Multiply = " + c);

	}
}

class C extends B {
	void division() {
		a = 15;
		b = 2;
		c = a / b;
		System.out.println("Division = " + c);

	}
}
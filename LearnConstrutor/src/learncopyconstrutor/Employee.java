package learncopyconstrutor;

public class Employee {

	int a, b;

//	Employee() {
//		a = 45;
//		b = 78;
//		System.out.println("1st Construtor " + a + " " + b);
//	}
//
//	Employee(Employee em) {
//		a = em.a;
//		b = em.b;
//		System.out.println("2st Construtor " + a + " " + b);
//	}

	Employee(int x, int y) {
		a = x;
		b = y;
		System.out.println("1 Parameterized COnstrutor " + a + " " + b);
	}

	Employee(Employee ob) {
		a = ob.a;
		b = ob.b;
		System.out.println("2nd Parametrized Construtor " + a + " " + b);
	}
}

class Test {
	public static void main(String[] args) {
		Employee obj = new Employee(4, 7);

		Employee obj2 = new Employee(obj);

	}
}
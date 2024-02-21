package learnThrowAndThrows;

public class Demo {
	void div(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("0 value not take");

			/*
			 * pass O kiye hai to exception aaye hai Exception in thread "main"
			 * java.lang.ArithmeticException at
			 * ExceptionHanding/learnThrowAndThrows.Demo.div(Demo.java:6) at
			 * ExceptionHanding/learnThrowAndThrows.Demo.main(Demo.java:23)
			 */
		} else {
			int c = a / b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {

		/* Best Pratic Main method Try catch Block Use */

//		int age = 15;
//
//		if (age < 18) {
//			throw new Exception("Not Eligible for vote");
//		} else {
//			System.out.println("");
//		}
		Demo d = new Demo();
		try {

			d.div(6, 0);
		} catch (ArithmeticException r) {
			System.out.println("O value Not Take");
		}
	}

}

package functionalinterfacelearn;

public class TestInterface {

	public static void main(String[] args) {
		MyInterface obj = new MyInterface() {
			public void compute(int a, int b) {
				System.out.println("Addition" + a + b);
			};
		};
		obj.compute(10, 20);

		MyInterface obj2 = new MyInterface() {
			public void compute(int a, int b) {
				System.out.println("Multiply = " + a * b);
			};
		};
		obj2.compute(10, 20);
	}
}

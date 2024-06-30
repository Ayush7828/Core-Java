package lambdaexpression;

public class TestLambdaEx {
	public static void main(String[] args) {
		Myinterface obj = (int a, int b) -> {
			System.out.println("Addition = " + (a + b));
		};
		obj.compute(10, 40);
	}
}

package basicProgramsPratice;

class UseThirdVairableSwap {
	int a = 10, b = 20;

	void program() {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
}

public class SswapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseThirdVairableSwap obj = new UseThirdVairableSwap();
		obj.program();

	}

}

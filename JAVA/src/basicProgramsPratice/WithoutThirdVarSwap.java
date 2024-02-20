package basicProgramsPratice;

class Number {
	int a = 10, b = 20;

	void programswap() {
		a = a + b; // 30
		b = a - b;// b=10-20=10
		a = a - b;// 30=30-10=20
		System.out.println(a + " " + b);
	}
}

public class WithoutThirdVarSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number obj = new Number();
		obj.programswap();

	}

}

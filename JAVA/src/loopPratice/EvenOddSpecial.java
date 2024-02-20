package loopPratice;

class SymbolEvenOdd {
	int num = 8;

	void program() {
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println("-" + i);
			} else {
				System.out.println(i);
			}
		}
	}

}

public class EvenOddSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymbolEvenOdd obj = new SymbolEvenOdd();
		obj.program();

	}

}

package NestedLoop.NumberPattern;

class Pattern4 {
	void program2() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
}

public class NumberPattern4 {

	public static void main(String[] args) {
		Pattern4 obj = new Pattern4();
		obj.program2();

	}
}
//5
//44
//333
//2222
//11111
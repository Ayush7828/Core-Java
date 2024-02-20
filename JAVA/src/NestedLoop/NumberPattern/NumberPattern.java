package NestedLoop.NumberPattern;

class Pattern1 {
	void program() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 obj = new Pattern1();
		obj.program();

	}

}
//1
//12
//123
//1234
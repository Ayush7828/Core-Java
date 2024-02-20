package NestedLoop.NumberPattern;

class Pattern2 {
	void programpattern2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2 obj = new Pattern2();
		obj.programpattern2();

	}

}
//12345
//1234
//123
//12
//1

package NestedLoop.NumberPattern;

class Pattern5 {
	void numberprogrampattern5() {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

public class NumberPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern5 obj = new Pattern5();
		obj.numberprogrampattern5();

	}

}

//54321
//4321
//321
//21
//1
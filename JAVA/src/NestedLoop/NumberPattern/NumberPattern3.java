package NestedLoop.NumberPattern;

class Pattern3 {
	void program1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public class NumberPattern3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Pattern3 obj = new Pattern3();
			obj.program1();

		}
	}

}
//program1
//1
//22
//333
//4444
//55555
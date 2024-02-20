package NestedLoop.StarPattern;

class Star5 {
//	 ****
//	  ***
//	   **
//	    *
	void program() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class Star5Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star5 obj = new Star5();
		obj.program();

	}

}

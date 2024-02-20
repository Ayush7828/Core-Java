package NestedLoop.StarPattern;

class Star4 {

//	    *
//	   **
//	  ***
//	 ****
	void program() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class Star4Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star4 obj = new Star4();

		obj.program();
	}

}

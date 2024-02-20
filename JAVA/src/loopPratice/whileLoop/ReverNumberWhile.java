package loopPratice.whileLoop;

class ProgramReverse {

	int n = 1234, rem, rev = 0;

	void reverseProgram() {
		while (n > 0) {
			rem = n % 10;

			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.print("Reverse Number = " + rev);

	}

}

public class ReverNumberWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramReverse obj = new ProgramReverse();
		obj.reverseProgram();

	}

}

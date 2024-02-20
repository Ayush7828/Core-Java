package loopPratice;

import java.util.Scanner;

class ProgramRev {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt(), reverse = 0;

	void programreverse() {
		while (number != 0) {
			int lastdigit = number % 10;/* Remainder find */
			reverse = reverse * 10 + lastdigit;
			number /= 10; /* quotient fond */
		}
		System.out.println(reverse);
	}

}

public class ReverseNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a numebr ");
		ProgramRev obj = new ProgramRev();
		obj.programreverse();

	}

}

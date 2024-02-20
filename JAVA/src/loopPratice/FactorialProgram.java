package loopPratice;

import java.util.Scanner;

class CalculateFactorial {
	int programfact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;

		}
		System.out.println("Fcatorial Number = " + fact);

		return fact;
	}
}

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number = ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		CalculateFactorial obj = new CalculateFactorial();
		obj.programfact(number);

	}

}

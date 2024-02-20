package loopPratice;

import java.util.Scanner;

class CalculateFibonacci {

	int programfib(int n) {
		int t1 = 0, t2 = 1, t3;

		for (int i = 0; i <= n; i++) {
			System.out.println(t1);
			t3 = t1 + t2;

			t1 = t2;
			t2 = t3;

		}

		return 1;
	}
}

public class FibonacciProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		CalculateFibonacci obj = new CalculateFibonacci();
		obj.programfib(number);

	}

}

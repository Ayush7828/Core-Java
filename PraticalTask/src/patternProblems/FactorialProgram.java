package patternProblems;

import java.util.Scanner;

public class FactorialProgram {

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("Enter  a number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = factorial(n);
		System.out.println(ans);
	}

}

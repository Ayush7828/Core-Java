package loopPratice;

import java.util.Scanner;

class CheckPerfectNumber {
	int sum = 0;

	int numberperfect(int n) {
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n) {
			System.out.println("Yes it is A perfect number " + n);
		} else {
			System.out.println("No it is not a perfect Number " + n);
		}
		return sum;
	}

}

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		CheckPerfectNumber obj = new CheckPerfectNumber();

		obj.numberperfect(num);

	}

}

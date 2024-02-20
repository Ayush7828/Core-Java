package loopPratice;

import java.util.Scanner;

class NNaturalNumberSum {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt(), ans = 0;

	public int sum() {
		for (int i = 0; i <= number; i++) {
			ans += i;

		}
		return ans;

	}
}

public class SumNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a numebr = ");

		NNaturalNumberSum obj = new NNaturalNumberSum();

		System.out.println("Sum of N Natural Number " + obj.sum());

	}

}

package questionsPratice;

import java.util.Scanner;

class Example {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(), evsum = 0, odsum;

	void Program() {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				evsum += i;

				System.out.println("Even " + i + "sum " + evsum);
			} else {
				odsum += i;
				System.out.println("Odd " + i + "sum " + odsum);
			}
		}

	}
}

public class EvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter A NUMBER ");
		Example obj = new Example();

		obj.Program();

	}

}

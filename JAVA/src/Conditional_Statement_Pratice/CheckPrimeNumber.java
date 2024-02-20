package Conditional_Statement_Pratice;

import java.util.Scanner;

class PrimeNumberProgram {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int count = 0;
	boolean isprime = true;

	void checkNumberprime() {
		if (num < 2) {

			isprime = false;

		}
		for (int i = 0; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("The Number is Not prime");
		} else {
			System.out.println("The NUmber is prime");
		}
	}
}

public class CheckPrimeNumber {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		PrimeNumberProgram obj = new PrimeNumberProgram();
		obj.checkNumberprime();

	}

}

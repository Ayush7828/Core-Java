package Conditional_Statement_Pratice;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count += 1;

			}
		}

		if (count == 2) {
			System.out.println("Pime");
		} else {
			System.out.println("No prime");
		}

	}

}

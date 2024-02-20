package Conditional_Statement_Pratice;

import java.util.Scanner;

class NumberLargestThreeCheck {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

	void numberLargestCheck() {
		if (a > b && a > c) {
			System.out.println("A is Greater " + a);
		} else if (b > a && b > c) {
			System.out.println("B is Greater " + b);
		} else {
			System.out.println("C is Greater " + c);
		}
	}

}

public class CheckLargestNumberThree {
	public static void main(String[] args) {
		System.out.println("Enter a Three Numbers ");

		NumberLargestThreeCheck obj = new NumberLargestThreeCheck();
		obj.numberLargestCheck();
	}
}

package Conditional_Statement_Pratice;

import java.util.Scanner;

// pallidrome number vo hote hai jis ulta padne m same ho
class CheckPallidorme {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int orinalNumber = number;
	int rev = 0, rem;

	void code() {

		while (number > 0) {
			rem = number % 10;

			rev = rev * 10 + rem;
			number /= 10;

		}

		if (orinalNumber == rev) {
			System.out.println(" yes It is pallidrome " + rev);
		} else {
			System.out.println(" No It is Not a Pallidrome Number " + rev);
		}
	}
}

public class PallidromeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a number = ");
		CheckPallidorme obj = new CheckPallidorme();
		obj.code();

	}

}

package Conditional_Statement_Pratice;

import java.util.Scanner;

class CheckNumberPositiveNeagtive {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();

	void checkNumberPositiveNeagtive() {
//		Greater then 0
		if (number > 0) {
			System.out.println("It is Positive Number " + number);
		}
//             Less the 0
		if (number < 0) {
			System.out.println("It is Negative Number " + number);
		}

	}
}

public class PositiveNeagtiveNumber {
	public static void main(String[] args) {
		System.out.print("Enter a Number ");
		CheckNumberPositiveNeagtive ob = new CheckNumberPositiveNeagtive();
		ob.checkNumberPositiveNeagtive();

	}
}

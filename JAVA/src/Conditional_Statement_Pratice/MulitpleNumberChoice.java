package Conditional_Statement_Pratice;

import java.util.Scanner;

class NumberMulitple {

	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();

	void programChoice()

	{
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (number % 5 == 0) {
			System.out.println("Buzz");
		} else if (number % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println("Coffee");
		}
	}

}

public class MulitpleNumberChoice {

	public static void main(String[] args) {

		System.out.print("Enter a number ");
		NumberMulitple obj = new NumberMulitple();
		obj.programChoice();

	}

}

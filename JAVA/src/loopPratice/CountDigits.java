package loopPratice;

import java.util.Scanner;

class NumberOfcDigitsCount {
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt(), count = 0;

	void programDigitCount() {
		for (int i = 0; i < number; i++) {
			int lastdigit = number % 10;
			count++;
			number /= 10;
		}
		System.out.println("Total Digit count = " + count);
	}
}

public class CountDigits {

	public static void main(String[] args) {

		System.out.println("Enter a number ");
		// TODO Auto-generated method stub
		NumberOfcDigitsCount obj = new NumberOfcDigitsCount();
		obj.programDigitCount();
	}

}

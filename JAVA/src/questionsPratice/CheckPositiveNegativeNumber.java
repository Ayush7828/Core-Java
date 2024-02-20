package questionsPratice;

import java.util.Scanner;

public class CheckPositiveNegativeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		if (number > 0) {
			System.out.println("It is Positive Number " + number);
		} else {
			System.out.println("It is Negative Number " + number);
		}
		sc.close();
	}
}

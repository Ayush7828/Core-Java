package loopPratice;

import java.util.Scanner;

public class HarShadNUmber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int result = 0;
		while (num != 0) {
			int lastdigit = num % 10;
			result += lastdigit;
			num /= 10;

		}
		if (num % result == 0) {
			System.out.println("Harshad Number " + result);
		} else {
			System.out.println("Not Harshad Number " + result);
		}
	}

}

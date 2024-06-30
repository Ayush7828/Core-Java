package customexception.runtimeexception;

import java.util.Scanner;

public class TestVoting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a your age ");
		int age = sc.nextInt();

		if (age < 18) {
			throw new UnderAge("Hello sir Your are not eligible for vote");
		} else {
			System.out.println("You are eligible for voting");

		}
	}

}

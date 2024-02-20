package loopPratice;

import java.util.Scanner;

public class Multiply10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);

		int num = 10;
		for (int i = 1; i <= 3; i++) {
			System.out.println(num);
			num *= 10;
			;
		}

	}

}

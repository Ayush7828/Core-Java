package questionsPratice;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even Number " + num);
		} else {
			System.out.println("Odd Number " + num);
		}
	}

}

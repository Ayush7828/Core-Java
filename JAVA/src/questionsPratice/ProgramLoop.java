package questionsPratice;

import java.util.Scanner;

public class ProgramLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 2 != 0) {
			System.out.println("Weird");
		} else {
			if (num >= 2 && num <= 5) {
				System.out.println("Not Weird");
			} else if (num >= 6 && num <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		}
	}

}

package Conditional_Statement_Pratice;

import java.util.Scanner;

class ProgramMonth {

	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();

	void monthprint() {
		switch (month) {
		case 1:
			System.out.println("January");
			break;

		case 2:
			System.out.println("Feburay");
			break;

		case 3:
			System.out.println("March");
			break;

		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("June");
			break;

		case 6:
			System.out.println("July");
			break;
		case 7:
			System.out.println("August");
			break;
		case 8:
			System.out.println("Septempber");
			break;
		}

	}
}

public class MonthCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a  number ");
		ProgramMonth obj = new ProgramMonth();
		obj.monthprint();

	}

}

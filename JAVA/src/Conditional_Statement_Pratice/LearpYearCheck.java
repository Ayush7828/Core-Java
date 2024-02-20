package Conditional_Statement_Pratice;

import java.util.Scanner;

class ProgramLeapYear {
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();

	void program() {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("It is Leap Year " + year);
		} else {
			System.out.println("It is Not a leap Year " + year);
		}
	}
}

public class LearpYearCheck {

	public static void main(String[] args) {
		System.out.print("Enter a year = ");
		ProgramLeapYear obj = new ProgramLeapYear();
		obj.program();
	}
}

package Conditional_Statement_Pratice;

import java.util.Scanner;

class CheckAge {
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();

	void program() {
		if (age >= 18 && age < 75) {
			System.out.println("Yes it is Eligible");
		} else {
			System.out.println("No it is not elibile");
		}
	}
}

public class CheckAgeEligibilty {

	public static void main(String[] args) {
		System.out.println("Enter a age");
		// TODO Auto-generated method stub
		CheckAge obj = new CheckAge();
		obj.program();
	}

}

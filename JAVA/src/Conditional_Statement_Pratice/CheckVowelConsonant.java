package Conditional_Statement_Pratice;

import java.util.Scanner;

class ProgramVowelConsonant {
	Scanner sc = new Scanner(System.in);

	char ch = sc.next().charAt(0);

	void checkProgram() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("It is vowel " + ch);
		} else {
			System.out.println("It is Consonant " + ch);
		}

	}
}

public class CheckVowelConsonant {

	public static void main(String[] args) {
		System.out.print("Enter a character = ");
		ProgramVowelConsonant obj = new ProgramVowelConsonant();
		obj.checkProgram();

	}

}

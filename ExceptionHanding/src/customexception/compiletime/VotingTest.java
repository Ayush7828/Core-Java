package customexception.compiletime;

import java.util.Scanner;

public class VotingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age ");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new UnderAgeExcpetion();
			}
		} catch (UnderAgeExcpetion e) {
			e.printStackTrace();
		}

	}

}

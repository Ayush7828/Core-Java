package Conditional_Statement_Pratice;

import java.util.Scanner;

public class ArmstrongNumberProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		sc.close();
		int orginalNum, remainder, result = 0;
		orginalNum = num;
		while (orginalNum != 0) {
			remainder = orginalNum % 10;
			result += Math.pow(remainder, result);
			orginalNum /= 10;

		}
		if (result == orginalNum) {
			System.out.println("Yes it is Armstrong Number " + result);
		} else {
			System.out.println("It is not a Armstrong Number " + result);
		}

	}

}

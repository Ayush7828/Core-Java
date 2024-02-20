package Conditional_Statement_Pratice;

import java.util.Scanner;

class ProgramQurad {

	double programquadratic(double a, double b, double c) {
		double result = b * b - 4.0 * a * c;
		if (result > 0.0) {
			double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double r2 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			System.out.println("The Roots are " + r1 + " " + r2);
		} else if (result == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		} else {
			System.out.println("The equation has no real roots.");
		}
		return result;
	}
}

public class QuradticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a b , and c = ");
		ProgramQurad obj = new ProgramQurad();
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		obj.programquadratic(a, b, c);

	}

}

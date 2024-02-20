package Conditional_Statement_Pratice;

import java.util.Scanner;

class PrintGradeAcc {
	Scanner sc = new Scanner(System.in);
	int phy = sc.nextInt(), eng = sc.nextInt(), hindi = sc.nextInt();

	void programmarksgrade() {
		double marks = phy + eng + hindi;
		double grade = marks * 100 / 300;
		if (grade >= 90) {
			System.out.println("A grade " + "Marks =" + marks + " " + "Grade =" + grade + "%");
		}

		else if (grade >= 70 && grade <= 90) {
			System.out.println("B grade " + "Marks =" + marks + " " + "Grade =" + grade + "%");
		}

		else if (grade >= 55 && grade <= 70) {
			System.out.println("B grade " + "Marks =" + marks + " " + "Grade =" + grade + "%");
		}

	}
}

public class GradeCheck {
	public static void main(String[] args) {
		System.out.println("Enter a english physic hindi number ");
		PrintGradeAcc obj = new PrintGradeAcc();
		obj.programmarksgrade();
	}
}

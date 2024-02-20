package loopPratice;

import java.util.Scanner;

class Hcf {
	int hcf = 0;

	int calculateHcf(int num1, int num2) {
		for (int i = 1; i <= num1 || i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
		}
		System.out.println(hcf);
		return hcf;

	}

}

public class HCFProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two number ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Hcf obj = new Hcf();
		obj.calculateHcf(num1, num2);

	}

}

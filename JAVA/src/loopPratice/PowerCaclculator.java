package loopPratice;

import java.util.Scanner;

class Power {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int power = sc.nextInt();

	void program() {
		double ans = Math.pow(power, num);
		System.out.println(ans);
	}

}

public class PowerCaclculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a power and then number ");
		Power obj = new Power();
		obj.program();

	}

}

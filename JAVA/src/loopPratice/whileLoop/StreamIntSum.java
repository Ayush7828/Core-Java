package loopPratice.whileLoop;

import java.util.Scanner;

class SumStreamInteger {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt(), sum = 0;

	void programsumOfStreamInteger() {
		while (num != -1) {
			sum += num;
			num = sc.nextInt();
		}
		System.out.println(sum);
	}

}

public class StreamIntSum {

	public static void main(String[] args) {
		System.out.println("Enter a number ");
		// TODO Auto-generated method stub
		SumStreamInteger obj = new SumStreamInteger();
		obj.programsumOfStreamInteger();

	}

}

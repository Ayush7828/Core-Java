package loopPratice;

import java.util.Scanner;

class TableProgram {
	Scanner sc = new Scanner(System.in);
	int table = sc.nextInt();

	void tablePrintProgram() {
		for (int i = 1; i <= 10; i++) {
//			System.out.println(table * i);
			System.out.println(table + "*" + i + "=" + table * i);
		}
	}

}

public class PrintTableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number ");

		TableProgram obj = new TableProgram();
		obj.tablePrintProgram();
	}

}

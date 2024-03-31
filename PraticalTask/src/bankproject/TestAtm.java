package bankproject;

import java.util.Scanner;

public class TestAtm {

	public static void main(String[] args) {
		ATM a1 = new ATM();

		System.out.println("Enter  a choice ");
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (true) {
			System.out.println("1 for Withdrawal ");
			System.out.println("2 for depsoit ");
			System.out.println("3 for checkBalance ");
			System.out.println("4 for exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter a withraw amount ");
				int amt = sc.nextInt();
				a1.withdraw(amt);
				break;
			case 2:
				System.out.println("Enter a Deposit amount ");
				int depamt = sc.nextInt();
				a1.deposit(depamt);
				break;
			case 3:
				System.out.println("Enter a pin =  ");
				int pin = sc.nextInt();
				a1.setBal(pin);
				System.out.println(a1.getBal(pin));
				break;

			case 4:
				System.exit(4);
				break;
			}
		}
	}

}

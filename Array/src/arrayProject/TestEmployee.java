package arrayProject;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array ");
		int n = sc.nextInt();
		Employee[] db = new Employee[n];

		int choice = 0;
		int i = 0;

		switch (choice) {
		case 1:
			System.out.println("Add a person");
			while (i <= n) {
				System.out.println("Enter employee id ");
				int id = sc.nextInt();
				System.out.println("Enter employee salaray ");
				double sa = sc.nextDouble();
				System.out.println("Enter employee age");
				int age = sc.nextInt();
				Employee obj = new Employee(id, sa, age);
				db[i] = obj;
				i++;
			}
			break;
		case 2:
			System.out.println("Thank you");
			break;

		}
		System.out.println("-------------------------------------------------------------------");
		for (Employee obj : db) {
			System.out.printf("|%5d|\t-10s|\t%-10d|", obj.setEid(id), obj.getEslary(), obj.getAge());
			System.out.println();
			System.out.println("-------------------------------------------------------------------");
		}

	}

}

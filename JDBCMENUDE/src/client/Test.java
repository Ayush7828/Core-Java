package client;

import java.util.List;
import java.util.Scanner;

import com.sit.DAo.EmployeeDaoImpl;
import com.sit.entity.Employee;

public class Test {

	public static void main(String[] args) {
		EmployeeDaoImpl obj = new EmployeeDaoImpl();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1: Save Employee");
			System.out.println("2: Update Emplyee");
			System.out.println("3: Delete Employee");
			System.out.println("4: Fetch All Employee");
			System.out.println("5: Exit");

			System.out.println("Enter  your choice ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter  Employee Name ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.println("Enter Employee Age: ");
				int age = sc.nextInt();

				System.out.println("Enter Employee Salary: ");
				sc.nextLine();
				double salary = sc.nextDouble();
				Employee e = new Employee(name, age, salary);
				obj.save(e);

				break;
			case 2:
				System.out.println("String Employee name  ");
				sc.nextInt();
				String name1 = sc.nextLine();
//   Employee e=new Employee(name1, age, salary)
//				obj.update(e);1

			case 3:
				System.out.println("Enter Employee Id To delete");
				int id = sc.nextInt();
				obj.delete(id);
				break;
			case 4:
				List<Employee> list = obj.fecth();
				System.out.println(list);
				break;
			case 5:
				break;
			}
		}

	}

}

package praticeConstrutor;

public class Student {

//	Task 1
	Student() {

		System.out.println("0 parameterized Construtor");
	}

	Student(int sid, String sname) {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println("2 parameterized Construtor");
	}

	Student(int fees, int sid, String sname) {
		System.out.println("Student fees " + fees);
		System.out.println("Student Id = " + sid);
		System.out.println("Student Name = " + sname);
		System.out.println("3 parameterized Construtor");
	}

}

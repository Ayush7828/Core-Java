package singleInheritance;

public class Student {

	private int rollNo;
	int marks;
	String name;

	public int getroll() {
		return rollNo;
	}

	public void setroll(int r) {
		rollNo = r;
	}

	void input() {
		System.out.println("Enter Roll Number ,marks and name = ");
	}
}

class Tushar extends Student {
	void show() {

		marks = 85;
		name = "Tushar";
		Student obj = new Student();
		obj.setroll(14);
		System.out.println(name + " " + obj.getroll() + "marks = " + marks);

	}
}

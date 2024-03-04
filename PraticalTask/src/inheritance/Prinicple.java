package inheritance;

public class Prinicple {
	public Prinicple() {
		System.out.println("Top Level Class");
	}
}

class Teacher extends Prinicple {
	public Teacher() {
		System.out.println("Teacher Class Sub Class");
	}
}

class SubTeacher extends Teacher {
	public SubTeacher() {

		System.out.println("Studetn Class");
	}

}
package com;

public class Student {
	String name;
	int rollno;
	int phoneno;
	int marks;

	protected Student(String nm, int r, int phn, int m) {
		name = nm;
		rollno = r;
		phoneno = phn;
		marks = m;

	}

	void getdetials() {
		System.out.println("Your name is = " + name);
		System.out.println("Your roll No is " + rollno);

		System.out.println("Your Phone Number is = " + phoneno);
		System.out.println("Your marks is = " + marks);
	}

}

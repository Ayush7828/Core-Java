package com;

public class CollegeStudent {
	private int sid;
	private String sn;
	private int marks;

//	 * Constructor Condition this()
//	 * 
//	 * 1) write first line
//	 * 2) this don't recursion follow
//	 * 
//	 * this concnept also know as Construtor chaining

	CollegeStudent() {
		this("ayush", 10);
		System.out.println("zero Parameterzied Construtor");
	}

	CollegeStudent(String nm, int sid) {

		System.out.println("2 Parameterzied Construtor");
	}

	CollegeStudent(int sid, String sn, int marks) {

		this(); // this line call zero parameterzied Construtor
		this.sid = sid;
		this.sn = sn;
		this.marks = marks;
		System.out.println("3 parameterzied Cons");
	}

	private int add(int a, int b) {
		int c = a + b;
		System.out.println("Additon" + c);
		return c;

	}

	void display() {
		this.add(10, 20);
		System.out.println("Student Name = " + sid);
		System.out.println("Roll Number = " + sid);
		System.out.println("Studnet Marks = " + marks);
	}
}

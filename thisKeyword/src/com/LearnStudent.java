package com;

class Stu {
	Stu(LearnStudent ob) {
		System.out.println("Stu Constructor ");
	}
}

public class LearnStudent {

//	int i;
//
//	void setValue(int i) {
//		this.i = i;
//	}
//
//	void show() {
//		System.out.println(i);
//	}

	/* this keyword can be used to revoke current class method Implicity */
	int i;

	void display() {
		System.out.println("Hello Tushar");
	}

	void show() {
//		by default compiler use this 
		display();
	}
	/* this() is used to call Construtor */

	LearnStudent() {
		this(78);
		System.out.println("Non Paramaterized Construtor ");
	}

	LearnStudent(int a) {

//		this();
		System.out.println("Parameterized Construtor");
	}

	/* this keyword is used to pass as an argument in the method call */
	void m1(LearnStudent ob) {
		System.out.println("M1 Method ");

		Stu obj = new Stu(this);
	}

	void m2() {
		m1(this);
	}

	/* this can be used to pass and argument in the construtor call */

}
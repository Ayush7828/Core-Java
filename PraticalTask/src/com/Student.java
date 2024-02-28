package com;

public class Student {

	int age;
	String name;
	int fees;

	public Student() {
		System.out.println("Hello Student ");

	}

	Student(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("Name = " + name + " " + "Age = " + age);
	}

	Student(String name, int fees, int age) {
		this.name = name;
		this.age = age;
		this.fees = fees;
		System.out.println(name + " " + age + " " + fees);

	}

	private void studentdetial() {
		System.out.println("Student Name " + name);
	}

	// access another package
	protected void studentproject() {

		System.out.println("Student Project submission date ");
	}

	void sage() {
		this.studentdetial();
		System.out.println("Student AGE");

	}

	public void run() {
		System.out.println("Student Run");
	}
}

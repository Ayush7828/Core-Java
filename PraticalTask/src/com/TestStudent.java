package com;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sage();
		s1.run();
		s1.studentproject();

		Student s2 = new Student("ayush", 5000, 14);
		System.out.println();
		Student s3 = new Student(21, "Tushar");

	}

}

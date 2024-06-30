package com.jdbclearn;

public class Main {
	public static void main(String[] args) {
//     Driver load
//		Connection establish
//		statement create
//		Execute Query
//		close connection

		Student s1 = new Student();
//		s1.createdatabase();
//		s1.createtable();
//		s1.showdata();

		s1.createdata();
		s1.readdata();

	}

}

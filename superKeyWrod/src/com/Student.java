package com;

public class Student {
	Student() {

		System.out.println("Super Class Construtor");
	}

	int a = 10;

	void add() {
		double x = 4, y = 7, z;
		z = x + y;
		System.out.println("(Super class ) Add = " + z);
	}

}

class B extends Student {
	B() {
		super(); // this line call Super class Construtor

		System.out.println("Sub Class Constructor");
	}

	int a = 78;

	void show() {

		System.out.println("B = " + a);

		System.out.println("A = " + super.a);// THIS line call super class Variable use super keyword

		/*
		 * Output B = 78 A = 10
		 */

	}

//	Method Use
	void add() {

		super.add(); // this line call parent class Method
		double x = 4, y = 7, z;
		z = x + y;
		System.out.println("(sub class )Add = " + z);
	}

}
package com;

class A {
	static {
		System.out.println("Hello Porgram");
	}
	static {
		System.out.println("Tushar Porgram");
	}
	{
		System.out.println("Ayush");
	}

}

public class AProgram {

	public static void main(String[] args) {
		new A();
		new A();
		new A();

	}

}
//
//Hello Porgram
//Tushar Porgram
//Ayush
//Ayush
//Ayush
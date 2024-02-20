package com.methodOverriding;

public class Example2 {

//	covarient Return Type
	Object show() {
		System.out.println("Hello 1");
		return null;
	}
}

class Xyz extends Example2 {
	String show() {
		System.out.println("Good Morning");
		return null;
	}
}
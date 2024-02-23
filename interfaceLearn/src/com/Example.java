package com;

public interface Example {
	final int a = 4;

	void show();

	public static void run() {
		System.out.println("Horse Run");
	}

	default void add() {
		System.out.println("Addtion");
	}

}

class Exam implements Example {
	@Override
	public void show() {

		System.out.println("Interface " + a);
	}

	public static void run() {
		System.out.println("dog Run");
	}

}
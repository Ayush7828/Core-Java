package com;

public interface Example {
	final int a = 4;

	void show();

}

class Exam implements Example {
	@Override
	public void show() {

		System.out.println("Interface " + a);
	}
}
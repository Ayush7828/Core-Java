package com;

public class Test implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Task 2 ");
	}

	public static void main(String[] args) {
		Test t = new Test();
		Thread t1 = new Thread(t);
		t1.start();
	}

}

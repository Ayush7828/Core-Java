package com;

class MyThread extends Thread {
	public void run() {
		System.out.println("Thrad 1");
	}
}

class MyThread2 extends Thread {
	public void run() {
		System.out.println("Thread 2");
	}
}

class MyThread3 extends Thread {
	public void run() {
		System.out.println("Thread 3");
	}
}

class MyThread4 extends Thread {
	public void run() {
		System.out.println("Thread 4");
	}
}

public class MultipleThread {

	public static void main(String[] args) {
		MyThread ob = new MyThread();
		ob.start();
		MyThread2 ob2 = new MyThread2();
		ob2.start();
		MyThread3 ob3 = new MyThread3();
		ob3.start();
		MyThread4 ob4 = new MyThread4();
		ob4.start();
	}

}

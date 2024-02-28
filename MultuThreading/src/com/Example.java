package com;

public class Example extends Thread {

	// First Way Create Thread

	@Override
	public void run() {
		System.out.println("Thread Task ");
	}

	public static void main(String[] args) {
		Example obj = new Example();
		obj.start();
	}

}

package com.abstractClass;

abstract class Vehicle {
	int noOfTyer;

	abstract void start();
}

class Car extends Vehicle {

	@Override
	void start() {
		noOfTyer = 4;
		System.out.println("Key Start" + noOfTyer);

	}

}

class Scooter extends Vehicle {
	@Override
	void start() {
		noOfTyer = 2;
		System.out.println("Self Start and Kick Start" + noOfTyer);
	}
}

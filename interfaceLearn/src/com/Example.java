package com;

public interface Example {
	final int a = 4;

	abstract void show();

	public default void run() {
		System.out.println("Horse Run");
		this.add();
	}

	private void add() {
		System.out.println("Addtion");
	}

}

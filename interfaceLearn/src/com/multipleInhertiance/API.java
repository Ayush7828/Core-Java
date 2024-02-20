package com.multipleInhertiance;

public interface API {

	default void show() {
		System.out.println("Default Api");
	}

}

interface Test extends API {
	void display();
}

interface Tes2 extends API {
	void Print();

}

class A implements Test, Tes2 {

	@Override
	public void Print() {
		System.out.println("Print APi Data");

	}

	@Override
	public void display() {

		System.out.println("Tushars");

	}

}
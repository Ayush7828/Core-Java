package com.methodOverriding;

// super class
public class Shape {
	void draw() {
		System.out.println("Rectange SHape");
	}
}

// sub Class
class Square extends Shape {
	@Override
	void draw() {
		super.draw(); // super keyword use for call super class method
		System.out.println("Sqaure Shape");
	}
}

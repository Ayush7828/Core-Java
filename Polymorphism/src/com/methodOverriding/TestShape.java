package com.methodOverriding;

public class TestShape {

	public static void main(String[] args) {
		// shape reference varibale
		Shape obj = new Square();
		obj.draw();

		Square ob = new Square();
		ob.draw(); // stub

	}

}

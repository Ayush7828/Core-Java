package com.methodOverriding;

public class TestParent {

	public static void main(String[] args) {
		Parent ob = new Child();
		ob.property();
		ob.marry();
		Parent.add();

	}

}

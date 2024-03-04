package jbk2;

import jbk1.ShoppingMall;

public class TestShoppinMall extends ShoppingMall {

	void s() {
		super.displaymall();
	}

	public static void main(String[] args) {
		TestShoppinMall ob = new TestShoppinMall();
		ob.displaymall();
		ob.s();

	}

}

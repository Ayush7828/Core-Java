package NestedLoop;

class Pattern3 {
	void pattern3print() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class Star3Pattern {

	public static void main(String[] args) {
		Pattern3 obj = new Pattern3();
		obj.pattern3print();
	}

}
//*
//**
//***
//****
//***
//**
//*
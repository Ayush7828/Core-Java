package NestedLoop.StarPattern;

class Star3 {
	void program() {
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
		// TODO Auto-generated method stub
		Star3 obj = new Star3();
		obj.program();

	}

}
//*
//**
//***
//****
//***
//**
//*

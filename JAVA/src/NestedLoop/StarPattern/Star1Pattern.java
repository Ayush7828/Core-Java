package NestedLoop.StarPattern;

class Star1 {
	void program() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class Star1Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star1 obj = new Star1();
		obj.program();

	}

}
//*
//**
//***
//****
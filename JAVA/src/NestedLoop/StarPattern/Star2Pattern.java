package NestedLoop.StarPattern;

class Star2 {
	void program() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

public class Star2Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star2 obj = new Star2();
		obj.program();

	}

}

//*****
//****
//***
//**
//*
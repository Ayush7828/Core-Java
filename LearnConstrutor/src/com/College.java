package com;

public class College {
	College(String name, int mob, int fees) {
		System.out.println("1 construtor call");
		System.out.println("Admmission Sucessful");
	}

	College(String name, int fees) {
		System.out.println("2nd Constructor Call");
		System.out.println("Admission Sucessful");
	}

	College(int fees) {
		System.out.println("3rd Construtor Call");
		System.out.println("Admission Sucessful" + fees);
	}
}

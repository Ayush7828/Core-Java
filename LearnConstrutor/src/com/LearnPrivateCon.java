package com;

public class LearnPrivateCon {

	int a;
	double b;
	String nm;

	private LearnPrivateCon() {
		a = 45;
		b = 78.563;
		nm = "Tushar";
		System.out.println(a + " " + b + " " + nm);
	}

	public static void main(String[] args) {
		LearnPrivateCon obj = new LearnPrivateCon();

	}
}

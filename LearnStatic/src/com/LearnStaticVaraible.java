package com;

class Demo {
	static int a = 45;
	int b = 78;

	static void run() {
		Demo d1 = new Demo();
		System.out.println(d1.b);
		System.out.println(a);
	}
}

public class LearnStaticVaraible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();
		Demo.run();
	}

}

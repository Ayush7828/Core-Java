package compratic;

public class A {
	A() {
		System.out.println("Parent Constructor");
	}

	int a = 10;
	String s = "JBk";

	void m1() {
		System.out.println("111");
	}

	void m2() {
		System.out.println("222");
	}
}

class B extends A {
	B() {
		System.out.println("Child Constructor");
	}

	String s = "TKA";
	int b = 20;

	void m2() {
		System.out.println("333");
	}

	void m3() {
		System.out.println("444");
	}

}
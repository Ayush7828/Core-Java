package com;

//Private access modifiers uses

//class TestEd {
//	public static void main(String[] args) {
//		Student obj = new Student();
//		obj.sid;
//		obj.scname;// showing error this feild is not visible
//	}

//}

public class Student {
	private int sid = 78;
	private String name = "Tushar";
	private static String scname = "SVVV";

	private void m1() {
		System.out.println(sid);
		System.out.println(name);
		System.out.println(scname);
	}

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.name);
		System.out.println(obj.sid);

		obj.m1();

	}
}

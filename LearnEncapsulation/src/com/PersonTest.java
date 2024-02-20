package com;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
//		Setter
		p1.setAge(24);
		p1.setName("Joy");
		p1.setPid(101);

//		Getter

		System.out.println(p1.getAge());

		System.out.println(p1.getName());
		System.out.println(p1.getPid());

	}

}

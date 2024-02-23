package com;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		// this line create file in same directory
		File f = new File("D:\\Eclipse\\FileHandling");

//		boolean fstatus = f.createNewFile();
//		System.out.println(fstatus);

		// read the content
		String[] arr = f.list();
		for (String name : arr) {
			System.out.println(name);
		}
		// this line file create another director
		// File f = new File(File Parent, String name);

	}

}

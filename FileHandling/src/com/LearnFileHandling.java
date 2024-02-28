package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LearnFileHandling {
	public static void main(String[] args) throws IOException {

		// Java Program to write the data to a file using FileWriter class
		// File f = new File("a.txt");

		/*
		 * FileWriter fw = new FileWriter("ay.txt"); // fw.write('a');
		 * fw.write("Hi, Good Morning Tushar \n"); fw.write("How are you");
		 * 
		 * fw.flush(); // send data forcefully to program fw.close(); // best pratice to
		 * close file
		 */

		// Java Program to write the data to a file using FileReader class

		FileReader fr = new FileReader("ay.txt");
		int i = fr.read();
		System.out.println(i); // print ascii value of character

		while (i != -1) {
			System.out.print((char) i);
			i = fr.read(); // read next character and re-initialize i var }
		}
		fr.close();

		// Java Program to read file data using BufferedReader

		FileReader fr1 = new FileReader("ay.txt");

		BufferedReader bf = new BufferedReader(fr1);
		String line = bf.readLine();
		while (line != null) {
			System.out.println(line);
			line = bf.readLine();
		}
		bf.close();
		fr.close();

		/*
		 * PrintWriter ==========
		 * 
		 * System.out.println ("hi");
		 * 
		 * System ----> It is a class available in java.lang package
		 * 
		 * out ---> it is a static variable available in System class. The data type of
		 * 'out' variable is PrintWriter class
		 * 
		 * println ( ) ---> it is a method available in PrintWriter class
		 */

		// Writing data to console using PrintWriter object

		PrintWriter pw = new PrintWriter("ay.txt");
		pw.write("Indore , Java is partial OOPS language");
		pw.flush();
		pw.close();
	}

}

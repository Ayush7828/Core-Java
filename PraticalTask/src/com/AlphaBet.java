package com;

public class AlphaBet {
	public static void main(String[] args) {
		char ch = 'A';
		for (char i = 1; i <= 5; i++) {
			for (char j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (char k = 5; k >= i; k--) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}
}

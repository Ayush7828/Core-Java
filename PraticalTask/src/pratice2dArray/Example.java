package pratice2dArray;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		System.out.println("Enter a size of row and column");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), c = sc.nextInt();
		int[][] myarr = new int[r][c];
		System.out.println("Enter  a  array element");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				myarr[i][j] = sc.nextInt();
			}
		}
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//
//				System.out.println(myarr[i][j]);
//			}
//		}

		for (int[] row : myarr) {
			for (int elment : row) {
				System.out.println(elment + " ");
			}
		}

	}
}

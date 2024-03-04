package combasic;

import java.util.Scanner;

public class Array2dInputOutput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array row and column size ");
		int rows = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Enter array elements ");
		int[][] myarr = new int[rows][column];
		System.out.println("Search elemeent ");
		int x = sc.nextInt();

//		Input array 
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				myarr[i][j] = sc.nextInt();
			}
		}

//		Output array 
		for (int[] row : myarr) {
			for (int ele : row) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}

	}

}

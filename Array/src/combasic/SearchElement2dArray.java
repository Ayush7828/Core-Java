package combasic;

import java.util.Scanner;

public class SearchElement2dArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array row and column size ");
		int rows = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Enter array elements ");
		int[][] myarr = new int[rows][column];

//		Input array 
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				myarr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Search elemeent ");
		int x = sc.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; i < column; j++) {
				if (myarr[i][j] == x) {
					System.out.println("Location found element " + x + " index of " + i + " " + j);
				}
			}

		}
//		
	}

}

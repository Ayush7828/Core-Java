package arrayPratice;

public class Array2d {

	public static void main(String[] args) {

		int[][] myarr = { { 1, 2, 4, 7 }, { 7, 8, 88, 96 }, { 11, 12, 14, 78 }

		};

		for (int[] row : myarr) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

}

package pratice2dArray;

public class DiagonalSum {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 12, 13 }, };
		int[][] b = { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 22, 30 }, };

		int sum_digaonal = 0;
		int sum_non_diagonal = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (i == j) {
					sum_digaonal += a[i][j];
				} else {
					sum_non_diagonal += a[i][j];
				}
			}
			System.out.println("Diagonal Sum " + sum_digaonal);
			System.out.println("NonDiaginal Sum" + sum_non_diagonal);
		}

	}
}

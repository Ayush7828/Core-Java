package pratice2dArray;

public class Add2dArray {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 12, 13 }, };
		int[][] b = { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 22, 30 }, };

		int[][] c = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n");
		System.out.println("Answer");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}

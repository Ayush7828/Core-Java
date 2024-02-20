package combasic;

public class Array2D {

	public static void main(String[] args) {

//		int myarr[][] = new int[3][4];
//		myarr[0][0] = 12;
//		myarr[0][1] = 72;
//		myarr[0][2] = 60;
//
//		myarr[1][0] = 42;
//		myarr[1][1] = 23;
//		myarr[1][2] = 96;
//
//		myarr[2][0] = 100;
//		myarr[2][1] = 104;
//		myarr[2][2] = 964;
//
//		System.out.println(myarr[0][0]);
//		System.out.println(myarr[0][1]);
//		System.out.println(myarr[0][2]);
//
//		System.out.println(myarr[1][0]);
//		System.out.println(myarr[1][1]);
//		System.out.println(myarr[1][2]);
//
//		System.out.println(myarr[2][0]);
//
//		System.out.println(myarr[2][1]);
//
//		System.out.println(myarr[2][2]);

		int mark[][] = {

				{ 12, 45, 78 }, { 78, 96, 52 }, { 45, 63, 20 }, };

//		for (int i = 0; i < mark.length; i++) {
//			for (int j = 0; j < mark[i].length; j++) {
//				System.out.print(mark[i][j] + " ");
//			}
//			System.out.println();
//		}

//		For each loop

		for (int[] row : mark) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

}

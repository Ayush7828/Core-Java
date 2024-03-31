package arrayPratice;

public class MergeTwoArray {

	public static void main(String[] args) {

		int[] a = { 1, 4, 7, 8 };
		int[] b = { 12, 45, 78, 9 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}

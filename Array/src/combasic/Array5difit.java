package combasic;

public class Array5difit {
	public static boolean endsWith(int num) {
		return num % 10 == 5;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 35, 30, 25, 15, 15 };

		for (int num : arr) {
			if (endsWith(num)) {
				System.out.print(num + " ");
			}
		}
	}
}

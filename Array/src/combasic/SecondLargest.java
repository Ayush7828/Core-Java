package combasic;

public class SecondLargest {
	public static void getElements(int[] arr, int n) {
		int small = Integer.MAX_VALUE;
		int seccondsmall = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			small = Math.min(small, arr[i]);

		}
		for (int i = 0; i < n; i++) {
			if (arr[i] < seccondsmall && arr[i] != small) {
				seccondsmall = arr[i];
			}
		}
		System.out.println("Second smallest is " + seccondsmall);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 7, 5 };
		int n = arr.length;
		getElements(arr, n);
	}

}

package combasic;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] myarr = { 1, 45, 85, 42, 700, 52 };
		int max = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int arr : myarr) {
			if (arr > max) {
				secondlargest = max;
				max = arr;

			}
			if (arr > secondlargest && arr != max) {
				secondlargest = arr;

			}
		}
		System.out.println("First Largest = " + max);
		System.out.println("second largest " + secondlargest);

	}

}

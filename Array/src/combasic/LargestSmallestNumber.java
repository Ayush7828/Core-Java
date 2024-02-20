package combasic;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarr = { 10, 40, 82, 45, 12, 96, 722, 855, 2 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int arr : myarr) {
			if (arr > max) {
				max = arr;
			}
			if (arr < min) {
				min = arr;
			}
		}
		System.out.println("Max Value " + max);
		System.out.println("Min Value " + min);

	}

}

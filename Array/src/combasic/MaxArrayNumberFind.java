package combasic;

public class MaxArrayNumberFind {

	public static void main(String[] args) {
		int[] myarr = { 1, 45, 85, 42, 700, 52 };
		int max = Integer.MIN_VALUE;
		for (int i : myarr) {

			if (i > max) {
				max = i;
			}
		}
		System.out.println("Max Value " + max);

	}

}

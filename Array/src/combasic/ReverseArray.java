package combasic;

public class ReverseArray {
	public int reverseDigit(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		ReverseArray r = new ReverseArray();
		int[] arr = { 165, 186, 357, 325 };
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.reverseDigit(arr[i]);

			System.out.println(arr[i]);
		}
	}
}

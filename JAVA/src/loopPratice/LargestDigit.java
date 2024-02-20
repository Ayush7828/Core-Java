package loopPratice;

class FindLargestDigit {
	int large = 0;
	int rem;

	int digitgreater(int num) {
		while (num > 0) {
			rem = num % 10;
			if (rem > large) {
				large = rem;

			}
			num /= 10;

		}
		System.out.println(large);
		return large;
	}
}

public class LargestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 457;
		FindLargestDigit obj = new FindLargestDigit();
		obj.digitgreater(n);
	}

}

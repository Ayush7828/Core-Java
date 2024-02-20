package combasic;

public class EvenOddArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int evensum = 0, oddsum = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				evensum += number;
				System.out.println("Even Sum " + evensum);
			} else {
				oddsum += number;
				System.out.println("Odd Sum " + oddsum);
			}

		}

	}

}

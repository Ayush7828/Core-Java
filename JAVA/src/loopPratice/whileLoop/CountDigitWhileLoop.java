package loopPratice.whileLoop;

class DigitCount {
	int n = 1234, count = 0;

	void PorgramCount() {
		while (n > 0) {
			int rem = n % 10;
			count++;
			n /= 10;
		}
		System.out.println(count);
	}

}

public class CountDigitWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitCount obj = new DigitCount();
		obj.PorgramCount();

	}

}

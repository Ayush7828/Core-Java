package loopPratice;

class RangeNumberSum {
	int ans = 0;

	public int sumrangeNumber(int a, int b) {
		for (int i = a; i <= b; i++) {
			ans += i;
		}
		return ans;
	}

}

public class SumGivenRangeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RangeNumberSum obj = new RangeNumberSum();
		System.out.println(obj.sumrangeNumber(12, 54));
	}

}

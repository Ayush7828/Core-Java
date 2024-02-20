package combasic;

class NumberSumArray {
	int sum = 0;

	void program() {
		int numbers[] = { 26, 12, 6, 7, 15, 3, 2 };

		for (int number : numbers) {
			sum += number;
			System.out.print(sum + " ");

		}

	}
}

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberSumArray obj = new NumberSumArray();
		obj.program();

	}

}

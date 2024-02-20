package loopPratice.whileLoop;

//Sum of N Natural Number
class NaturalNumberSum {
	int num = 10, i = 1, sum = 0;

	void programnaturalnumbersum() {
		while (i <= num) {
			sum += i;
			System.out.println(sum);
			i++;

		}
	}
}

public class SNaturalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NaturalNumberSum obj = new NaturalNumberSum();
		obj.programnaturalnumbersum();
	}

}

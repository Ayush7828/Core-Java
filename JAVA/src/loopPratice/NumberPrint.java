package loopPratice;

public class NumberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		for (int i = 1; i <= 8; i++) {
			System.out.print(num);
			if (i < 5) {
				num++;
			} else {
				num--;
			}
		}

	}

}

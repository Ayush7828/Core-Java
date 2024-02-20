package loopPratice;

class PrintReverse {
	int num = 1;

	void programrev() {
		for (int i = 10; i >= num; --i) {
			System.out.println(i);
		}
	}
}

public class ReversePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintReverse obj = new PrintReverse();
		obj.programrev();
	}

}

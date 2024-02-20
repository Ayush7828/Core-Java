package loopPratice;

class Print {
	int table;

	void program() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 2; j <= 10; j++) {
				table = i * j;
				System.out.print(table);
			}
			System.out.println();
		}
	}
}

public class PrintTable2to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print obj = new Print();
		obj.program();

	}

}

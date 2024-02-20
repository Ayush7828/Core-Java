package loopPratice;

class Program {
	int table = 5;

	void tableprogram() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(table + "*" + i + "=" + table * i);
		}
	}
}

public class TablePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program obj = new Program();
		obj.tableprogram();

	}

}

package praticeConstrutor;

public class Bank {
	int bid;
	String bname;

	Bank() {
		System.out.println("RBI Bank");
	}

	Bank(int bid, String bname) {
		this();
		System.out.println("Bank Id = " + bid + " bank Name = " + bname);
	}

	Bank(String bname, int bid, int accno) {
		this(1, "Kotak");
		System.out.println("Bank Name " + bname);
		System.out.println("Bank Id = " + bid);
		System.out.println("Bank Account " + accno);
	}

}

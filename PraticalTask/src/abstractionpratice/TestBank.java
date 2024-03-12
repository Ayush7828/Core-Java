package abstractionpratice;

public class TestBank {
	public static void main(String[] args) {
		Bank b1 = new SBI();
		b1.bankname();
		b1.bankInformation();

		Vehicle v1 = new H();
		v1.tyers();
		v1.start();

	}

}

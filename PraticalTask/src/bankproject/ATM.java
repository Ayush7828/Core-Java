package bankproject;

public class ATM {
	private static int bal = 25000;

	public int getBal(int pin) {
		if (pin == 7869) {
			return bal;

		}
		return bal;

	}

	public void setBal(int bal) {

		this.bal = bal;

	}

	public void deposit(int amount) {
		if (amount > 0) {
			bal += amount;
			System.out.println("Deposit Amount " + amount);
			System.out.println("Total Amount = " + bal);
		} else {
			System.out.println("");
		}
	}

	public void withdraw(int amount) {
		if (amount > 0 && amount <= bal) {
			bal -= amount;
			System.out.println("Withdrawal Balance = " + amount);
			System.out.println("Avilable Balance = " + bal);
		} else {
			System.out.println("Insufficent Balance ");
		}
	}

}

package com;

public class Bank {
	private int accountnumber;
	private double bal;
	private String name;

	Bank(double amt) {
		bal = amt;
	}

//	Getter method
//	public void displaybal() {
//		System.out.println(bal);
//	}

	public void getbalance(int pin) {
		if (pin == 4567) {
			System.out.println("Show Balance " + bal);
		} else {
			System.out.println("Wrong Pint " + pin);
		}
	}

//	Setter Method

	/*
	 * public void desposite(double amt) { bal += amt; }
	 */

	public void setbalce(int amt) {
		if (amt > 0) {
			bal += amt;

			System.out.println(bal);
		} else {
			System.out.println("Wrong");
		}
	}
}
//Get method Display
//set method set value

/* If else use for authntication and write getter and setter both */
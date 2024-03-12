package abstractionpratice;

abstract class Bank {
	int bid = 45;
	int bankEmplsalaray = 2500000;

	abstract void bankname();

	abstract void bankInformation();

}

abstract class Vehicle {
	abstract void tyers();

	abstract void start();
}

abstract class Car extends Vehicle {
	void tyers() {
		System.out.println("Car Tyers 4 ");
	}

	void start() {
		System.out.println("Engine Started");
	}

}

class H extends Car {

}

class SBI extends Bank {

	@Override
	void bankname() {
		System.out.println("SBI Bank");
	}

	@Override
	void bankInformation() {
		System.out.println("SBI Bnak ID = " + bid);
		System.out.println("Bank Employee salary " + bankEmplsalaray);
	}
}

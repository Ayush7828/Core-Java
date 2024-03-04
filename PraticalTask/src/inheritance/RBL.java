package inheritance;

class RBL {
	void showrabi() {
		System.out.println("I am RBI Bank");
	}
}

class Kotak extends RBL {
	void showkotak() {
		System.out.println("I am Kotak Bank");
	}
}

class Hdfc extends RBL {
	void showhdfc() {
		System.out.println("I am HDFC Bank");
	}
}
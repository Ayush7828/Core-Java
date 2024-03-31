package praticeinheritance;

public class LibraryItem {

	String title = "Rich Dad ";
	int itemID = 45;

	void displayinfo() {
		System.out.println("Libray title " + title);
		System.out.println("Libray itme id = " + itemID);
	}

}

class Book extends LibraryItem {

//	Book(String title, int itemId) {
//		this.itemID = itemId;
//		this.title = title;
//	}

	void displayinfo() {
		super.displayinfo(); // parent class method call
		System.out.println("Book Author Title = " + super.title);
		System.out.println("Book Author Id =  " + super.itemID);
	}
}

class DVD extends LibraryItem {
	void duration() {
		System.out.println("DVD = " + super.title);
		System.out.println("DVD ID " + super.itemID);
	}
}
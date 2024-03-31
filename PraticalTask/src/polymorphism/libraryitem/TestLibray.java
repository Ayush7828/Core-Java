package polymorphism.libraryitem;

public class TestLibray {

	public static void main(String[] args) {

		LibraryItem li = new LibraryItem("Rich-Dad", "Robert Kiyosaki", "Japan");

		li.displayinfo();

		Book b1 = new Book("Rich-dad", "Robert Kiyosaki", "USA", 210, 2);
		b1.displayinfo();

		DVD d = new DVD("Rich Dad", "Robert Kiyosaki", "India", "Robert Kiyosaki", 1973);
		d.displayinfo();

		Ebook eb = new Ebook("Rich-Dad", "Robert Kiyosaki", "Jap", "PDF", 254);
		eb.displayinfo();
	}

}

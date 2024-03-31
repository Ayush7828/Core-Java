package polymorphism.libraryitem;

public class LibraryItem {

	String title;
	String author;
	String location;

	public LibraryItem(String title, String author, String location) {
		this.title = title;
		this.author = author;
		this.location = location;

	}

	void displayinfo() {
		System.out.println("Libray Items ");
		System.out.println(
				"Title Libray : " + title + " \n " + "Author Libray " + author + "\n" + "Location Libray " + location);
		System.out.println("-------------------------------------");
	}

}

class Book extends LibraryItem {

	int numberOfPages;
	int generc;

	public Book(String title, String author, String location, int numberOfPages, int generc) {
		super(title, author, location);
		this.numberOfPages = numberOfPages;
		this.generc = generc;

	}

	@Override
	void displayinfo() {
		System.out.println("Book Pages : " + numberOfPages);
		System.out.println("Generc " + generc);
		System.out.println("-------------------------------------");
	}
}

class Ebook extends LibraryItem {

	String format;
	int filesize;

	public Ebook(String title, String author, String location, String format, int filesize) {
		super(title, author, location);
		this.format = format;
		this.filesize = filesize;

	}

	void displayinfo() {
		System.out.println("Ebook File SIZE : " + filesize + "\n " + "Ebook Fomat " + format);
		System.out.println("-------------------------------------");
	}

}

class DVD extends LibraryItem {

	String director;
	int runTime;

	public DVD(String title, String author, String location, String director, int runTime) {
		super(title, author, location);
		this.director = director;
		this.runTime = runTime;

	}

	void displayinfo() {

		System.out.println("DVD Director " + director + "\n" + " Run Time " + runTime);
		System.out.println("-------------------------------------");
	}

}
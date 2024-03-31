package praitceencapsulation;

public class Main {

	public static void main(String[] args) {
		LibrayItem l1 = new LibrayItem("Dargon", 12);
		System.out.println("Id = " + "" + l1.getItemId() + "\n" + "Name= " + l1.getTitle());
		Book b1 = new Book("Hello Book", 1);
		System.out.println("Book Item = " + b1.getItemId());
		System.out.println("Bokk Ttile = " + b1.getTitle());

	}
}

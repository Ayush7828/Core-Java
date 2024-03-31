package praitceencapsulation;

public class LibrayItem {
	protected String title;
	private int itemId;

	public LibrayItem(String title, int itemId) {
		this.title = title;
		this.itemId = itemId;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

}

class Book extends LibrayItem {

	public Book(String title, int itemId) {
		super(title, itemId);

	}

}

class DVD extends LibrayItem {

	public DVD(String title, int itemId) {
		super(title, itemId);

	}

}
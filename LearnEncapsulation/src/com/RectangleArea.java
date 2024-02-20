package com;

public class RectangleArea {
	private int length;
	private int breadth;

	public void setlength(int l) {

		if (l > 0) {
			length = l;
		} else {
			length = 0;
		}

	}

	public int getlength() {
		return length;
	}

	public void setbreadth(int b) {
		if (b > 0)
			breadth = b;

		else
			breadth = 0;

	}

	public int getbreadth() {
		return breadth;
	}

}

package com.mocktask;

import java.util.ArrayList;

public class Example {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(42);

		list.add(13);

		list.add(18);

		reverseArraylist(list);
		System.out.println(list);
	}

	private static void reverseArraylist(ArrayList<Integer> list) {
		int left = 0;
		int right = list.size() - 1;

		while (left < right) {
			Integer temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			left++;
			right--;
		}

	}

}

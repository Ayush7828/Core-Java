package learnList;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(8);
		list.add(10);
		list.add(20);
		list.add(2, 64);
		System.out.println(list.get(4)); // give index
		System.out.println(list);

//		set method

		System.out.println(list.set(1, 544));
		System.out.println(list);

//		remove()

		System.out.println(list.remove(4));
		System.out.println(list);

		System.out.println(list.indexOf(20));

//		sublist()

		System.out.println(list.subList(2, 5));

//		ArrayList
//		ArrayList<Integer> arraylist = new ArrayList<Integer>();
//		arraylist.add(4);
//		arraylist.add(2);
//
//		arraylist.add(12);
//		arraylist.add(26);
//
//		arraylist.add(78);
//		arraylist.add(52);
//
//		arraylist.add(23);
//
//		for (int i = 0; i < arraylist.size(); i++) {
//			System.out.print(arraylist.get(i) + " ");
//		}

	}

}

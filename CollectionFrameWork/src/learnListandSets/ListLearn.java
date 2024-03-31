package learnListandSets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListLearn {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(45);
		list.add(89);
		list.add(null);
		list.add(null);

		list.add(null);
		System.out.println(list);

//		Iterate -- inteface
// java.util --package present
//		method 
//		hasNext()-- return boolean
//		next()--return the next element
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " " + "\n");
		}

//		for (; itr.hasNext();) {
//			System.out.print(itr.next() + " ");
//		}

//		ListIterator
//		Method
		/*
		 * boolean hasNext(); E next(); -- generice method boolean hasPrevious(); return
		 * pervious list and move to nect cursor ListIterator< Integer>
		 * itr2=list.listIterator(); void set(E e); void add(E e);
		 */

		ListIterator<Integer> ltr2 = list.listIterator();

		System.out.print(ltr2.next() + " ");

	}

}

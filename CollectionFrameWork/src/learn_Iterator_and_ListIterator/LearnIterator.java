package learn_Iterator_and_ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnIterator {

	public static void main(String[] args) {
//		Iterator
		List li = new ArrayList();
		li.add("Ayush");
		li.add(10);
		li.add(14);
		System.out.println(li); // print whole object
		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}

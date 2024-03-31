package treesetlearn;

import java.util.Iterator;
import java.util.TreeSet;

public class LearnTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet();
		ts.add(60);
		ts.add(40);
		ts.add(10);
		ts.add(3);
		ts.add(70);
		System.out.println(ts);

		System.out.println(ts.contains(40));

		TreeSet ts1 = new TreeSet<>();
		ts1.add(14);
		ts.addAll(ts1);

		System.out.println(ts);

		// System.out.println(ts.comparator());

		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

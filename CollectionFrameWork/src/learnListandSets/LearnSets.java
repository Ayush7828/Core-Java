package learnListandSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnSets {

	public static void main(String[] args) {
		Set set = new HashSet();

		set.add(12);

		set.add(45);

		set.add(85);
		set.add(82);
		set.add(19);
		set.add(null);

		set.add(null);
		System.out.println(set);

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

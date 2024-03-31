package basic;

import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(45);
		ar.add(78);
		ar.add(7888);
		ar.add(20);

		System.out.println(ar.contains(78));

		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i) + " ");
		}

		// addAll()-- collection add
		ArrayList ar2 = new ArrayList();
		ar2.add(12);
		ar2.add(20);
		ar2.add("Ayush");
		ar2.add("Tushar");
   
		ar.addAll(ar2);
		System.out.println(ar);
		ar.clear();
		System.out.println(ar);
		System.out.println(ar.isEmpty());

	}

}

package com.hassetlearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(24);
		a.add(78);
		a.add(96);
		System.out.println("ArrayList = " + a);
//		Dupliacate Not Allowed
//		Not follow Sorting Oder
//		Insertion Order Not Maintain
		HashSet<Integer> hs = new HashSet<Integer>(a);
		hs.add(10);
		hs.add(60);
		hs.add(4);
		hs.add(80);
		hs.add(70);
		hs.add(68);
		hs.add(96);
		hs.add(100);
		System.out.println(hs.contains(70));
		System.out.println("HashSet" + hs);
//		hs.clear();
//		System.out.println(hs);
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.addAll(hs);
//		System.out.println(a);

	}

}

package com.basicmap;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
	public static void main(String[] args) {
		Map map = new HashMap();

//		put element to use add element

		map.put(101, "Ayush");
		map.put(102, "Tushar");
		map.put(103, "Shubham");
		map.put(104, "Rakesh");
		System.out.println(map);
		System.out.println(map.size());

//		Contains key
		map.containsKey(103);
		System.out.println(map);

//		Contains Value
		map.containsValue("Ayush");
		System.out.println(map);

//	get
		map.get(103);
		System.out.println(map);

//		Clear method to clear all element

		map.clear();
		System.out.println(map);
	}

}

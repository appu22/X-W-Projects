package com.xworkz.app.map.usingsetandmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FruitsTester {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "mango");
		map.put(5, "orange");
		map.put(2, "apple");
		map.put(3, "grapes");
		map.put(4, "Banana");
		System.out.println("Fruits Name : " + map);

		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("Fruits Name And Key " + itr.next());
		}

	}

}

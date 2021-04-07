package com.xworkz.app.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {

	public static void main(String[] args) {

		Map<Integer, String> names = new HashMap<Integer, String>();
		names.put(1, "appu");
		names.put(4, "santu");
		names.put(3, "darshan");
		names.put(5, "surya");
		names.put(2, "kiran");
		System.out.println("using refernce  " + names);
		Set entry = names.entrySet();
		Iterator itr = entry.iterator();
		System.out.println("--------using set-------------");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("*** returning the boolean containskey() and containsValue ***");

		System.out.println("it is checking the key value : " + names.containsKey(entry));
		System.out.println("it is checking the value : " + names.containsValue(entry));

	}

}

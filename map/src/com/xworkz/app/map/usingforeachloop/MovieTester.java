package com.xworkz.app.map.usingforeachloop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MovieTester {

	public static void main(String[] args) {

		// implements for each loop arraay

		Map<Integer, String> country = new HashMap<Integer, String>();

		country.put(91, "India");
		country.put(61, "USA");
		country.put(11, "Japan");

		System.out.println("Its is checking key empty or not" + country.containsKey(country));
		System.out.println("It is check the values : " + country.containsValue(country));

		Set<Entry<Integer, String>> entryset = country.entrySet();
		System.out.println(entryset);

//		Iterator itr = entryset.iterator();
//		System.out.println("***************");
//		while(itr.hasNext()) {
//			
//			Map.Entry entry = (Map.Entry) itr.next();
//			System.out.println(entry);
//		}
		for (Entry<Integer, String> entry : entryset) {
			System.out.println("Key value :  "+entry.getKey());
			System.out.println("Value     : "+entry.getValue());
		}
	}

}

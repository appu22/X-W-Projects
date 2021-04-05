package com.xwork.xworkzapp.lengthOfString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Bengalore {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		String s = "Bangalore is also called as it hub Bangalore recently awarded best city"
				+ " to live Bangalore is also called as green city Bangalore is" + " capital city of karnataka";

		list.add(s);

		System.out.println("Printing Arralist -->: "+list);
		String[] split = s.split(" ");

		System.out.println("Words of String -->: "+split.length);

		Set<String> set = new LinkedHashSet<String>();
		for (String as : split) {
			set.add(as);
		}
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {

			System.out.print(" " + iterator.next());
		}
	}

}

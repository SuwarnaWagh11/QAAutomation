package com.automation.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapBasedOnValues {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(7, "Suwarna");
		map.put(12, "Sadhna");
		map.put(8, "Swapna");
		map.put(1, "Sulbha");
		map.put(15, "Navnath");
		
		 map.entrySet().stream().forEach(e -> System.out.println("Key : " + e.getKey() + " value : " + e.getValue()));
		 
		map.forEach((k, v) -> System.out.println(k + "\t" + v));
		
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Integer, String> entry = iterator.next();
            System.out.println("K : " + entry.getKey() + " V : " + entry.getValue());
        }
        

		//Set<Entry<Integer, String>> entry = map.entrySet();
		List<Entry<Integer, String>> list1 = new ArrayList<>(map.entrySet());

		Collections.sort(list1, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> val1, Entry<Integer, String> val2) {
				//return val1.getValue().compareTo(val2.getValue());
				return val1.getKey() - val2.getKey();
			}

		});

		System.out.println("\n\nAfter sorting map with String");
		HashMap<Integer,String> temp = new LinkedHashMap<Integer,String>();
		for (Map.Entry<Integer, String> aa : list1) {
			temp.put(aa.getKey(), aa.getValue());
		}
		temp.forEach((k, v) -> System.out.println(k + "\t" + v));
		
		
	}
}

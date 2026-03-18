package com.simplilearn.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Java");
		map.put(2, "Python");

		System.out.println(map.get(1));
		System.out.println(map);

		Map<Integer, String> map1 = new LinkedHashMap<>();

		map1.put(3, "C");
		map1.put(1, "A");
		map1.put(2, "B");

		System.out.println(map1);
		
		
		Map<Integer, String> map2 = new TreeMap<>();

		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");

		System.out.println(map2);
		
		
		// iterating map
		
		for(Integer key: map.keySet()) {
			System.out.println(key + " "+ map.get(key));
		}
		
		
		// Entryset method (best method)
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
			
		}
		
		// Iterator
		
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String>  itr = it.next();
			itr.getKey();
			itr.getValue();
		}
	}

}

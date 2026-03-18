package com.simplilearn.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(null);
		
		System.out.println(set);
		
		for(Integer num : set) {
			System.out.println(num);
		}
		
		
		// using iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Integer> set1 = new LinkedHashSet<>();

		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(10);
		set1.add(null);
		
		System.out.println(set1);
		
		
		
		Set<Integer> set2 = new TreeSet<>();

		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(10);

		
		System.out.println(set2);
		
		
		
	}

}

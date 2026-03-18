package com.simplilearn.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		list.addFirst("Start");
		list.addLast("End");
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println(queue.poll());
		
		
		// LinkedList as Queue
		Deque<Integer> stack = new LinkedList<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop());
		

	}

}

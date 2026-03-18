package com.simplilearn.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(30);
		queue.add(10);
		queue.add(20);
		queue.add(40);
		
		while(!queue.isEmpty()) {
			
			System.out.println(queue.poll());
		}
		
		
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.addLast(20);
		dq.addLast(30);
		dq.addLast(10);
		
		System.out.println(dq.removeFirst());
		
	

	}

}

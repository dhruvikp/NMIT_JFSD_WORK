package com.simplilearn.multithreading;

public class SleepExample {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		
		try {
			Thread.sleep(20000);  // 2 seconds
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End after 2 seconds");

	}

}

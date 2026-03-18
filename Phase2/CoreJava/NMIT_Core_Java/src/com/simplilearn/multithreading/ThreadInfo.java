package com.simplilearn.multithreading;

public class ThreadInfo {

	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		
		Thread t1 = new Thread(myRunnable);
		t1.start();
		
		//Lambda expression
		
		Thread t2 = new Thread(() -> {
			System.out.println("Thread is running");
		});
		t2.start();
		
		
		
		
	}

}



class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running..");
	}
}
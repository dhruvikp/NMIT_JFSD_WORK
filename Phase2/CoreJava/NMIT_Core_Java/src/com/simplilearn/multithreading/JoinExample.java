package com.simplilearn.multithreading;

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("MAIN THREAD STARTS");
		Thread t1 = new Thread(new MyThread());
		t1.start();
		
		t1.join();
		
		System.out.println("MAIN thread continious..");

	}

}


class MyThread implements Runnable {

	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
			System.out.println("Child thread finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
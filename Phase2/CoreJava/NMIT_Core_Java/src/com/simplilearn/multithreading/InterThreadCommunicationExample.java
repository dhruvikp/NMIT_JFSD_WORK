package com.simplilearn.multithreading;

public class InterThreadCommunicationExample {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		Thread withdrawThread = new Thread(() -> {
			account.withdraw(1000);
		});
		
		Thread depositThread = new Thread(() -> {
			try {
				Thread.sleep(2000);  // Simulate delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.deposit(2000);
		});
		
		withdrawThread.start();
		depositThread.start();
	}
}


class BankAccount {
	private int balance = 0;
	
	public synchronized void deposit(int amount) {
		System.out.println("Depositing: "+ amount);
		balance += amount;
		System.out.println("Balance after deposit: "+ balance);
		
		notify();
	}
	
	public synchronized void withdraw(int amount) {
		System.out.println("Attempting to withdraw :" + amount);
		
		while(balance < amount ) {
			System.out.println("Insufficient balance, waiting..");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance -= amount;
		System.out.println("Withdrawal is successful, Remaining balance: "+ balance);
		
	}
}

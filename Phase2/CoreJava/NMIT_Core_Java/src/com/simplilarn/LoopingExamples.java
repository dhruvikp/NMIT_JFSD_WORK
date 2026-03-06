package com.simplilarn;

public class LoopingExamples {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.println(j);
			}
		}
		
		
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		i=1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 5);

		
		// Enhanced For loop
		int[] numbers = {10,20,30,40,50};
		
		for(int num: numbers) {
			System.out.println(num);
		}
		
		System.out.println("----------------------------");
		
	
		for(int k=1; k<=10; k++) {
			if(k==5) {
				continue;
			}
			
			System.out.println(k);
		}
		
		
		
	}

}

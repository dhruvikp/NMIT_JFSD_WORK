package com.simplilarn.other;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args) throws InvalidAgeException {
		
		try {
			int a = 10;
			int b = 0;
			
			int result = a/b;
			
			System.out.println(result);
		
			
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		
		System.out.println("Continue...");
		
		
		try {
			int[] arr = new int[5];
			arr[10] = 49;
			
			
		}catch(ArithmeticException e) {
			System.out.println("Array index error");
		} catch(Exception e) {
			System.out.println("General Exception");
		} finally {
			System.out.println("Always runs");
		}
		
		
		// throw keyword
		int age  = 15;
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18+");
		} 
		
		System.out.println("Elibible");
		
		
		try {
			readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	static void readFile() throws FileNotFoundException {
		FileReader fr = new FileReader("data.txt");
	}

}

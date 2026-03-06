package com.simplilarn.other;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		
		System.out.println(s1 == s2); // checks for memory locations
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		System.out.println("Java".length());
	
		System.out.println("Java".charAt(2));
		
		System.out.println("Java Programming".contains("Java"));
		String s = "JavaProgramming";
		System.out.println(s.substring(4));
		
		
		StringBuilder sb = new StringBuilder("Java");
		sb.append(" Programming");
		System.out.println(sb);
		
	}

}

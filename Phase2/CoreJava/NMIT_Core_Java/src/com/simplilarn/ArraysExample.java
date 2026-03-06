package com.simplilarn;

public class ArraysExample {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		System.out.println(arr.length);
		
		
		// int[][] matrix = new int[3][3];
		
		
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(matrix[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}

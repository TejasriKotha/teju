package com.tech;

public class SortNumbers {

	public static void main(String[] args) {
		
		
		int[] input = new int[] {-5, 6, -7, 3, -1, 3, 9};
		
		int temp=0;
		
		for(int i=0; i< input.length; i++) {
			for(int j=i+1; j< input.length; j++) {
				if(input[i] > input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j] = temp;
				}
				
				
			}
		}
		
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+",");
		}

	}

}


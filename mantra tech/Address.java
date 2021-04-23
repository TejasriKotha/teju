package com.tech;

import java.util.Arrays;

public class Address {

	public static void main(String args[]) {
		String address1 = "189, CORNER STREET , HIGHWAY ROAD , HYDERABAD";
		String address2 = "189, HIGHWAY ROAD , CORNER STREET , HYDERABAD";
		
		String[] address1Split = address1.split(",");
		String[] address2Split = address2.split(",");
		
		boolean lenghtCheck =false;
		boolean containsInArray = true;

		if(address1Split.length == address2Split.length)
			lenghtCheck = true;
		
	
		for(int i=0; i< address1Split.length; i++) {
			if(containsInArray)
				break;
			
			if(! Arrays.asList(address2Split).contains(address1Split[i]))
				containsInArray = true;
		}
		
		if(lenghtCheck && containsInArray)
			System.out.println("Address 1 and Address 2 are equal");
		else
			System.out.println("Address 1 and Address 2 are not equal");
	}
}

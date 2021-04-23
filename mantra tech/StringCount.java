package com.tech;

import java.util.ArrayList;
import java.util.List;

public class StringCount {
	
	public static void main(String args[]) {
		String input = "abc bca cba abc abc cba";
		
		String[] splitInput = input.split(" ");
		int count;
		List<String> checkCompleted = new ArrayList<String>();
		boolean checkRequired = false;
		for(int i=0; i< splitInput.length; i++) {
			count = 1;
			
			if(i == 0)
				checkRequired = true;
			
			else if(!checkCompleted.contains((splitInput[i])))
				checkRequired = true;
				
			if(checkRequired) {
				
				for(int j=0; j< splitInput.length; j++) {
					if(i != j) {
						if(splitInput[i].trim().equals(splitInput[j].trim()))
							count++;
					}
				}
			    
				System.out.println(splitInput[i]+" occurances "+count);
				
				if(i == 0)
					checkCompleted.add(splitInput[i]);
				
				else if(! checkCompleted.contains(splitInput[i]))
					checkCompleted.add(splitInput[i]);
				
				checkRequired = false;
			}
		}
	}

}

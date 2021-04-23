package com.tech;

public class StarDiagram {

	public static void main(String[] args) {
		int rows = 6;
		 for (int i = 0; i <= rows/2; i++)
	        {
	          for (int j = 0; j < rows; j++)
	            {
	        	  if(j < i || j >= rows-i)
	                System.out.print(" ");
	        	  else
	        		 System.out.print("*");
	            }  
	            
	          System.out.println();
	         
	        }
		 
	}

}

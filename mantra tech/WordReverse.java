package com.tech;

public class WordReverse {

	public static void main(String[] args) {
		
		String word = "I am a boy";
        String finalWord = "";
        boolean firstSubWord = true;
        String[] split = word.split(" ");
        for(int i=split.length-1; i>= 0; i--){
       
            if(firstSubWord){
                String firstWord = split[i];
                String temp = null;
                
                for(int j=0; j< firstWord.length(); j++){
                    if(j == 0)
                        temp = String.valueOf(firstWord.charAt(j)).toUpperCase();
                    else
                        temp += String.valueOf(firstWord.charAt(j)).toLowerCase();
                }
                //Setting firstword check to false
                firstSubWord = false;
                firstWord = temp;
                finalWord +=firstWord + " ";
            }
            else{
            	finalWord += split[i].toLowerCase() + " ";
            }
                
        }
        System.out.println(finalWord);
	}

}

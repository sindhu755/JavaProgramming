package Assignmants;

public class P45_CountOccuranceOfEachCharacter {

	public static void main(String[] args) {
		
		// In a given string, print the occurrence of each character? 
		
		    String str = "welcome to java";

	        // Convert to lowercase and remove spaces (optional)
		 
	        str = str.toLowerCase().replace(" ", "");

	        // Create an array to store frequency of each character
	        
	        int[] count = new int[256]; // for all ASCII characters

	        // Count each character
	        for (int i = 0; i < str.length(); i++) 
	        {
	            count[str.charAt(i)]++;
	        }

	        // Print each character and its occurrence
	        System.out.println("Character occurrences:");
	        
	        for (int i = 0; i < 256; i++) 
	        {
	            if (count[i] > 0)
	            {
	                System.out.println((char) i + " : " + count[i]);
	            }
	        }
	        
	        
		

	}

}

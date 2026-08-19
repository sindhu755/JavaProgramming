package Assignmants;

import java.io.IOException;

public class P33_count_char_in_string {
	public static void main(String[] args) throws IOException 
	{
		

		 	String str = "hello world";
		 
	        int[] count = new int[256]; // for ASCII characters

	        
	        // Count each character
	        for (int i = 0; i < str.length(); i++) 
	        {
	            char ch = str.charAt(i);
	            count[ch]++;
	        }

	        // Print the characters and their counts
	        System.out.println("Character counts:");
	        
	        for (int i = 0; i < 256; i++) 
	        {
	            if (count[i] > 0) 
	            {
	                System.out.println((char) i + " : " + count[i]);
	            }
	        }
	        
	       
	        
	}
}

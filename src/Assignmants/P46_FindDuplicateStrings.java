package Assignmants;

public class P46_FindDuplicateStrings {

	public static void main(String[] args) {
		
		//Find the duplicate strings in a given statement and remove them? 
        
		
		 String str = "java is easy and java is powerful";

	        String[] words = str.split(" ");  // split into words
	        String result = "";

	        
	        for (int i = 0; i < words.length; i++) 
	        {
	            boolean found = false;

	            // check if the word already appears in result
	            for (int j = 0; j < i; j++) 
	            {
	                if (words[i].equals(words[j])) 
	                {
	                    found = true;
	                    break;
	                }
	            }

	            // if not found earlier, add it to result
	            if (!found) 
	            {
	                result = result + words[i] + " ";
	            }
	            
	        }

	        System.out.println("Original: " + str);
	        System.out.println("After removing duplicates: " + result.trim());
	        
	        
	        
	        
//       String s="welcome to java selenium and python selenium";
//       
//       String[] word=s.split(" ");
//       
//       String result="";
//       
//       for(int i=0;i<word.length;i++)
//       {
//       	boolean found=false;
//       	
//       	for(int j=0;j<i;j++)
//       	{
//       		if(word[i].equals(word[j]))
//       		{
//       			found=true;
//       			break;
//       		}
//       	}
//       	
//       	if(found==false)
//       	{
//       		result=result+word[i]+" ";
//       	}
//       }
//		
//       System.out.println(s);
//       System.out.println(result.trim());
	        
	        
	        
	        
	}

}

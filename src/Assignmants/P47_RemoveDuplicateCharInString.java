package Assignmants;

public class P47_RemoveDuplicateCharInString {

	public static void main(String[] args) {
		
		//Find and remove the duplicate characters from a given string and print ?
		
				String s="programming";
				
				String result="";
				
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
					
					if(result.indexOf(ch)==-1)
					{
						result=result+ch;
					}
				}

				System.out.println(s);
				System.out.println(result);
	}

}

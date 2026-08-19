package Assignmants;

public class P41_CountVowelsInProgram {

	public static void main(String[] args) {
		
		
		//Count of vowels and non vowels Program: 
		
//				String a = "welcome"; 
//				int vowels = 0; 
//				int nonVowels = 0; 
//				for (int i = 0; i < a.length(); i++) 
//				{ 
//				char ch = a.charAt(i); 
//				       if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' 
//						|| ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' 
//						|| ch == 'U') 
//						{
//							vowels++; 
//						} 
//						else 
//						{ 
//						nonVowels++; 
//						} 
//				} 
//				System.out.println("Count of vowels is "+vowels); 
//				System.out.println("Count of Non Vowels is "+nonVowels); 

				
				
		String s="welcome";
		
		int vowel=0;
		int nonvowel=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='A' || ch=='a' ||ch=='E' || ch=='e' ||ch=='I' 
			|| ch=='i' ||ch=='O' || ch=='o' ||ch=='U' || ch=='u')
			{
				vowel++;
			}
			else
			{
				nonvowel++;
			}
			
		}
		
		System.out.println(vowel);
		System.out.println(nonvowel);
		
		
		
//        String s="welcome";
//		
//		s=s.toLowerCase();
//		
//		int vowel=0;
//		int nonvowel=0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
////			if(ch>='a' && ch<='z')
////			{
//			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
//				{
//				vowel++;
//			}
//			else
//			{
//				nonvowel++;
//			}
////			}
//		}
//		
//		System.out.println(vowel);
//		System.out.println(nonvowel);
		
		
		
		
		
	}

}

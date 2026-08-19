package Assignmants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P44_ExamplePrograms {

	public static void main(String[] args) {
		
		
		
       //1.Write a Java program to add two matrix? 
		
//		int a[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}}; 
//		int b[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}}; 
//		//creating another matrix to store the sum of two matrices 
//		int c[][] = new int[3][3]; 
//		//adding and printing addition of 2 matrices 
//		for (int i = 0; i < 3; i++) 
//		{
//			for (int j = 0; j < 3; j++) 
//			{
//				c[i][j] = a[i][j] + b[i][j]; 
//				System.out.print(c[i][j] + " "); 
//		} 
//		System.out.println(); 
//		}
		
//-------------------------------------------------------------------------------------------------
		
		
		//2.Write a Java program to multiply two matrix? 
		
//		int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}; 
//		int b[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}; 
//		
//		//creating another matrix to store the multiplication of two matrices 
//		int c[][] = new int[3][3];  
//		
//		//multiplying and printing multiplication of 2 matrices  
//		for(int i = 0; i < 3; i++) 
//		{ 
//			for(int j = 0; j < 3; j++) 
//			{
//				c[i][j] = 0;  
//				
//				for(int k = 0; k < 3; k++) 
//				{ 
//		      
//					c[i][j] += a[i][k] * b[k][j]; 
//				}  
//				System.out.print(c[i][j] + " "); 
//			}  
//			System.out.println(); 
//		}
		
//-----------------------------------------------------------------------------------------------------------------------		
		
		//3.Write a Java program to compare two strings? 
		
//		Scanner sc = new Scanner(System.in); 
//		System.out.println("Enter first string"); 
//		String first = sc.next(); 
//		System.out.println("Enter second string"); 
//		String second = sc.next(); 
			
//			String first="welcome";
//			String second="welcome";
//		compare(first,second); 
//		} 
//		public static void compare(String s1, String s2)
//		{ 
//		if(s1.compareTo(s2)==0) 
//		{ 
//		System.out.println("Strings are equal"); 
//		} 
//		else 
//		{ 
//		System.out.println("Strings are not equal"); 
//		}
 
//-----------------------------------------------------------------------------------------------------------------------		
		
		//4.How to find whether a String ends with a specific character or text using Java program? 
		
//		 String s1 = "Java is a programming language"; 
//		 
//		 //Check if string ends with particular character  
//		 boolean endsWithCharacter = s1.endsWith("e"); 
//		 
//		 System.out.println("String ends with character 'e': " + endsWithCharacter); 
//		
//		 //Check if string ends with particular text  
//		 boolean endsWithText = s1.endsWith("java"); 
//				
//		 System.out.println("String ends with String 'lang': " + endsWithText); 

//-----------------------------------------------------------------------------------------------------------------------		
		
		//5. Write a Java program to print date and time? 
		
//		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		
//		LocalDateTime now=LocalDateTime.now();
//		System.out.println(df.format(now));
		
		
//--------------------------------------------------------------------------------------------------------------------------
		
		
		//6.In the given String, remove the white spaces, reverse it and print only the odd position characters? 
		
//				String s="welcome to java";
//				String s1=s.replaceAll(" ","");
//				
//				System.out.println(s1);
//				
//				String rev="";
//				
//			
//				for(int i=s1.length()-1;i>=0;i--)
//				{
//					rev=rev+s1.charAt(i);
//				}
//			
//				System.out.println(rev);
//				
//				
//				
//				String odd="";
//				
//				for(int i=0;i<rev.length();i++)
//				{
//					if(i%2!=0)
//					{
//						odd=odd+rev.charAt(i);
//					}
//				}
//				
//				System.out.println(odd);
		
		
//------------------------------------------------------------------------------------------------------------------------------
		
		//7.In a given string, change few characters to upper case
		
//				String s="welcome to java";
//				
////				String s1=s.substring(0,10).toUpperCase();
////				
////				System.out.println(s1);
//				
//				String result="";
//				
//				for(int i=0;i<s.length();i++)
//				{
//					if(i==0 || i==s.length()-1 || i==2)
//					{
//						result+=Character.toUpperCase(s.charAt(i));
//					}
//					else
//					{
//						result+=s.charAt(i);
//					}
//				}
//
//			
//			   System.out.println(result);
		

//------------------------------------------------------------------------------------------------------------------
		
		//8.Use split method to print each word of a statement?
		
//		String s="welocme to java";
//		
//		String[] word=s.split(" ");
//		
//		for(String w:word)
//		{
//			System.out.println(w);
//		}
		
//----------------------------------------------------------------------------------------------------------------------
		
		
		
		
		
		
	}	

}

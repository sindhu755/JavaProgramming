package Assignmants;

import java.util.Scanner;

public class P28_Reverse_each_word_in_a_string {
	
	public static void main(String[] args)
	{
		
		//approach1
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		
		String str=sc.nextLine();
		
		
		String[] word=str.split(" ");  //splitting string into words
		
		String revstr="";
		
		for(String w:word)
		{
			String revword="";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				
				revword=revword+w.charAt(i);
			}
			
			revstr=revstr+revword+" ";
		}
		
		System.out.println(revstr);
		
		
		
		//approach2
		
//		String str="welcome to java selenium";  //original string
//		
//		String[] word=str.split("\\s");
//		
//		String revword="";
//		
//		for(String w:word)
//		{
//			StringBuilder sb=new StringBuilder(w);   // or we can use StringBuffer
//			sb.reverse();
//			
//			revword=revword+sb.toString()+" ";
//		}
//		
//		System.out.println(revword);
		
		
		
	}

}

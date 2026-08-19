package Assignmants;

import java.util.Scanner;

public class P05_CheckStringIsPalindromeorNot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string:");
		
		String name=sc.next();
		String org_name=name;
		
		String rev="";
		
		int len=name.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}

		
		if(org_name.equals(rev))
		{
			System.out.println("it's a palindrome:"+org_name);
		}
		else
		{
			System.out.println("it's not a palindrome:"+org_name);
		}
		
		
	}

}

	



/*
 char a[]=name.toCharArray();
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
*/

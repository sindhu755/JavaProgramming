package Assignmants;

import java.util.Scanner;

public class P39_DuplicateCountInArray {

	public static void main(String[] args) {
		
		//Find the duplicate count in an array Program: 
		
//		int n, count=0; 
//		Scanner s = new Scanner(System.in); 
//		System.out.print("Enter no. of elements you want in array: "); 
//		n = s.nextInt(); 
//		int a[] = new int[n]; 
//		System.out.println("Enter all the numbers: "); 
//		for (int i = 0; i < n; i++) 
//		{ 
//		a[i] = s.nextInt(); 
//		} 
//		
//		for (int i = 0; i < n; i++) 
//		{ 
//		for (int j = i + 1; j < n; j++) 
//		  { 
//			if(a[i]==a[j]) 
//			{
//				count++; 
//		    } 
//		  }
//		} 
//		System.out.println(count); 
//		 
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numbver of arrays:");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	System.out.println("enter array:");
	int count=0;
	
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
	}
	
	System.out.println(count);
	
	
	
	
	
	}

}

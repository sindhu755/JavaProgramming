package Assignmants;

import java.io.IOException;

public class P42_SumOfEvenOddNumber {
	
	
	public static void main(String[] args) throws IOException 
	{
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<=100;i++)
		{
//			int rem=i%10;
			
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
		}
		
		
		System.out.println(even);
		System.out.println(odd);
		
		
		
//		Sum of the odd and even number Program: 
//			int oddCount = 0,evenCount=0;
//			
//			for (int i = 1; i <= 100; i++) 
//			{
//				if (i % 2 == 1) 
//				{ 
//			oddCount= oddCount + i; 
//			   } 
//			else { 
//			evenCount=evenCount+i; 
//			} 
//			} 
//			System.out.println("Count of odd number is "+oddCount); 
//			System.out.println("Count of even number is "+evenCount); 

		
	}

}

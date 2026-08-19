package Assignmants;

import java.io.IOException;

public class P36_Triangle_with_stars {
	
	public static void main(String[] args) throws IOException 
	{
		
		//Print Reverse triangle without Space Program: 

		
		for(int i=1; i<=5; i++)   //for(int i=0; i<=5; i++)
		{
			for(int j=5; j>=i; j--)   
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		

		//Print Triangle with Stars Program: 

//		for(int i=5; i>=0; i--)
//		{
//			for(int j=5; j>=i; j--)
//			{
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		

		
	}

}

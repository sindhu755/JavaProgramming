package Assignmants;

import java.util.Scanner;

public class P43_ArmstrongNumber {

	public static void main(String[] args) {
		
		int c=0,a,temp; 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number"); 
		int num = sc.nextInt(); 
		temp = num; 
		while(num>0)
		{
			a=num%10; num=num/10; 
		    c=c+(a*a*a); 
		} 
		
		if(temp==c) 
		{  
		System.out.println(temp + " is an Armstrong number"); 
		}
		else 
		System.out.println(temp + " is not an armstrong number"); 

			
			
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter a number:");
//			int num=sc.nextInt();
//			
//			int temp=num;
//			int total=0,n;
//			while(num>0)
//			{
//				n=num%10;
//				num=num/10;
//				total=total+(n*n*n);
//				
//			}
//			
//			
//			if(temp==total)
//			{
//				System.out.println("armstrong number");
//			}
//			else
//			{
//				System.out.println("not a armstrome number");
//			}
			

	}

}

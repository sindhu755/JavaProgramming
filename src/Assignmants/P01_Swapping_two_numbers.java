package Assignmants;

public class P01_Swapping_two_numbers {

	public static void main(String[] args) 
	{
		

		int a=10, b=20;
//		
//		
		System.out.println("before swapping a value:"+a);
		System.out.println("before swapping b value:"+b);
//		
		//logic 1- using temporary variable
//		int temp=a;
//		a=b;
//		b=temp;
//		
		
		//logic 2- using + and - operators
//		a=a+b;  //10+20=30
//		b=a-b; //30-20=10
//		a=a-b; //30-10=20

		//logic 3 - using * and /, only if values are not zero
//		a=a*b;  //10*20=30
//		b=a/b; //30/20=10
//		a=a/b; //30/10=20
//		
		//logic4 - using bitwise XOR(^) operator
//		a=a^b;  //10^20=30
//		b=a^b; //30^20=10
//		a=a^b; //30^10=20
		
		//logic 5 - single statement
		b= a+b-(a=b);

		
		System.out.println("after swapping a value:"+a);
		System.out.println("after swapping b value:"+b);
		
		
		
		
	}

}

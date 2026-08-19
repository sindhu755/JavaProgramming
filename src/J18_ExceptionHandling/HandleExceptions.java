package J18_ExceptionHandling;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("programm started");
		
	
		System.out.println("enter number1:");  //100
		int num1=sc.nextInt();
		
		System.out.println("enter number2:");  //0
		int num2=sc.nextInt();
		
		try
		{
		System.out.println(num1/num2);  //ArithmeticException 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalide input");
		}
		
	
		System.out.println("program completed");
		System.out.println("program exited");
		

	}

}

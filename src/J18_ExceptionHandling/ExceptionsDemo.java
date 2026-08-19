package J18_ExceptionHandling;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("programm started");
		
		//Example1
		/*System.out.println("enter number1:");  //100
		int num1=sc.nextInt();
		
		System.out.println("enter number2:");  //0
		int num2=sc.nextInt();
		
		System.out.println(num1/num2);  //ArithmeticException 
		*/
		
		
		//Example2
		/*int a[]=new int[5];
		
		System.out.println("enter the position(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("enter a value:");
		int value=sc.nextInt();
		
		a[pos]=value;  //ArrayIndexOutOfBoundsException
		
		System.out.println(a[pos]);
		*/
		
		
		//Example3
		/*String s="welcome";
		int num=Integer.parseInt(s);  //NumberFormatException
		System.out.println(num);
		*/
		
		
		//Example4
		String s=null;  
		System.out.println(s.length());  //NullPointerException
		
		
		System.out.println("program completed");
		System.out.println("program exited");
		

	}

}

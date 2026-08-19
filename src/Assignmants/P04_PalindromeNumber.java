package Assignmants;
import java.util.Scanner;

public class P04_PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
		if(rev==org_num)
		{
			System.out.println("it's a palindrome number"+org_num);
			
		}
		else
		{
			System.out.println("it's not a palindrome number"+org_num);
		}
			
		
		

	}

}

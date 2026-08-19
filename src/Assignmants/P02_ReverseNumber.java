package Assignmants;
import java.util.Scanner;

public class P02_ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		
		//using algorithm
		
//		int num=1234;
//		int rev=0;
//		
//		while(num!=0)
//		{
//			rev=rev*10 + num%10;  //(0*10)+1234%10=4   4*10=40+123%10=43  43*10=430+12%10=432  432*10=4320+1%10=4321
//			num=num/10; //1234/10=123  123/10=12  12/10=1  1/10=0
//		}
//		
//		System.out.println("Reverse number is:"+rev);
//				

		//using StringBuffer class
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
		
		
		//using StringBuilder class
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		
		System.out.println("Reverse number is:"+rev);
		
		
	}

}

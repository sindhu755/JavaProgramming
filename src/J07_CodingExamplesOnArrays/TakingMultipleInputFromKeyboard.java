package J07_CodingExamplesOnArrays;
import java.util.Scanner;


public class TakingMultipleInputFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Enter a first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter a second number:");
		int num2=sc.nextInt();
		
		System.out.println("addition of two numbers:"+(num1+num2));
		*/
		
		System.out.println("ente a name:");
		String name=sc.next();
		System.out.println("name:"+name);
		
		System.out.println("Enter a age:");
		int age=sc.nextInt();
		System.out.println("age:"+age);
		
		System.out.println("unknown value:");
		Object value=sc.next();
		System.out.println("value:"+value);
		

	}

}

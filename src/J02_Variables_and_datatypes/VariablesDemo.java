package J02_Variables_and_datatypes;

public class VariablesDemo
{
	public static void main(String[] args) 
	{
		//int a;  //declaration
		//a=100; //assignment
		
		/*int a=100; //declaration and assignment
		System.out.println(a);
		 
		a=200;
		System.out.println(a); 
		*/
		
		//approach1 - if all the variables belongs to different data types
		/*int a=100;
		int b=200;
		int c=300;
		*/
		
		//approach2 - if all the variables are belongs to same data type
		/*int a,b,c;
		a=100;
		b=200;
		c=300;
		*/
		
		//approach3 - if all the variables are belongs to same data type
		int a=100,b=200,c=300;
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		System.out.println("value of c is:"+c);
		
		System.out.println(a+" "+b+" "+c);
		
		
	}
}

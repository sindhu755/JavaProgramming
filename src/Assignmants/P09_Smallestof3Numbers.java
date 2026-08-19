package Assignmants;

public class P09_Smallestof3Numbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a=10, b=20, c=30;
		
//		if(a<b && a<c)
//		{
//			System.out.println("a is smallest number");
//		}
//		else if(b<a && b<c)
//		{
//			System.out.println("b is smallest number");
//		}
//		else
//		{
//			System.out.println("c is smallest numbner");
//		}

		
		int x=(a<b)?((a<c)?a:c) :((b<c)?b:c);
//		int x=a<b?a:b;  //largest of a and b
//		int x1=c<x?c:x; //largest of c and x
		System.out.println(x);
	}

}

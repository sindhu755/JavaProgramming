package J12_OOPS_Polymorphism_Encapsulation_Overloading;

public class Adder {
	
	int a=10;
	int b=20;
	
	void sum()  //1
	{
		System.out.println(a+b);
	}
	
//	void sum()  //invalid
//	{
//		return(a+b);
//	}
	
	void sum(int x,int y)  //2
	{
		System.out.println(x+y);
	}

	void sum(int x,double y)  //3
	{
		System.out.println(x+y);
	}
	
	void sum(double x,int y)  //4
	{
		System.out.println(x+y);
	}
	
	void sum(int x,int y,int z)  //5
	{
		System.out.println(x+y+z);
	}
}

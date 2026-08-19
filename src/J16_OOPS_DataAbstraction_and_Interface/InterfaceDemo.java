package J16_OOPS_DataAbstraction_and_Interface;

interface Shape
{
	int length=10;  //static and final
	int width=20;   //static and final
	
	
	void circle(); //abstract method
	
	default void sqaure()  //default method
	{
		System.out.println("this is sqaure- default method");
	}
	
	static void rectangle()  //static method
	{
		System.out.println("this is rectangle- static method");
	}
}

public class InterfaceDemo implements Shape
{
	
	public void circle()  //abstract method (we need to make it as public whenever we are implementing abstract method in class)
	{
		System.out.println("this is circle- abstract method");
	}
	
	void triangle()
	{
		System.out.println("this is triangle");
	}

	int x=100,y=200;
	
	public static void main(String[] args) 
	{
		
		//scenario1
		InterfaceDemo obj=new InterfaceDemo();
		
		obj.circle();  //abstract method
		obj.sqaure(); //default method
		Shape.rectangle();  //static method can directly access from interface
		obj.triangle();
		
		System.out.println(obj.x+obj.y);
		
		
		//scenario2
//		Shape sp=new InterfaceDemo();
//		
//		sp.circle(); //abstract method
//		sp.sqaure(); //default method
//		Shape.rectangle(); //static method can directly access from interface
//		
//		//sh.triangle();  //we can not access bcoz it is class method
//		
//		System.out.println(Shape.length*Shape.width);  //accessing static variables directly

//		System.out.println(sh.x+sh.y); //we cannot access bcoz it belongs class 
	}

}

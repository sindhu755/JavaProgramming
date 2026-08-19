package J15_OOPS_MethodOverriding_final_superKeywords;

public class Animal {
	
	String color="white";
	
	void eat()
	{
		System.out.println("eating");
	}

}

class Dog extends Animal
{
	String color="black";
	void displaycolor()
	{
		System.out.println(super.color);
	}
	
	void eat()
	{
		//System.out.println("eating bread");
		super.eat();
	}
	
}




//public class Parent
//{
//    String color="black";
//    
//    void m1()
//    {
//        System.out.println("this is parent class method m1");
//    }
//}
//
//class Child extends Parent {
//    
//    String color="white";
//    
//    void testcolor()
//    {
//        System.out.println(super.color);
//    }
//    
//    void m1()
//    {
//        super.m1();
//    }
//}


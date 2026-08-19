package J19_Upcasting_Downcasting;

class Parent
{
	String name="welcome";
	
	void m1()
	{
		System.out.println("this is m1 method from parent");
	}
}

class Child extends Parent
{
	int id=100;
	
	void m2()
	{
		System.out.println("this is m2 method from child");
	}
}

public class TypeCastingObjects1 {

	public static void main(String[] args) {
		
		/*Child c=new Child();
		
		System.out.println(c.name);  //parent
		c.m1(); //parent
		
		System.out.println(c.id); //child
		c.m2(); //child
		*/
		
		Parent p=new Child();  //up casting
		
		System.out.println(p.name);
		p.m1();
		
//		System.out.println(p.id); //we can not access
//		p.m2();  //we can not access
		
		

	}

}
